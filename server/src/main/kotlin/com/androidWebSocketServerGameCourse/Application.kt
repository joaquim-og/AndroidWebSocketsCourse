package com.androidWebSocketServerGameCourse

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.androidWebSocketServerGameCourse.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureSerialization()
        configureSockets()
        configureMonitoring()
        configureRouting()
    }.start(wait = true)

    println("TEST")
}
