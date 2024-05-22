/*
 * Copyright (c) 2023. Dandelion tutorials
 */

package com.learning.data.jpa.data;

import com.learning.data.jpa.model.Person;
import java.util.List;
import java.util.stream.Collectors;

public final class TestDataStorage {

  public static List<Person> PersonsByNationality(String nationality) {
    return Persons().stream().filter(Person -> nationality.equals(Person.getNationality()))
        .collect(Collectors.toList());
  }

  public static List<Person> PersonsByClub(String nationality) {
    return Persons().stream().filter(Person -> nationality.equals(Person.getClub()))
        .collect(Collectors.toList());
  }

  public static List<Person> Persons() {
    return List.of(
        new Person().setId(1L).setName("Vivek Singh").setAge(31).setClub("Delhi").setNationality("India"),
        new Person().setId(2L).setName("Manoj").setAge(24).setClub("Mumbai").setNationality("US"),
        new Person().setId(3L).setName("Jacky").setAge(23).setClub("Pune").setNationality("UK"),
        new Person().setId(4L).setName("Mahesh").setAge(34).setClub("Punjab").setNationality("India")
    );
  }

}