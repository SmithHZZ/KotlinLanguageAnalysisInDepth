package zumax.learn.kotlin5

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/23
 * Desc:
 *
 **/
class Part07 {

    //应对Java中没有默认参数值的问题
    //生成多个重载方法
    @kotlin.jvm.JvmOverloads
    fun  test(a: Int, b: Int, c: Int = 3) {
        println("a $a,b $b,c $c")
    }


}