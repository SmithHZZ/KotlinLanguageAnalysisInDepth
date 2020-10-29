package zumax.learn.kotlin2

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/10
 * Desc: 高阶函数（high-order function） 与 lambda表达式
 *
 * 一个函数，如果参数或者返回值中有函数类型，那么该函数被称为高阶函数
 *
 * lambda格式要求：
 *  1、一个lambda表达式总是被{}包围
 *  2、其参数位于箭头之前
 *  3、参数类型可省略
 *  4、执行体位于箭头后
 *
 *
 *  在kt中，如果一个函数的最后一个参数是函数，可以将lambda表达式作为实参传递进去
 *
 *  并且可以写在小括号的外面，如果只有该lambda表达式一个参数，则可省略小括号
 *
 *  直接跟在函数名后
 *
 **/

val multiply:(Int, Int) ->Int = { a, b -> a * b }
val add:(Int, Int)->Int = { a, b -> a + b}
val sub = { a:Int, b:Int -> a - b }
val action1 = { println("Hello World") }

//表示参数的占位符，后面用不到
val action2: (Int,Int) -> Int? = { _, _ -> null }

val action3: ((Int,Int) -> Int?)? = null


fun main(args: Array<String>) {
    action1()
}