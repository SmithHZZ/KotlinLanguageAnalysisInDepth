package zumax.learn.kotlin2

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/10
 * Desc: 中缀符号
 *
 *
 * 函数还可以通过中缀符号形式来调用，需要满足下面三个条件
 * 1、是成员函数或是扩展函数
 * 2、单个参数
 * 3、声明时使用infix关键字
 *
 *
 **/

class InfixTest(private var a: Int) {

    infix fun add(b: Int) = this.a + b
}

fun main(args: Array<String>) {

    //常规调用
    val infixTest = InfixTest(2)
    val i = infixTest.add(8)
    println(i)

    //中缀符号调用,与常规调用方法相同
    println(infixTest add 5)
}
