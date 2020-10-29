package zumax.learn.kotlin2

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/9/9
 * Desc: Delegation委托
 *
 **/
interface MyInterface {
    fun myPrint()
}

class MyInterfaceImpl(val msg: String): MyInterface {
    override fun myPrint() {
        println("Hello World!============$msg")
    }
}

class MyClass(myInterface: MyInterface) : MyInterface by myInterface

class MyClass2(myInterface: MyInterface) : MyInterface by myInterface {
    override fun myPrint() {
        println("my own print")
    }
}

fun main(args: Array<String>) {
    val myClass = MyClass(MyInterfaceImpl("111"))
    myClass.myPrint()

    val myClass2 = MyClass2(MyInterfaceImpl("222"))
    myClass2.myPrint()
}