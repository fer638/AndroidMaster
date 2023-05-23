package com.jorgefer.androidmaster.sintaxis

fun main(){
    resultado(value = "dadd")
}

fun resultado(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) print("Holiwi")
    }
}

fun getSemester(month: Int) = when(month){
       in 1..6 ->  "Primer semestre"
        in 7..6 ->  "Segundo seemstre"
        !in 1..12 ->  "Semestre no valido"
    else -> "dawaaa"
}

fun getTrimester(month:Int){
    when(month) {
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6 -> println("Segundo trimestre")
        7, 8, 9 -> println("Tercer trimestre")
        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("Trimestre no valido")
    }
}

fun getWhen(month:Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Maroz")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> println("noviembre")
        12 -> println("diciembre")
        else -> println("No es un mes")
    }
}

fun getMonth(month:Int){
    if(month == 1){
        println("Enero")
    }else if(month == 2){
        println("Febrero")
    }else if(month == 3){
        println("Marzo")
    }else if(month == 4){
        println("Abril")
    }else if(month == 5){
        println("Mayo")
    }else if(month == 6){
        println("Junio")
    }else if(month == 7){
        println("Julio")
    }else if(month == 8){
        println("Agosto")
    }else if(month == 9){
        println("Septempre")
    }else if(month == 10){
        println("Octubre")
    }else if(month == 11){
        println("Noviembre")
    }else if(month == 12) {
        println("Diciembre")
    }else{
        println("El mes no exite")
    }

}