package zumax.learn.kotlin

fun sum(a: Int,b: Int) = a + b

fun whenTest(a: Int) {
    when(a)
    {
        1-> println("1")
        2-> println("2")
        in 6..10 -> println(6)
        else -> println(a)
    }
}

fun intArrayTest() {
    var intArray : IntArray = intArrayOf(1,12,3)
    for (p in intArray)
    {
        println(p)
    }
}

fun intArrayTest1() {
    val intArray : IntArray = intArrayOf(1,12,3)
    for ((i,p) in intArray.withIndex())
    {
        println("$i--------$p")
    }
}

fun rangeTest1() {
    val a = 5
    val b = 10
    if(a in 5..10)
    {
        println("hello")
    }

    if(b in 5..10)
    {
        println("World")
    }
}

fun rangeTest2() {
    for (a in 2..10)
    {
        println(a)
    }

    for (a in 3.rangeTo(9))
    {
        println(a)
    }

    for (a in 3.rangeTo(10) step 2)
    {
        println(a)
    }

    for(a in 10 downTo 3 step 2)
    {
        println(a)
    }
}

fun test1()
{
    val temp = listOf<String>("hello","world","Hello World","good bye")

    temp.filter {
        it.length > 5
    }.map{it.toUpperCase()}.sorted().forEach{ println(it) }


}
