package jike.part2.lesson17


//中缀表达式 用于  扩展运算符
infix fun Int.vs(num: Int): CompareResult =
        when {
            this - num < 0 -> {
                CompareResult.LESS
            }
            this - num > 0 -> {
                CompareResult.MORE
            }
            else -> {
                CompareResult.EQUAL
            }
        }


//密闭类
sealed class CompareResult {
    object LESS:CompareResult(){
        override fun toString(): String {
            return "小于"
        }
    }

    object MORE:CompareResult(){
        override fun toString(): String {
            return "大于"
        }
    }

    object EQUAL:CompareResult(){
        override fun toString(): String {
            return "等于"
        }
    }
}

fun main() {
    println(5 vs 6)
    println(5.vs(6))
}