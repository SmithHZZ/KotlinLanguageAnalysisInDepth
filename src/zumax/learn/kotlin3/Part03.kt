package zumax.learn.kotlin3

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/13
 * Desc: 解构声明
 *
 **/

data class MyResult(val result: String, val status: Int) {

}

fun myMethod(): MyResult {
    return MyResult("success",200)
}


fun main(args: Array<String>) {

    val result = myMethod()
    result.result
    result.status

    //解构赋值
    val (s,i) = result

    println("result:$s,status:$i")


    //集合的结构赋值

    val map = mapOf<String,String>("a" to "aa","b" to "bb")

    for((k,v) in map)
    {
        println("k:$k===v:$v")
    }

    map.mapValues { entry -> "${entry.value} hello" }.forEach { (k, v) -> println("k:$k===v:$v") }

    //map.mapValues { (key,value) -> "$value World" }.forEach { (k, v) -> println("k:$k===v:$v") }

    map.mapValues { (_,value) -> "$value World" }.forEach { (k, v) -> println("k:$k===v:$v") }

    map.mapKeys { entry -> "${entry.key} key" }.forEach { (k, v) -> println("k:$k===v:$v") }
}
