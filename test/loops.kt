package com.example.test

fun main(){

    var rebels = arrayListOf("leiah","luke","hansolo","mon montana")

    val rebelsvehicle = hashMapOf("solo" to "millenium falcon","luke" to "land speeder", "boba fett" to "Rocket Pack")

    for (rebel in rebels){
        println("name : $rebel")
    }
    for((name,vehicle) in rebelsvehicle){
        println("$name forgot his  key for the $vehicle")
    }

    var x = 10
    while (x>0){
        println(x)
        x--
    }


    var  y = 0
    while (y <= 10){
        print(y)
        y++
    }
}