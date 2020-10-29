package zumax.learn.kotlin2

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/9
 * Desc:
 *
 **/

fun test01(a: Int = 1,b: Int = 2) = println(a+b)

fun test02(a: Int = 1,b: Int) = println(a+b)

fun test03(a: Int = 1,b: Int = 2,computer : (x: Int,y: Int)->Unit) {
    computer(a,b)
}

fun test04(a: Int,b: Int = 1,c: Int = 2,d: Int) {
    println(a + b + c + d)
}


open class Parent {
    open fun sum(a: Int,b: Int = 2) = a + b
}

class Child : Parent() {
    //父类中重写的方法也是有默认值的，与父类默认值相同，但是从子类的方法签名中无法显式看出
    override fun sum(a: Int, b: Int): Int = a + b
}

fun main(args: Array<String>) {

    test01()

    test01(2)
    //显式指定参数名
    test01(b=6)

    test01(3,2)

    val child = Child()
    child.sum(1)

    test02(1,2)

    //想使用默认值，必须指定参数名才能调用
    test02(b = 1)

    //与Java8中相似，方法引用的语法 类名::方法名
    test03(1,2, ::test01)


    //不推荐的方式
    test03(3,10,{ x, y -> println(x+y) })

    //语法上看上去test03接收两个参数，实际上不是
    test03(3,10) { x, y -> println(x+y) }

    //如果函数的最后一个参数是lambda表达式，要写在小括号后的{}中
    test03 { x, y -> println("$x + $y = ${x+y}") }

    test04(1,2,3,4)

    test04(a=1,d=3)
    test04(a=1,c=1,d=3)
    test04(a=1,b=4,d=3)
    test04(a=1,b=4,c=2,d=3)


    //如果位置参数和具名参数混用，则具名参数要放在最后一个未知参数的前面
    test04(1,b=4,c=2,d=3)
    test04(1,c=2,d=3)
    test04(1,d=3)


}