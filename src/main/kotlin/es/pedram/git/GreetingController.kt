package es.pedram.git

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    // bar
    @GetMapping
    fun greeting(@RequestParam name: String): String {
        return "Hello $name"
    }
}
