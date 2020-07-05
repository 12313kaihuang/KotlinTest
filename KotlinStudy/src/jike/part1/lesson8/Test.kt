package jike.part1.lesson8

/**
 *@author Hy
 *created on 2020/05/14 10:56
 *
 * 高阶函数
 **/
fun main() {

    //函数是一等公民
    //Kotlin的lambda是一个匿名函数
    val runnable = Runnable { println("Runnable::run") }
    val function: () -> Unit
    function = runnable::run

    onlyif(true, function)
}

//高阶 函数(Lambda)的参数是函数(Lambda)
fun onlyif(isDebug: Boolean, block: () -> Unit) {
    if (isDebug) block()
}

//可以采用inline修饰方法，这样方法在编译时就会拆解方法的调用为语句调用，
//进而减少创建不必要的对象