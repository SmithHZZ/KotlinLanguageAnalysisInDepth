package zumax.learn.kotlin5

/**
 * Author：zhuangzhuang.hu
 * Date: 2020/10/23
 * Desc: Java调用kt代码
 *
 * 属性(properties)
 *
 * 一个kt属性会被便以为3部分Java元素
 * 1、一个getter方法
 * 2、一个setter方法
 * 3、一个私有字段(field)
 *
 *
 * 如果kt属性名is开头，那么命名约定会发生一些变化
 *
 *  getter方法与原属性名相同
 *  setter方法为set替换is
 *
 * 这种规则适用于任何类型不单单是boolean
 *
 **/
//javap -c -p zumax.learn.kotlin5.Test


class Test {
    var name : String = "zhangsan"

    var isStudent: Boolean = true
}
