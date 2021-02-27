package com.example.test

fun main(){

    var imperials = listOf("emperor","dark vader","boba fett","tarkin")
    println(imperials)
    println(imperials.sorted())
    println(imperials[2])
    println(imperials.last())
    println(imperials.contains("emperor"))

    var rebels = arrayListOf("leiah","luke","hansolo","mon montana")
    println(rebels.size)
    rebels.add("chewbacca")
    rebels.add(0,"lando")
    println(rebels)
    println(rebels.indexOf("luke"))
    rebels.remove("hansolo")
    println(rebels)

    val rebelsvehiclemap = mapOf("solo" to "millenium falcon","luke" to "Land speeder")

    println(rebelsvehiclemap["luke"])
    println(rebelsvehiclemap.get("solo"))
    println(rebelsvehiclemap.getOrDefault("leiah","this ship doest exist"))
    println(rebelsvehiclemap.values)

    val rebelsvehicle = hashMapOf("solo" to "millenium falcon","luke" to "land speeder", "boba fett" to "Rocket Pack")
    rebelsvehicle["luke"] = "xWinng"
    rebelsvehicle.put("leiah","tantiveIV")
    println(rebelsvehicle)
    rebelsvehicle.remove("boba fett")
    println(rebelsvehicle)
    println(rebelsvehicle.isEmpty())
}

