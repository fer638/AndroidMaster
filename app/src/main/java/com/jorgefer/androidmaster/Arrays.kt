package com.jorgefer.androidmaster

fun main(){
    var name:String = "Aris"
    var name1:String = "Aris"
    var name2:String = "Aris"
    var name3:String = "Aris"

    //indice 6
    //tamano 7
    val weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
    //modificar valores
    weekDays[0] = "holwta"

    //println(weekDays[0])

    //tamanos de array
    if(weekDays.size >= 8) {
        //println(weekDays[7])
    }else{
        println("no hay mas valores")
    }

    //bucles para array
    for(position in weekDays.indices){
        //println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex()){
        //println("la posiscion $position, contiene $value")
    }

    for(weekDay in weekDays){
        println("Ahora es $weekDay")

    }

}