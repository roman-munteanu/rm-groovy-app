package com.munteanu.rmgroovyapp.controller

import com.munteanu.rmgroovyapp.model.UserProfile
import com.munteanu.rmgroovyapp.service.UserProfileService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserProfileController {

  @Autowired
  UserProfileService userProfileService

  @GetMapping("/users")
  List<UserProfile> all() {
    userProfileService.findAll()
  }
}
