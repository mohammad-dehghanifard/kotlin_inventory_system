import java.io.File

fun main() {
    val fileName = "D:\\\\KtFile\\inventory.txt"
    File(fileName).appendText("how are you\r")
    File(fileName).forEachLine { println(it) }
}