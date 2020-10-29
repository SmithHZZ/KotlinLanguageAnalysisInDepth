package zumax.learn.kotlin4

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/22
 * Desc:
 *
 **/

var myTestClass : MyTestClass = MyTestClass()

//kt中的基本数据类型的数组是通过提供原生类型的数组 来实现的
//避免装箱拆箱带来的成本
val ints = IntArray(10)

fun main(args: Array<String>) {
    myTestClass.sayHi()

    val args = IntArray(3)
    args[0]=0
    myTestClass.myArrayMethod(args)

    myTestClass.myArrayMethod(intArrayOf(1,2,3,4,5))

    //当编译成Java字节码时，编译器会优化对数组的访问，使之不会产生额外的成本

    for (x in args)
    {
        println(x)
    }

    myTestClass.myVariableParams("111","2222")

    //使用星号运算符
    val strings = arrayOf("11", "222")
    myTestClass.myVariableParams(*strings)
}



