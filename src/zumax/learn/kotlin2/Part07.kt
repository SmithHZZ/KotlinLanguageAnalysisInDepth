package zumax.learn.kotlin2

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/10
 * Desc: 可变参数
 *
 * kt在调用java方法时不能使用具名参数调用，因为Java字节码不总是保留参数名信息
 *
 *
 * 一个方法中只允许一个参数为vararg,通常作为最后一个参数来定义
 *
 * 如果vararg不是最后一个参数，那么其后的参数就要通过具名参数指定
 *
 * 如果其后的参数是函数类型，可以通过在小括号外传递lambda表达式来实现
 *
 **/

fun test11(vararg strings: String) {
    println(strings::class.java)
    println(strings.javaClass)
    strings.forEach { s->
        println(s)
    }
}

/**
 *
 *
 * public object Unit {
      override fun toString() = "kotlin.Unit"
   }
 *
 *
 */

fun test12(): Unit {
    println("Hello World")
    return Unit
}

//单表达式函数，如果函数的返回类型可以通过类型推断出来，那么返回值类型就可以省略
fun test13(a: Int,b: Int) = a + b


//拥有方法体的函数必须显示指定返回值类型
fun test14(a: Int,b: Int): Int {
    println("Hello")
    return a + b
}

fun main(args: Array<String>) {
    test11("1","2","3","4")

    //可变参数可以借助于分散运算符* 以具名参数的形式传递
    test11(strings = *arrayOf("a","b","c"))

    val strings = arrayOf("a","b","c","d")
    test11(*strings)

}
