package jike.part2.lesson13

/**
 * Kotlin 解构  --- 将一个对象拆解成若干个变量
 *
 * <code>operator fun componentX()</code>为固定写法，其中1、2、3..代表括号内传入参数的顺序，
 * 具体应用在{@see main.kt}
 */
class User(var age: Int, var name: String) {
    operator fun component1() = age
    operator fun component2() = name
}