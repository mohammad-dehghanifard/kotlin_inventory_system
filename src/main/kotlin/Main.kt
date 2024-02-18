import app.Actions
import app.Menu
import coroutines.ReadFileCoroutines
import coroutines.WriteFileCoroutines
import handler.ProductHandler
import java.lang.Exception

fun main() {
    try {
        val handler = ProductHandler()
        val writer = WriteFileCoroutines()
        val reader = ReadFileCoroutines()

        reader.read { handler.fromJson(it) }

        while (true) {
            when(Menu.getMenu()) {
                1 -> { handler.showAllProduct() }
                2 -> { Actions.addProduct(handler,writer) }
                3 -> { Actions.increaseProduct(handler,writer) }
                4 -> { Actions.decreaseProduct(handler,writer) }
                5 -> { Actions.deleteProduct(handler,writer) }
                0 -> {
                    println("با موفقیت خارج شدید")
                    return
                }
            }
        }
    } catch (e : Exception) {
        println(e.message)
    }


    Thread.sleep(1000)
}