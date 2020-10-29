package zumax.learn.kotlin4

import java.io.IOException

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/23
 * Desc: kt调用Java代码中的异常处理
 *
 **/

fun main(args: Array<String>) {

    val myException = MyException()

    try {
        myException.myMethod()
    } catch (exc : IOException) {
        println(exc.message)
    }

    val clazz = MyException()::class.java

    println(clazz)

    println(MyException().javaClass)

}
