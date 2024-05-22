package com.learning.data.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.experimental.Accessors;

@Entity
@Table(name = "Person")
@Data
@Accessors(chain = true)
public class Person {

  @Id
  private Long id;
  private String name;
  private Integer age;
  private String club;
  private String nationality;

}