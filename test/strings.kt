package com.example.test

fun main() {
    var str = "hola android"
    var multistring = """hello 
        |iam a fresher 
        |here for 
        |studying android
        |thankyou
    """.trimMargin()
    print(str)
    print (multistring)


    for (char in str){
        println(char)
    }


    val contentEquals = str.contentEquals("hola android")
    println(contentEquals)
    val contains = str.contains("android", true)
    println(contains)
    var u = str.toUpperCase()
    println(u)



    var numberstring = "57"
    val num = numberstring.toInt() + 5
    numberstring = num.toString().plus("only")
    print(numberstring)

    var subsequence = numberstring.subSequence(2, 6)
    println(subsequence)



    val name = "abbas"
    val studying = "iosDevelopment"
    val studyingin = "iroid"

    println("$name is studying $studying in $studyingin kochi")
    print("abbas is consist of ${name.length} charecters")
}