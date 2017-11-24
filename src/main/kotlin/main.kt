import org.w3c.dom.*
import kotlin.browser.document

fun main(args: Array<String>) {
    document.querySelectorAll("[id^=answer-]").forEach<HTMLDivElement> {
        style.backgroundColor = "#eff0f1"
        (getElementsByTagName("a")[0] as HTMLAnchorElement).greyOut()
        (getElementsByClassName("excerpt")[0] as HTMLDivElement).greyOut()
    }

    document.getElementsByClassName("question-summary").forEach<HTMLDivElement> {
        if (querySelector(".unanswered") != null) {
            style.backgroundColor = "#FFFFE0"
        }
    }

}

fun HTMLElement.greyOut() {
    style.color = "#8f9090"
}

inline fun <reified T> NodeList.forEach(act: T.() -> Unit) {
    (0 until length).forEach { (this[it] as T).act() }
}

inline fun <reified T> HTMLCollection.forEach(act: T.() -> Unit) {
    (0 until length).forEach { (this[it] as T).act() }
}




