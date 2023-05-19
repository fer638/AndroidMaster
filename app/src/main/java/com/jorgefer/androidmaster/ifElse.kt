package com.jorgefer.androidmaster

fun main() {
    ifAnidado()
}

fun ifAnidado() {
    val animal = "dog"

    if (animal == "dog") {
        println("Es un perro")
    } else {
        println("No es un perro")
    }

    if (animal == "cat") {
        println("Es un gato")
    } else {
        println("No es un gato")
    }
}

fun ifBasico() {
    val name = "Aris"

    if(name == "Aris"){
        println("Oye la variable name es Aris")
    }
}