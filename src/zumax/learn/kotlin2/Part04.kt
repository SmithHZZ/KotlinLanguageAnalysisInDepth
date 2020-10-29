package zumax.learn.kotlin2

import java.util.*

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/9/16
 * Desc: map属性
 * 将属性存储到map中
 **/

//普通map，对应常量，只读
class Student(map : Map<String,Any?>) {
    val name : String by map
    val address: String by map
    val age: Int by map
    val birthday : Date by map
}

//可读写的map，对应变量
class Student2(map : MutableMap<String,Any?>) {
    var name : String by map
    var address: String by map
    var age: Int by map
    var birthday : Date by map
}

fun main(args: Array<String>) {
    val student = Student(
        mapOf(
            "name" to "zhangsan",
            "address" to "beijing",
            "age" to 20,
            "birthday" to Date()
        )
    )

    println(student.age)
    println(student.address)
    println(student.name)
    println(student.birthday)

    val student2 = Student2(
        mutableMapOf(
            "name" to "zhangsan",
            "address" to "beijing",
            "age" to 20,
            "birthday" to Date()
        )
    )

    student2.name = "Json"

    println(student2.name)


}
