package zumax.learn.kotlin

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import javax.swing.JButton
import javax.swing.JFrame

/**
 * Author:  zhuangzhuang.hu
 * Date:    2020/9/8
 * Desc:    对象表达式
 *
 * 1、对象表达式要点
 * 匿名对象只能在局部变量范围内或是被private修饰的成员变量范围内才能被识别出来
 *
 * 如果匿名对象被当做一个public方法的返回类型或是public属性的类型，那么该方法或属性的真正类型就是匿名对象的父类型
 * 如果没有声明任何父类型，那么其真实类型就是Any
 *
 *
 * 对象表达式类似于Java中的匿名对象，但kt中的对象表达式可以访问外层对象，与Java不同的是，被访问对象无需声明为final类型
 **/
fun main()
{

    println("Hello World")

    val obj1 = object {

        init {
            println("表达式对象初始化")
        }
        var id = 0
        var name = "Json"
        var age = 18
        fun hello() = "main()"

        override fun toString() ="${id}-${name}-${age}-${hello()}"
    }

    println(obj1)

    val objectExpression = ObjectExpression()

    val onRequestComplete = object : IRequestComplete {
        override fun onSuccess(data: String) {
            println(data)
        }

        override fun onFailed(msg: String) {
            println(msg)
        }

    }

    println(onRequestComplete::class.java)
    println(onRequestComplete.javaClass)

    objectExpression.request(1, onRequestComplete)

    objectExpression.request(-1,onRequestComplete)

    objectExpression.request1(object : IRequestComplete1 {
        override fun onComplete(success: Boolean, data: String) {
            println("data")
        }
    })

    var i = 100

    val obj100 = object {
        fun test()
        {
            i++
        }
    }


    obj100.test()

    println(i)


    val frame = JFrame("Hello World")
    val button = JButton("Button")

    frame.addWindowListener(object : WindowListener {
        override fun windowOpened(e: WindowEvent?) {
            println("windowOpened")
        }

        override fun windowClosing(e: WindowEvent?) {

        }

        override fun windowClosed(e: WindowEvent?) {

        }

        override fun windowIconified(e: WindowEvent?) {

        }

        override fun windowDeiconified(e: WindowEvent?) {

        }

        override fun windowActivated(e: WindowEvent?) {
            println("windowActivated")
        }

        override fun windowDeactivated(e: WindowEvent?) {

        }

    })

//    button.addActionListener(object : ActionListener {
//        override fun actionPerformed(e: ActionEvent?) {
//            println("button pressed")
//        }
//
//    })


    button.addActionListener(ActionListener{ event-> println("button pressed"+event.id) })
    button.addActionListener(ActionListener{ println("button pressed") })
    button.addActionListener { event-> println("button pressed"+event.id) }
    button.addActionListener { println("button pressed") }

    val listener = ActionListener { println("Hello") }

    println(listener::class.java)

    val listener2 = object :ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            println("Hello")
        }
    }

    println(listener2::class.java)



    frame.add(button)
    frame.pack()
    frame.isVisible = true
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

}

interface IRequestComplete {
    fun onSuccess(data:String)

    fun onFailed(msg : String)
}

interface IRequestComplete1 {
    fun onComplete(success: Boolean,data:String)
}

class ObjectExpression {

    fun request(code :Int, requestComplete :IRequestComplete)
    {
        if(code<0)
        {
            requestComplete.onFailed("Error")
        }
        else
        {
            requestComplete.onSuccess("Hello World")
        }
    }

    fun request1(requestComplete1 :IRequestComplete1)
    {
        requestComplete1.onComplete(false,"Error")
    }
}

