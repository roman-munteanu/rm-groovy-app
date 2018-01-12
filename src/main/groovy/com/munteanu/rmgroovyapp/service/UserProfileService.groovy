package com.munteanu.rmgroovyapp.service

import com.munteanu.rmgroovyapp.dao.UserProfileDao
import com.munteanu.rmgroovyapp.model.UserProfile
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service("UserProfileService")
class UserProfileService {

  private final UserProfileDao userProfileDao

  @Autowired
  UserProfileService(UserProfileDao userProfileDao) {
    this.userProfileDao = userProfileDao
  }

  List<UserProfile> findAll() {
    userProfileDao.findAll()
  }
}
