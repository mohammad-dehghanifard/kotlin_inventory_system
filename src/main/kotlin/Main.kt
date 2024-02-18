import app.Actions
import app.Menu
import handler.ProductHandler
import java.lang.Exception

fun main() {
    val handler = ProductHandler()

    try {
        while (true) {
            when(Menu.getMenu()) {
                1 -> { handler.showAllProduct() }
                2 -> { Actions.addProduct(handler) }
                3 -> { Actions.increaseProduct(handler) }
                4 -> { Actions.decreaseProduct(handler) }
                5 -> { Actions.deleteProduct(handler) }
                0 -> {
                    println("با موفقیت خارج شدید")
                    return
                }
            }
        }
    } catch (e : Exception) {
        println(e.message)
    }


}