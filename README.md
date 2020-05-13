# ktor-kmongo-koin-exmaple

This example will help you to understand following
1. [ktor](https://ktor.io/) : Ktor is a framework for building asynchronous servers and clients in connected systems using the powerful Kotlin programming language.
2. [kmongo](http://litote.org/kmongo/) : a Kotlin toolkit for Mongo
3. [koin](https://insert-koin.io/) : A pragmatic lightweight dependency injection framework for Kotlin developers.

Note: kmongo 4.0 needs java-8 compilation
you may see this error if your setting is not proper

``Cannot inline bytecode built with JVM target 1.8 into bytecode that is being built with JVM target 1.6. Please specify proper '-jvm-target' option``

The solution is to add following line in your build.gradle file [ref](https://kotlinlang.org/docs/reference/using-gradle.html)


```compileKotlin {
    kotlinOptions {
        jvmTarget = "1.8"
    }
} 
```