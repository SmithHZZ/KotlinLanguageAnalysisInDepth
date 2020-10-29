package zumax.learn.kotlin

sealed class SealedClassTest {

}

class SubClass1 : SealedClassTest() {

}

class SubClass2 : SealedClassTest() {

}

fun test(sealedClassTest: SealedClassTest) {
    when(sealedClassTest) {
        is SubClass1 -> println("SubClass1")
        is SubClass2 -> println("SubClass2")
    }
}

fun main(args: Array<String>) {
    test(SubClass1())
    test(SubClass2())
}