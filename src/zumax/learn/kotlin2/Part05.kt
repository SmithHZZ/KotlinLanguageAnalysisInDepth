package zumax.learn.kotlin2

import jdk.nashorn.internal.ir.PropertyKey
import java.lang.Exception
import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/9/17
 * Desc: 提供属性
 *
 *
 * 通过定义provideDelegate operator，我们可以扩展委托的创建逻辑过程
 *
 * 如果对象定义了provideDelegate方法，那么该方法就会被调用，来创建属性的委托实例
 *
 *
 **/

class ReadOnlyPropertyDelegate : ReadOnlyProperty<People, String> {
    override operator fun getValue(thisRef: People, prop: KProperty<*>) : String
    {
        return "hello"
    }
}

class ReadWritePropertyDelegate : ReadWriteProperty<People,String> {
    override fun getValue(thisRef: People, property: KProperty<*>): String {
        TODO("Not yet implemented")
    }

    override fun setValue(thisRef: People, property: KProperty<*>, value: String) {
        TODO("Not yet implemented")
    }

}

/**
 *
 * 自己本身是个委托但是没有提供getValue/setValue方法，而是通过另外一个类来提供这种方法
 */
class PeopleLauncher {
    operator fun provideDelegate(thisRef: People,prop : KProperty<*>) : ReadOnlyProperty<People, String>
    {
        println("Hello World")

        when (prop.name)
        {
            "name","address" -> return ReadOnlyPropertyDelegate()
            else -> throw Exception()
        }
    }

}

class People {
    val name : String by PeopleLauncher()

    val address: String by PeopleLauncher()

    val test : String by PeopleLauncher()
}

fun main(args: Array<String>) {
    val people = People()

    println(people.address)
    println(people.name)
    println(people)
}

