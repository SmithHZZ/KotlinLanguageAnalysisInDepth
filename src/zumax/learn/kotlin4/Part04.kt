package zumax.learn.kotlin4

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/19
 * Desc: 注解 annotation
 *
 * meta-annotation 元注解 给注解增加额外的信息
 *
 **/
//指定在源文件中
@Retention(AnnotationRetention.SOURCE)
//指定注解可修饰的对象
@Target(AnnotationTarget.CLASS,AnnotationTarget.FUNCTION,AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.EXPRESSION,AnnotationTarget.CONSTRUCTOR,AnnotationTarget.PROPERTY_SETTER)
//在文档中必须存在的注解
@MustBeDocumented
annotation class MyAnnotation

annotation class MyAnnotation1

@MyAnnotation
class MyClass1 {

    @MyAnnotation
    fun calc(@MyAnnotation i: Int): Int {
        return (@MyAnnotation 10)
    }
}

//这种情形下constructor是无法省略的
class MyClass2 @MyAnnotation constructor(a: Int) {

}

class MyClass3 {
    var a: Int? =null
        @MyAnnotation set
}


fun main(args: Array<String>) {

}
