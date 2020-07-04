package jike.lesson4

/**
 *@author Hy
 *created on 2020/05/13 21:19
 *
 * 新手使用Kotlin常碰到的问题
 *
 * Kotlin没有封装类
 * Kotlin类型空值敏感
 * Kotlin没有静态变量与静态方法
 **/
fun main() {
    //结果是int 因为Kotlin中没有封装类
    A.a.printNumber(123)

    function("")
}

//空值敏感测试
fun function(str:String){
    var r1 = A.format(str) //String!类型
    //println(r1.length) //报错 NullPointerException
    //var r2:String = A.format(str)  //直接报错 IllegalStateException: A.format(str) must not be null
    var r3:String? = A.format(str)
    println(r3?.length)  //null
}

//Kotlin没有静态变量与静态方法
object Test {

    //加上这个注解 在java中调用可以直接通过  Test.sayMessage("hello")调用
    //编译时也会将此方法编译成Public static类型的
    @JvmStatic
    fun sayMessage(msg: String) {
        println(msg)
    }
}