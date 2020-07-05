package jike.part1.lesson4

/**
 *@author Hy
 *created on 2020/05/13 21:23
 **/
class A2 :AInterface {

    //kotlin中没有封装类 都是基本数据类型 所以这里只重写一个方法即可
    override fun printNumber(num: Int) {
        println("int")
    }

    companion object {
        val a = A()
    }
}