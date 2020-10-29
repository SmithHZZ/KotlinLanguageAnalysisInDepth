package zumax.learn.kotlin4

import java.lang.IllegalArgumentException

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/19
 * Desc: Java异常与kt异常的区别
 *
 * kt中throw是个表达式，这样我们可以将throw表达式作为Elvis表达式的一部分
 *
 * throw表达式的类型是一种特殊的类型：Nothing
 *
 * 在自己的代码中可以使用Nothing来标记永远不会返回的函数
 *
 *
 **/



fun main(args: Array<String>) {
    val str: String? = "null"

    val str2 = str ?: throw IllegalArgumentException("值不能为空")
    println(str2)

    println("===================================================")


    val str3 = str ?: myMethod("Hello")

    println(str3)

    //编译器将s推断为Nothing?

    var s = null
    println(s is Nothing?)

    var s2 = listOf(null)
    println(s2 is List<Nothing?>)
}

//永远都不会返回，总是抛出异常
fun myMethod(msg: String) : Nothing {
    throw IllegalArgumentException(msg)
}
