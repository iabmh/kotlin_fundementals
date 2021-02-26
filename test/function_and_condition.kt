package com.example.test

fun main(){

    fun feeling(mood: String = "angry"){
        if (mood == "angry"){
            print("please leave he is $mood right now")
        }else{
            print("lets talk ")
        }
    }
    feeling("happy")
}