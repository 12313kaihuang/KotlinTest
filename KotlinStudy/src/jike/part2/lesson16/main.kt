package jike.part2.lesson16

/**
 * 作用域函数
 *
 * run
 * with
 * let
 * apply
 * also
 */
fun main() {

    val user = User("ZhangSan")

    //let与run都会返回闭包的执行结果，区别在于let有闭包参数，而run没有闭包参数
    val letResult: String = user.let { user: User -> "let::${user::class.java}" } /*user.javaClass*/
    val letResult2: String = user.let { "let::${it::class.java}" } //闭包只有一个参数时可以省略，用it代替
    println(letResult)
    val runResult = user.run { "run::${this.javaClass}" }
    println(runResult)

    //also与apply都不返回闭包的执行结果，区别在于also有闭包参数，而apply没有闭包参数
    user.also {
        println("also::${it.javaClass}")
    }
    /*user*/.apply {   //可以连续.
        println("apply::${this.javaClass}")
    }.name = "hello"

    //takeIf的闭包返回一个判断结果，为false时，takeIf会返回空
    //takeUnless 与 takeIf 刚好相反，闭包的判断结果，为true时函数会返回空
    user.takeIf { it.name.isNotEmpty() }?.also { println("name:${it.name}") } ?: println("name is null")
    user.takeUnless { it.name.isNotEmpty() }?.also { println("name is null") } ?: println("name:${user.name}")

    repeat(5) {
        println(user.name + it)
    }

    //with比较特殊，不是以扩展方法的形式存在的，而是一个顶级函数
    with(user) {
        this.name = "with"
    }
}

data class User(var name: String)