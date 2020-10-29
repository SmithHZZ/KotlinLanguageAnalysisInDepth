package zumax.learn.kotlin


class Part10() {
    var a : Int = 0
}

interface ITest1<out T> {
    fun produce() : T
}

interface ITest2<in T> {
    fun consume(t : T)
}

interface ITest3<T : Part10> {
    fun test(t : T) {
        println(t.a)
    }
}

class Part10Test() : ITest3<Part10> {

    private var str : String = "HelloWorld"

    class NestedClass {
        var i : Int = 3
        var j : String = "4"
    }

    fun test() {
        println(NestedClass().i)
        println(NestedClass().j)
    }

    inner class InnerClass {
        fun test() {
            this@Part10Test.test()
        }
    }

}

fun main(args: Array<String>) {
    Part10Test().test()
    println(Part10Test.NestedClass().j)
}