package com.jorgefer.androidmaster
val age:Int = 30


//VARIABLES
fun main() {
    showMyName(name = "Jorge")
    showMyAge()
    add(25, 76)
    val mySubstract = substract(10, 5)
    println(mySubstract)
}

fun showMyName(name:String){
    println("Mi nombre es $name")
}

fun showMyAge(currentAge:Int = 30){
    println("Tengo $currentAge anos")
}

fun add(firstNumber: Int, secondNumber:Int){
    println(firstNumber + secondNumber)
}

fun substract(firstNumber: Int, secondNumber: Int): Int = firstNumber - secondNumber


fun variablesAlfanumericas(){
    /*
*Variables Alfanumericas
*/
    //char

    val Example:Char = 'E'
    val Example2:Char = '2'
    val Example3:Char = '@'

    //String
    val stringExample:String = "Jorge"
    val stringExample2  = "Prueba de string 1"

    var stringConcatenada:String = "Hola"
    stringConcatenada = "Hola me llamo $stringExample y tengo $age anos"

    println(stringConcatenada)

    val exaple = age.toString()
}

fun variablesBoolenas(){
    //Boolean
    val booleanExample:Boolean = true
    val booleanExample2:Boolean = false
}

fun variablesNumericas(){
    /*
    *Variables Numericas
     */
    //Int
    var age2:Int = 30
    age2 = 40

    //Long
    val example:Long = 30

    //Float
    val floatexample:Float = 30.5f

    //Double
    val doubleExample:Double = 30.12121212

    println("Sumar:")
    println(age + age2)

    println("Restar:")
    println(age2 - age )

    println("Multiplicar:")
    println(age * age2)

    println("Division:")
    println(age2/age2)

    println("Modulo:")
    println(age%age2)
}
