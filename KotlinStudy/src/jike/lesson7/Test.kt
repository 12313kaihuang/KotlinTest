package jike.lesson7

/**
 *@author Hy
 *created on 2020/05/14 10:49
 *
 * Lambda闭包
 **/
fun main() {
    echo.invoke("ZHangTao")
    echo("ZhangTao")
}

//闭包声明 最多只能22个参数 超出会报错
val echo = { name: String -> println(name) }
