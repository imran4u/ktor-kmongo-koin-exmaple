package com.imran.controller

import com.imran.model.Person
import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.request.receive
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.post
import org.litote.kmongo.coroutine.CoroutineClient
import org.koin.ktor.ext.inject

const val DATABASE_NAME= "kmongo_koin"

fun Route.userRoute(){
    val client: CoroutineClient by inject()

    get("/users") {
        val users = client.getDatabase(DATABASE_NAME)
            .getCollection<Person>()
            .find()
            .toList()

        call.respond(HttpStatusCode.OK, users)

    }
    post("/users") {
        val user = call.receive<Person>()
       val result= client.getDatabase(DATABASE_NAME)
            .getCollection<Person>()
            .insertOne(user)

        call.respond(HttpStatusCode.OK)
    }
}