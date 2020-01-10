package com.workoutbook.controllers

import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}


@RestController
@RequestMapping(path = Array("/api"))
class WorkoutController {
  @GetMapping(path = Array("/workout"))
  def get(): String = {
     "hello world"
  }

}
