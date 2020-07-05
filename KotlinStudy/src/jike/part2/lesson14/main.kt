package jike.part2.lesson14

/**
 * Kotlin 的循环语法
 */
fun main() {
    print5()

    val list = arrayListOf<String>("a", "b", "c", "d")
    for (str in list) {
        println(str)
    }

    //解构
    for ((index, str) in list.withIndex()) {
        println("第${index}个值为$str")
    }
}

//1-10
fun print1() {
    for (i in 1..10) {
        println(i)
    }
}

//1-9
fun print2() {
    for (i in 1 until 10) {
        println(i)
    }
}

//10-1
fun print3() {
    for (i in 10 downTo 1) {
        println(i)
    }
}

//1 3 5 7 9
fun print4() {
    for (i in 1..10 step 2) {
        println(i)
    }
}

//0-9
fun print5() {
    //repeat是一个高阶函数
    repeat(10) {
        println(it)
    }
}
