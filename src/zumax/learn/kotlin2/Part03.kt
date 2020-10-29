package zumax.learn.kotlin2

import kotlin.properties.Delegates

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/9/15
 * Desc: 可观测委托和map委托
 *
 **/
class Person {

    //可观测属性，属性值发生变化时执行指定操作
    var age : Int by Delegates.observable(0) {
        prop, oldValue, newValue->

        println("prop.name:${prop.name}======oldValue:${oldValue}=========newValue:${newValue}")

    }
}

class Person2 {
    var age : Int by Delegates.vetoable(20) {
            prop, oldValue, newValue->

        println("prop.name:${prop.name}======oldValue:${oldValue}=========newValue:${newValue}")

        return@vetoable newValue > 0
    }
}

fun main(args: Array<String>) {
    val person = Person()
    person.age = 10

    val person2 = Person2()
    person2.age = 30

    println(person2.age)
}