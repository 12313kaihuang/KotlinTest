package jike.lesson5

/**
 *@author Hy
 *created on 2020/05/13 21:42
 *
 * 函数嵌套
 * 
 * 函数的特性语法
 * 嵌套语法
 * 扩展函数
 * Lambda闭包语法
 * 高阶函数
 * 内联函数
 **/
fun main() {
    print()  //Tom
    print("Bob") //Bob

    function()
}


//可以设置默认值来减少函数重载
fun print(name:String = "Tom"):String?{
    println("$name")
    return name
}

//函数嵌套
fun function(){
    val str = "hello"

    //用途：
    //某些条件下需要触发递归的函数
    //不希望被外部函数访问到的函数
    fun say(count: Int = 10) {
        println(count)
        if (count > 0) {
            say(count-1)
        }
    }
    say()
}