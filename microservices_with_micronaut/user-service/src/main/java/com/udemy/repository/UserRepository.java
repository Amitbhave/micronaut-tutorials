package com.udemy.repository;

import com.udemy.model.User;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findAll();

}
