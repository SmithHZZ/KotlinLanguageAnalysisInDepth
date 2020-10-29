package zumax.learn.kotlin


fun main(args: Array<String>) {
    var s : Any? = null
    println(s)
    s = "1"
    println(s)
    s = 2
    println(s)
}

fun Any?.toString() : String {
    return this?.toString() ?: "null"
}