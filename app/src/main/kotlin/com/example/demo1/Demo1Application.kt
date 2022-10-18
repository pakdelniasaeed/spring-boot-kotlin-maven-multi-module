package com.example.demo1

import com.example.NameService
import com.example.Users
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Demo1Application

fun main(args: Array<String>) {
    println(NameService.sayHello(Users().name))
    runApplication<Demo1Application>(*args)
}
