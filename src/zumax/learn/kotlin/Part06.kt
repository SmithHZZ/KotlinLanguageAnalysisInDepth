package zumax.learn.kotlin

fun main(args: Array<String>) {
    println(ExtensionTest().div(1, 1))
    println(ExtensionTest().multiply(1, 1))
    println(ExtensionTest().add(1, 1))
    println(ExtensionTest().subtract(1, 1))

    myPrint(AA())
    myPrint(BB())

}

fun ExtensionTest.div(a: Int,b: Int) = a/b

fun ExtensionTest.multiply(a: Int,b: Int) = a*b

open class ExtensionTest {
    fun add(a : Int,b : Int) = a + b

    fun subtract(a: Int, b: Int) = a - b
}


open class AA{
    fun a() = "native a"
}

class BB :AA(){

}

fun AA.a() = "a"

fun BB.a() = "b"

fun myPrint(aa : AA)
{
    println(aa.a())
}