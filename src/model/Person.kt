package com.imran.model
import org.bson.types.ObjectId


data class  Person(val _id:String = ObjectId().toString(), val name:String, val address:String)