import org.w3c.dom.*
import kotlin.browser.document

fun main(args: Array<String>) {
    val querySelectorAll = document.querySelectorAll("[id^=answer-]")
    querySelectorAll.forEach {
        with(it as HTMLDivElement) {
            style.backgroundColor = "#eff0f1"
            (getElementsByTagName("a")[0] as HTMLAnchorElement).greyOut()
            (getElementsByClassName("excerpt")[0] as HTMLDivElement).greyOut()
        }
    }

    val unanswered = document.getElementsByClassName("question-summary")
    unanswered.forEach {
        val element = it as HTMLDivElement
        if (element.querySelector(".unanswered") != null) {
            element.style.backgroundColor = "#FFFFE0"
        }
    }
    val dyn: dynamic ="String"
    dyn.thisMethodDoesNotExist(1,2,3)
}

fun HTMLElement.greyOut() {
    style.color = "#8f9090"
}

fun NodeList.forEach(act: (Node?) -> Unit) {
    (0 until length).forEach { act(this[it]) }
}

fun HTMLCollection.forEach(act: (Element?) -> Unit) {
    (0 until length).forEach { act(this[it]) }
}




