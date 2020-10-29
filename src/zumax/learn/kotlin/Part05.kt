package zumax.learn.kotlin

fun main(args: Array<String>) {
    val part05 = Part05()
    part05.address = "hello"
    part05.name = "1"
    println(part05.name)
    println(part05.address)
}

class Part05 {
    val age : Int = 10
        get() {
            println("Hello")
            return field
        }

    var address : String = ""
    get() {
        println("get value")
        return field
    }
    set(value) {
        println("set value")
        field = value
    }

    lateinit var name : String

}