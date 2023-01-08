package es.pedram.git

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GitApplication

fun main(args: Array<String>) {
	runApplication<GitApplication>(*args)
}
