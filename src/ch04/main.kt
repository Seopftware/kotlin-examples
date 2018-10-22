package ch04.main

/*
리스트 4.6
열린 메소드를 포함하는 열린 클래스 정의
*/

// 4.1 코틀린 인터페이스
class Button : Clickable, Focusable {
    override  fun click() = println("I was clicked")

    override fun showOff() {
        super<Clickable>.showOff() // <-> Clickable.super.showOff()
        super<Focusable>.showOff()
    }

    // if 만약, 한 줄이라면
    // override fun showOff() = super<Clickable>.showOff()
}

interface Clickable{
    fun click()
    fun showOff() = println("I'm clickable")
}

interface Focusable{
    fun setFocus(b: Boolean) =
            println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable");
}

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}

// I'm clickable
// I'm focusable
// I got focus
// I was clicked