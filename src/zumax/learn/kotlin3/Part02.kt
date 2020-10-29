package zumax.learn.kotlin3

import com.sun.org.apache.xpath.internal.operations.Bool

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/13
 * Desc: 带接收者的函数字面值
 *
 *
 * 通过指定的接收者对象来调用一个函数的字面值
 * 在函数字面值内部，可以使用接收者的任何方法，而无需使用额外的修饰符
 *
 * 这一点类似于扩展函数
 *
 *
 **/



fun main(args: Array<String>) {

    //带接收者的函数字面值
    val subtract:Int.(other: Int) -> Int = { other -> this - other }

    val i = 0
    val j = 2
    println(i.subtract(j))

    //匿名函数的语法可以让我们指定函数字面值的接收者类型，这样，我们就可以先声明一个带有接收者的函数类型变量，然后再去使用它

    val sum = fun Int.(other: Int): Int = this + other

    println(1.sum(2))

    //带有接收者类型的函数的非字面值可以作为参数进行传递，前提是所需要接收函数的地方应该有一个接收者类型的参数，反之亦然

    //比如：类型String.(Int) -> Boolean 与 (String, Int) -> Boolean 等价

    val myEquals: String.(Int) -> Boolean = { param -> this.toIntOrNull() == param }

    val myEquals1: (String,Int) -> Boolean = { param1,param2 -> param1.toIntOrNull() == param2 }

    println("1".myEquals(1))
    println("1".myEquals(2))

    println(myEquals1("1",1))
    println(myEquals1("1",2))


    fun myTest(op:(String, Int)-> Boolean,a: String, b: Int, c: Boolean) = println(op(a,b) == c)

    myTest({a,b-> a.myEquals(b)},"123",456,false)
}
