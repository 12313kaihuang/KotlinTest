package jike.lesson2

/**
 *@author Hy
 *created on 2020/05/13 20:58
 *
 * Kotlin最基础语法
 **/
//变量
var age:Int = 8

//定义一个不可变的变量  注意是变量不是常量
val name:String = "Tom"

//如果是可以推断出类型的变量则可以不指定类型
val name2 = "Tom"

fun main() {
    var name3 = "String"
    //可为null
    var name4:String? = null

    //name3 = name4  直接赋值会报错 因为String和String?是不同类型
    //如果需要赋值得用!!强制类型转换
    //name3 = name4!!
    //反过来是可以的
    name4 = name3

    printlen("kotin")
}

fun printlen(str:String):String {

    //kotlin 模板语法
    println("这个字符是：$str")

    return str
}