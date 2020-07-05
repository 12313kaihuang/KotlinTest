package jike.part2.lesson15

/**
 * Kotlin海量的集合操作符
 */
fun main() {
    simpleTest()
    test2()
    myOperator()
}

fun simpleTest() {
    val list = arrayListOf<Char>('a', 'b', 'c', 'd')
    val a = list.map { it - 'a' } //将一个集合的数据类型做一个改变，这里执行完成后数据类型从char改为了int  -> {0,1,2,3}
            .filter { it > 0 } //对数据进行一个过滤，值大于0的保留，不大于0的会被过滤 -> {1,2,3}
            .find { it > 1 } //查找第一个值大于1的  2
    //.findLast { it > 1 } //查找最后一个值大于1的  3
    println(a)
}

/**
 * {@link JavaRx}为java版本
 */
fun test2() {
    val a = arrayListOf("4", "0", "7", "i", "f", "w", "0", "9")
    val index = arrayListOf(5, 3, 9, 4, 8, 3, 1, 9, 2, 1, 7)

    index.filter { it < a.size }
            .map { a[it] }
            .reduce { s, s1 ->
                "$s$s1"  //reduce 合并操作
            }
            .also {
                println("密码是 $it")
            }
}

fun myOperator() {
    val list = listOf(1, 2, 3, 4, 5)
    list.convert {
        it + 1
    }.forEach {
        println(it)
    }
}

inline fun <T, E> Iterable<T>.convert(action: (T) -> E): Iterable<E> {
    val list: MutableList<E> = mutableListOf()
    for (item: T in this) list.add(action(item))
    return list
}