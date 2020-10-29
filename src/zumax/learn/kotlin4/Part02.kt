package zumax.learn.kotlin4

import java.lang.Integer.parseInt
import java.lang.NumberFormatException

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/16
 * Desc: 异常处理
 *
 * kt中的try是个表达式
 * kt中没有checked exception
 *
 * throw在kt中是个表达式
 **/


fun main(args: Array<String>) {

    val s = "3"

    val result: Int? = try {
        parseInt(s)
    } catch (ex : NumberFormatException) {
        null
    } finally {
        println("finally invoke")
    }

    println(result)
    val str : String? = "a"
    val str2 = str ?: throw IllegalAccessException("值不能为空")

}
