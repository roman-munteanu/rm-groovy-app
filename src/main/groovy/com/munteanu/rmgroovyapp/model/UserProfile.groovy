package com.munteanu.rmgroovyapp.model

import groovy.transform.EqualsAndHashCode

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "users")
@EqualsAndHashCode(includeFields = true)
class UserProfile {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id

  @Column(name = "full_name")
  String fullName

  @Column(name = "email", nullable = false, unique = true)
  String email

  @Column(name = "password", nullable = false)
  String password
}
