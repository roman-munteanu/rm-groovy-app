package com.munteanu.rmgroovyapp.dao

import com.munteanu.rmgroovyapp.model.UserProfile
import org.springframework.data.jpa.repository.JpaRepository

interface UserProfileDao extends JpaRepository<UserProfile, Long> {
  Optional<UserProfile> findByEmail(String email)
}
