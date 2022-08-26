package com.amitb.repository;

import com.amitb.domain.Preference;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.Optional;

@Repository
public interface PreferenceRepository extends CrudRepository<Preference, Integer> {

    Optional<Preference> findByUserId(Integer userId);

}
