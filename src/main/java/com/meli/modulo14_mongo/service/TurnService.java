package com.meli.modulo14_mongo.service;

import com.meli.modulo14_mongo.domain.Turn;
import com.meli.modulo14_mongo.dto.PendingTurnDTO;
import com.meli.modulo14_mongo.repository.TurnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TurnService {
    private TurnRepository turnRepository;

    private final Integer COMPLETED_TURN_ID = 1;
    private final String PENDING_TURN = "Pendente";
    private final Integer RESCHEDULED_TURN_ID = 4;

    @Autowired
    public TurnService(TurnRepository turnRepository) {
        this.turnRepository = turnRepository;
    }


    public List<Turn> findCompletedTurns() {
        return turnRepository.findByTurnStatusId(COMPLETED_TURN_ID);
    }

    public List<Turn> findCompletedTurnsOnAGivingDay(LocalDate days) {
        return turnRepository.findByTurnStatusIdAndDays(COMPLETED_TURN_ID, days);
    }


    public List<PendingTurnDTO> getPendingTurnsByDay(LocalDate date) {
        List<Turn> turns = this.turnRepository.findByTurnStatus_NameAndDays(PENDING_TURN, date);

        if (turns.isEmpty())
            return new ArrayList<>();

        List<PendingTurnDTO> pendingTurnDTOs = new ArrayList<>();

        for (Turn turn : turns) {
            pendingTurnDTOs.add(turn.castToPendingTurnDTO());
        }
        return pendingTurnDTOs;
    }

    public List<Turn> findRescheduledDentistTurns(int dentistId) {
        return turnRepository.findByTurnStatusIdAndDiaryDentistId(RESCHEDULED_TURN_ID, dentistId);
    }

    public List<Turn> findRescheduledTurns() {
        return turnRepository.findByTurnStatusId(RESCHEDULED_TURN_ID);
    }
}