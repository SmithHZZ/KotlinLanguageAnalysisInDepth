package zumax.learn.kotlin4

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/16
 * Desc: Range的使用和实现
 *
 **/

fun main(args: Array<String>) {
    val items = listOf(1,2,3,4)

    println(items.first())

    println(items.last())

    items.filter { it%2 == 0 }.forEach { println(it) }

    items.filter { it%2 == 1 }.forEach { println(it) }

    //如果没有元素和条件相匹配 true
    if(items.none { it > 10 })
    {
        println("没有大于10")
    }

    println(items.firstOrNull())
    println(items.lastOrNull())

    val i =4

    //判断i是否在1-5之间，包含两端
    if(i in 1..5)
    {
        println(i)
    }

    //一次都不会执行
    for(a in 4..1)
    {
        println(a)
    }

    for (a in 4 downTo 1)
    {
        println(a)
    }

    for (a in 6 downTo 1 step 2)
    {
        println(a)
    }

    for (a in 6 until  1 step 2)
    {
        println(a)
    }

    for (a in 1 until  6 step 2)
    {
        println(a)
    }

}
