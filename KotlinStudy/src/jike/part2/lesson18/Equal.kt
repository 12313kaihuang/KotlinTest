package jike.part2.lesson18

import java.io.File
import java.lang.StringBuilder

//typealias 类似与c的typedefine
public typealias ArrayList<T> = java.util.ArrayList<T>
public typealias A = File

fun main() {
    val string = "string"
    val javaString = java.lang.String("string")
    val newString = StringBuilder("string").toString()

    //比较对象 同java的==
    println(string === newString)
    //比较值 同java的equals
    println(string == newString)
}