package zumax.learn.kotlin2

import kotlin.properties.Delegates
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty
import kotlin.properties.ReadWriteProperty

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/9/10
 * Desc: 属性委托
 *
 *
 * 四种情况在开发中比较常用
 * 1、延迟属性
 * 2、可观测属性
 * 3、非空属性
 * 4、map属性
 *
 *
 **/
class PropertyClass {

    //属性委托
    //将属性的get set方法委托给Delegate中的getValue\setValue实现
    var str : String by Delegate()

    val strReadOnly : String by DelegateReadOnly()


}

/**
 *
 * 对于委托类来说，可实现ReadOnlyProperty或者ReadWriteProperty接口
 *
 * 这些接口包含了相应的getValue和setValue方法
 *
 * 也可以不用实现这两个接口，而自己单独实现相应的getValue和setValue方法
 *
 */

class Delegate {

    //operator关键字是必须的

    operator fun getValue(thisRef:Any?,property:KProperty<*>):String = "$thisRef,your delegated property name is ${property.name}"

    operator fun setValue(thisRef:Any?,property:KProperty<*>,value: String) = println("$thisRef,new value is $value")
}

class DelegateReadOnly {

    operator fun getValue(thisRef:Any?,property:KProperty<*>):String = "$thisRef,your delegated property name is ${property.name}"
}


class DelegateFromInterface : ReadOnlyProperty<Int, Int> {
    override fun getValue(thisRef: Int, property: KProperty<*>): Int {
        return 0
    }

}


class DelegateFromInterface1 : ReadWriteProperty<Int,Int> {
    override fun getValue(thisRef: Int, property: KProperty<*>): Int {
        return 0
    }

    override fun setValue(thisRef: Int, property: KProperty<*>, value: Int) {

    }

}

/**
 * 第一次访问时才被计算，值周则会将之前计算的结果缓存起来供后续调用
 *
 * SYNCHRONIZED 只会在一个县城中得到计算，其他线程都会使用相同的一个结果
 *
 *
 * PUBLICATION 不会初始化同步
 *
 * NONE:确定初始化操作只会在一个线程中执行，可以减少线程安全上面的开销
 */
val myLazyValue: Int by lazy(LazyThreadSafetyMode.NONE) {
    println("Hello world")

    30
}

/**
 *
 *
 */

class MyPerson {
    var address : String by Delegates.notNull()
}

fun main(args: Array<String>) {
    val  propertyClass = PropertyClass()
    propertyClass.str = "Hello"

    println(propertyClass.str)


    println(propertyClass.strReadOnly)


    println(myLazyValue)

    println(myLazyValue)

    Thread{
        println("Thread")
    }.start()
    Thread(Runnable {
        println("Runnable")
    }).start()

    val person = MyPerson()

    //println(person.address)

    person.address = "1"

    println(person.address)

}

