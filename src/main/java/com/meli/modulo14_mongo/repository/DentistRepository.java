package com.meli.modulo14_mongo.repository;
import com.meli.modulo14_mongo.domain.Dentist;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DentistRepository extends MongoRepository<Dentist, String> {
}
