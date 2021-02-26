package com.example.test

fun main(args: Array<String>){
    fun choke(){
        print("hello guys welcome back")
    }

    fun add(first: Int,second: Int): Int{
        var sum : Int
        sum = first+second
        return sum
    }

    val add = add(10, 5)
    print(add)
}