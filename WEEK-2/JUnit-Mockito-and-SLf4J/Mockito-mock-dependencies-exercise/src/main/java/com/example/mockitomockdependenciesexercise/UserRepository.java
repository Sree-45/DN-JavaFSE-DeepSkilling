package com.example.mockitomockdependenciesexercise;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
    List<User> findByName(String name);
}
