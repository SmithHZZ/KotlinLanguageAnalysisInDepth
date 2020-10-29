package zumax.learn.kotlin5

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/23
 * Desc:
 *
 *
 * Java中的泛型是假泛型
 *
 * 类型信息并没有存储到字节中，存在类型擦除机制
 *
 *
 **/


fun List<String>.myFilter(): List<String> {
    return listOf("hello","world")
}

//fun List<Int>.myFilter(): List<Int> {
//    return listOf(1,2)
//}

@JvmName("myFilter2")
fun List<Int>.myFilter(): List<Int> {
    return listOf(1,2)
}

fun main(args: Array<String>) {

    //kt中直接匹配使用

    listOf("aa").myFilter().forEach { println(it) }

    listOf(1,2).myFilter().forEach { println(it) }

}