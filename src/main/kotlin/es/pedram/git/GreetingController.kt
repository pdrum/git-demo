package es.pedram.git

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping
    fun greeting(): String {
        return "Hello world!!!!"
    }
}
