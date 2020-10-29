package zumax.learn.kotlin

data class DataClass(var id : Int = 0,var name : String = "") {

}

fun main(args: Array<String>) {
    val clazz = DataClass(1,"Json")
    println(clazz)
}