package com.controller


import com.alibaba.fastjson.JSONObject
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

@RestController
 class indexController {

  @GetMapping(value = Array("/index"))
  def index(): JSONObject = {
    val json = new JSONObject
    json.put("code", 0)
    json.put("data", "success")
    json
  }
  def insertList():JSONObject={
    val json = new JSONObject
    json.put("code", 0)
    json.put("data", "success")
    json
  }
}
