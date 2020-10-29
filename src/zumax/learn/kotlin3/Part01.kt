package zumax.learn.kotlin3

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/12
 * Desc: 匿名函数与闭包
 *
 *
 * 在默认形况下，lambda表达式中最后一个表达式的值会隐式作为lambda表达式的返回值
 *
 * 我们可通过全限定的return语法来显式从lamdba表达式返回值
 *
 **/

fun main(args: Array<String>) {
    val strs = arrayOf("hello","world","kotlin")

    strs.filter {
        val condition = it.length > 5
        condition
    }

    strs.filter {
        val condition = it.length > 5
        return@filter condition
    }

    //匿名方法

    //这里两个没办法使用，匿名函数一般使用在lambda表达式中
    fun (x: Int, y: Int) = x + y

    fun (x: Int, y: Int):Int {
        return x + y
    }

    //使用lambda表达式的方式
    strs.filter { it.length > 5 }.forEach { println(it) }

    //使用匿名函数的方式
    strs.filter(fun(item):Boolean = item.length > 5).forEach(fun(item) { println (item) } )

    //闭包
    //lambda表达式或者方法访问外部作用域的变量，叫闭包
    var sum = ""

    strs.filter { it.length > 3 }.forEach {
        sum += it
    }
    println(sum)


}