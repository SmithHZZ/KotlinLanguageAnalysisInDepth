package zumax.learn.kotlin2

import java.util.function.BiPredicate

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/12
 * Desc: 函数式编程范式
 *
 **/

fun calc01(a: Int, b: Int, computer:(Int, Int)->Int): Int {
    return computer(a, b)
}

//扩展方法
fun String.filter(predicate: (Char) -> Boolean) : String {
    val sb = StringBuilder()
    this.forEach {
        if(predicate(it))
        {
            sb.append(it)
        }
    }
    return sb.toString()
}


fun main(args: Array<String>) {
    val i = calc01(2, 3) { a, b ->
        a + b
    }

    val j = calc01(2,3,{ a, b -> a-b })

    println(i)

    println(j)

    val str = "af5sd1f23sd1f35ds1df"
    println(str.filter {
        it.isLetter()
    })

    val strs = arrayOf("hello","world","kotlin")

    strs.filter { it.contains('l') }.forEach { println(it) }
}
