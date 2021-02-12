package com.example.SpringTests

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {
    @RequestMapping("/")
    fun index() = "index1"

    @RequestMapping("add")
    fun add(@RequestParam("a") a: Int, @RequestParam("b") b: Int):Int{
        return a+b
    }
}
