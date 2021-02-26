package com.example.test

fun main(){
    val a = 2
    val b = 3
    val c = 5
    if (a==b){
        print("a and b are equal and they are $a  ")
    }
    else{
        print("they are not equal ")
    }
    if (a != c){
        print("the $a and $c are not equal ")
    }


    val weather = 34

    if (weather <= 20){
        println("cloudy ")
    } else if (weather >= 20 && weather <= 30){
        print("clear")
    }else if (weather > 30 && weather <= 35){
        print("sunny ")
    }else if (weather > 35 ){
        print("Hot ")
    }

    val ishungry = false
    val isbored = true

    if (isbored || ishungry){
        println("   lets have some pizza !!!")
    }
    var x = 2
    when (x) {
        1 -> print("x == 1")
        2 ->  print("x == 2")
        else -> print("they are not 1 and 2")
    }
}
