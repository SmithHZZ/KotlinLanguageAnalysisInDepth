package zumax.learn.kotlin

open class Parent()
{
    open fun sayHi()
    {
        println("Parent sayHi!")
    }
    fun sayHello() {
        println("Parent hello")
    }
}

class Part02 : Parent(){

    override fun sayHi()
    {
        super.sayHi()
        super.sayHello()
    }

}

fun main(args: Array<String>) {
    val part02 = Part02()
    part02.sayHi()
}