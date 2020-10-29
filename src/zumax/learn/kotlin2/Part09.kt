package zumax.learn.kotlin2

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/10
 * Desc: 内联函数，调用时相当于直接将内联函数的代码直接拷贝过来
 *
 * 导致
 *
 * Java中不存在，C++存在
 *
 **/

inline fun myCalc(a: Int,b: Int) = a+b

fun myCalc1(a: Int,b: Int) = a+b

fun main(args: Array<String>) {
    println(myCalc(1,2))

    println(myCalc1(1,2))
}


