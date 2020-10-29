package zumax.learn.kotlin3

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/14
 * Desc: 可变集合
 *
 *
 * kt严格区分可变集合和不可变集合
 *
 * 区分开可变集合的只读视图和真正的不可变集合
 **/

fun main(args: Array<String>) {
    //不可变集合
    val map = mapOf("a" to "aa","b" to "bb")
    //map["c"] = "cc"

    //可变集合
    val mutableMap = mutableMapOf("a" to "aa","b" to "bb")
    mutableMap["c"] = "cc"

    val map1 = hashMapOf("a" to "aa","b" to "bb")
    map1["c"] = "cc"

    val stringList: MutableList<String> = mutableListOf("a","c","d")
    val readOnlyStringList: List<String> = stringList

    println(stringList)

    stringList.add("b")

    println(readOnlyStringList)

    //只读类型是协变的，因为他只从集合中读取元素，而不会修改集合中的数据

    val s = listOf("a","b")
    val s2 : List<Any> = s

    //快照
    val items = mutableListOf("a","c","d")
    val items2 = items.toList()

    items.add("b")

    println(items)
    //[a, c, d, b]
    println(items2)
    //[a, c, d]

}
