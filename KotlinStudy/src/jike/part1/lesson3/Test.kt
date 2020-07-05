package jike.part1.lesson3

import kotlin.reflect.KClass

/**
 *@author Hy
 *created on 2020/05/13 21:13
 *
 * kotlin java兼容性
 **/
fun main() {

    //需要.java
    testClass(JavaMain::class.java)
    //不需要
    testClass(KotlinMain::class)

    //由于in在Kotlin中是关键字 所以需要用``括起来
    println(JavaMain.`in`)
}

//Java
fun testClass(claz: Class<JavaMain>) {
    println(claz.simpleName)
}

//Kotlin
fun testClass(clazz: KClass<KotlinMain>) {
    println(clazz.simpleName)
}