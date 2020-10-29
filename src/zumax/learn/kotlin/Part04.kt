package zumax.learn.kotlin

fun main(args: Array<String>) {
    Part04().test01()
    myObj.myMethod()
}


class Part04 : BaseClass() {
    override fun test01() {
        println("Hello")
    }

    companion object {

    }
}

abstract class BaseClass {
    abstract fun test01()
}

object myObj{
    fun myMethod() {
        println("myObj.myMethod")
    }
}