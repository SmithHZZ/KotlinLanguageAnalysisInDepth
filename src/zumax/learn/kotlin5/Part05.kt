package zumax.learn.kotlin5

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/23
 * Desc:
 *
 * 使用@JvmField注解对kt中的属性进行标注时，表示他是一个实例字段
 * kt编译器在进行处理时，将不会给这个字段生成getter和setter方法
 **/
class Person {
    var name: String = "zhangsan"

    @JvmField
    var age: Int = 10

    companion object {
        var hello : String = "hello"

        @JvmField
        var world : Int = 2

        fun sayHi() {
            println("Hi!!!")
        }

        @JvmStatic
        fun sayHi2() {
            println("Hi2!!!")
        }
    }
}