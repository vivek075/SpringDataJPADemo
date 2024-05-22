package com.learning.data.jpa;

import com.learning.data.jpa.config.RepositoryConfig;
import com.learning.data.jpa.data.TestDataStorage;
import com.learning.data.jpa.model.Person;
import com.learning.data.jpa.repository.PersonRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = RepositoryConfig.class)
@ExtendWith(SpringExtension.class)
class Junit5PersonTest {

  public static final Logger LOGGER = LogManager.getLogger(Junit5PersonTest.class);

  @Autowired  PersonRepository PersonRepository;

  @BeforeEach
  public void beforeEach() {
    LOGGER.info("Test script execution started with Junit 5");
  }

  @AfterEach
  public void afterEach() {
    LOGGER.info("Test script execution finished with Junit 5");
  }

  @Test
  public void testAllPersonsWithJunit5() {
    final Iterable<Person> allPersons = PersonRepository.findAll();
    LOGGER.info("List of Persons: {}", allPersons);

    Assertions.assertThat(allPersons)
            .usingRecursiveFieldByFieldElementComparatorIgnoringFields("id")
            .isEqualTo(TestDataStorage.Persons());
  }

  @Test
  public void testPersonsByNationalityWithJunit5() {
    final String nationality = "England";
    final Iterable<Person> PersonsByNationality = PersonRepository.findByNationality(nationality);
    LOGGER.info("List of Persons by nationality: {}", PersonsByNationality);

    Assertions.assertThat(PersonsByNationality)
            .usingRecursiveFieldByFieldElementComparatorIgnoringFields("id")
            .isEqualTo(TestDataStorage.PersonsByNationality(nationality));
  }

  @Test
  public void testPersonsByClubWithJunit5() {
    final String club = "Tottenham Hotspur";
    final Iterable<Person> PersonsByNationality = PersonRepository.findByClub(club);
    LOGGER.info("List of Persons by club: {}", PersonsByNationality);

    Assertions.assertThat(PersonsByNationality)
            .usingRecursiveFieldByFieldElementComparatorIgnoringFields("id")
            .isEqualTo(TestDataStorage.PersonsByClub(club));
  }
}