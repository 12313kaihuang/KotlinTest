package jike.lesson4

/**
 *@author Hy
 *created on 2020/05/13 21:36
 **/
fun main() {
    test1()
}


fun test1() {
    val age = 18
    val name = "zhang san"

    //println没有重载此方法
    //println("我叫%d，今年%d岁",name,age)
    println("我叫$name，今年$age 岁")

    //或者
    println(String.format("我叫%s，今年%d岁", name, age))
}