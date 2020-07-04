package jike.lesson6

/**
 *@author Hy
 *created on 2020/05/14 10:32
 *
 * 扩展函数
 * {@code public fun File.readText(charset: Charset = Charsets.UTF_8): String = reader(charset).use { it.readText() }}
 **/
fun main() {
    //animal 扩展函数不具备运行时多态效应
    Dog().printName(Dog())
}

//open  与final相反 表示不是final类型,kotlin 类默认为final类型
open class Animal
class Dog:Animal()

//扩展函数  静态的给一个类添加 不具备运行时多态效应
fun Animal.name() = "animal"
fun Dog.name() = "dog"

fun Animal.printName(animal:Animal){
    println("name = ${animal.name()}")
}
