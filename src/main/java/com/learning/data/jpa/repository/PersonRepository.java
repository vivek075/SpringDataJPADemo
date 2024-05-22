package com.learning.data.jpa.repository;

import com.learning.data.jpa.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

  List<Person> findByClub(String club);
  List<Person> findByNationality(String nationality);

}