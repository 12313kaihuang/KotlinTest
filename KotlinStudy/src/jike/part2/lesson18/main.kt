package jike.part2.lesson18

//方法名本身不合法，然是通过反引号可以让其变得合法
//可以起到对于java代码中屏蔽掉此方法的作用，因为java中没有这种用法。
fun `1234`(){
    println("test")
}

fun ` `(){
    println("test")
}

fun `  `(){
    println("test")
}

// 反引号
fun main() {
    `1234`()
    ` `()
}