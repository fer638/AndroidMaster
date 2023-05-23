package com.jorgefer.androidmaster.sintaxis

fun main(){
    mutableList()
}

fun mutableList(){
    var weekDays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    weekDays.add(index = 0, element =  "Jorge")
    //println(weekDays)

    if(weekDays.isEmpty()){
        //nada
    }else{
        weekDays.forEach{ println(it)}
    }

    if(weekDays.isNotEmpty()){
        weekDays.forEach{ print(it) }
    }
}



fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    //println(readOnly.size)
    //println(readOnly)
    //println(readOnly[0])
    //println(readOnly.last())

    //Filtrar
    val exanple = readOnly.filter { it.contains(other = "a")}
    println(exanple)

    //iterar
    readOnly.forEach{ weekDay -> println(weekDay)}
}