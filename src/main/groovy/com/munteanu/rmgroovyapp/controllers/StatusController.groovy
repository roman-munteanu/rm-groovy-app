package com.munteanu.rmgroovyapp.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class StatusController {

  @RequestMapping(value = "/status", method = RequestMethod.GET)
  String status() {
    "UP"
  }
}
