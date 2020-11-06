package com.example.SimpleControllerKotlin

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.lang.Math.exp
import java.lang.Math.random

@RestController
class SimpleController {
    var table = IntArray(10,{x->x*x})
    var array1 = Array(5,{table})

    @RequestMapping("")
    fun info():String{
        val x = random()
        return "info 12345"
    }
    @RequestMapping("/next")
    fun nextFun():Double{
        return 2.0
    }
    @RequestMapping("linearFunction")
    //y = a*x + b
    fun linearFunction(
            @RequestParam("x") x:Double,
            @RequestParam("a",defaultValue = "2.0") a:Double,
            @RequestParam("b",defaultValue = "5.0") b:Double
    ):Double{
        return a*x+b
    }

    @RequestMapping("student/{id}")
    fun getStudent(
            @PathVariable("id") id: Int,
            @RequestParam("parameter") parameter: String):String{
        return "${id}: ${parameter} = "
    }

    @RequestMapping("array")
    fun getArray():IntArray{
        return table
    }

    @RequestMapping("array/{i}/{j}")
    fun getArrayValue(
            @PathVariable("i") i:Int,
            @PathVariable("j") j:Int   ):Int{

        return table[i]
    }
}
