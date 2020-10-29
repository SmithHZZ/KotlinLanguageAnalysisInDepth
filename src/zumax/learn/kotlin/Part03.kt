package zumax.learn.kotlin

interface IA {
    fun test01() {
        println("I am test01 method from interface IA")
    }

    fun test02()
}

class B : IA {
    override fun test02() {
        test01()
    }

}

fun main(args: Array<String>) {
    B().test02()
}