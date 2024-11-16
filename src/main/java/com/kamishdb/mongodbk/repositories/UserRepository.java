package com.kamishdb.mongodbk.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kamishdb.mongodbk.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
