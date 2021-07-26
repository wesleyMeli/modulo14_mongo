package com.meli.modulo14_mongo.repository;

import com.meli.modulo14_mongo.domain.Turn;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TurnRepository extends MongoRepository<Turn, String> {
    List<Turn> findByTurnStatus_NameAndDays(String name, LocalDate date);

    List<Turn> findByTurnStatusId(Integer id);

    List<Turn> findByTurnStatusIdAndDays(Integer id, LocalDate days);

    List<Turn> findByTurnStatusIdAndDiaryDentistId(Integer turnStatusId, Integer dentistId);
}
