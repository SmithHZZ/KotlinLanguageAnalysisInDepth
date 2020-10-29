package zumax.learn.kotlin

import java.awt.event.ActionEvent
import java.awt.event.ActionListener

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/9/9
 * Desc:
 * Enum枚举类型
 *
 **/

enum class Status {
    On,
    Off
}

enum class Season {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER
}

enum class Season2(val temperature: Float) {
    SPRING(10.0f),
    SUMMER(30.0f),
    AUTUMN(10.0f),
    WINTER(0.0f)
}

enum class MethodDemo {
    HELLO {
        override fun Hello(): MethodDemo {
            return HELLO
        }
    },
    HI {
        override fun Hello(): MethodDemo {
            return HI
        }
    }
    ;//隔开枚举对象和枚举中方法
    abstract fun Hello() : MethodDemo
}
//对象声明延迟初始化的
object MyObj {
    val id =1
    val name = "Json"
    const val age = 18
}
//对象表达式立刻初始化的
var objExp = object : ActionListener {
    val id =1
    val name = "Json"
    val age = 18
    override fun actionPerformed(e: ActionEvent?) {

    }
}

//伴生对象是在其所在的类被加载时进行初始化的

fun main(args: Array<String>) {
    val  season = Season.values()

    season.forEach { println(it) }

    println(MyObj.age)

    println(MyObj::class.java)

    objExp.actionPerformed(null)

    println(objExp::class.java)
}
