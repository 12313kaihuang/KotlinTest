package jike.part2.lesson13

/**
 * Kotlin 解构
 *
 * @see User
 */
fun main() {
    val user = User(12, "name")
    //将user拆解为age、name两个变量
    val (age, name) = user
    println(age)
    println(name)

    //解构常用于map遍历
    val map = mapOf<String, String>("key" to "key1", "value" to "value1")
    for ((k, v) in map) {
        println("$k -- $v")
    }

}