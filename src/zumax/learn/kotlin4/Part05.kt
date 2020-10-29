@file: JvmName("Part05")
//指定字节码名称

package zumax.learn.kotlin4

import kotlin.reflect.KClass

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/22
 * Desc: 注解深入
 *
 * 注解也可以有自己的构造方法，并且构造方法也可以接收参数
 *
 * 注解构造方法所允许的参数类型：
 * 与Java原生类型所对应的类型(Int,Long)
 *
 * 字符串：String
 *
 * classes (MyClass::class)
 *
 * 枚举
 *
 * 其他的注解
 *
 * 上述类型的数组类型
 *
 * kt的注解参数是不允许为可空类型的
 *
 * 如果需要将某个class作为注解的参数，需要使用kt中的class(KClass)
 *
 * kt编译器自动将其转换为Java Class
 *
 * 这样，Java代码就可以正常看到注解与参数了
 *
 *
 * 使用注解使用处目标
 *  表明注解在何处生成 use-site target
 *
 **/
@Target(AnnotationTarget.CLASS,AnnotationTarget.PROPERTY,AnnotationTarget.PROPERTY_GETTER,AnnotationTarget.PROPERTY_SETTER,AnnotationTarget.FIELD)
annotation class MyAnnotation12()

@MyAnnotation12()
class MyClass12

annotation class MyAnnotation13(val str: String,val myAnnotation: MyAnnotation12)

@MyAnnotation13("hello", MyAnnotation12())
class MyClass13

annotation class MyAnnotation14(val arg1: KClass<*>,val arg2: KClass<out Any>)

@MyAnnotation14(MyAnnotation::class,MyAnnotation12::class)
class MyClass14


class MyClass15(@field: MyAnnotation12 val str1: String,@get: MyAnnotation12 val str2: String, val str3: String)

fun main(args: Array<String>) {
    println("Hello World")
}
