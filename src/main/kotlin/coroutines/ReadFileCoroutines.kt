@file:OptIn(DelicateCoroutinesApi::class)
package coroutines
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import utils.FileUtility

class ReadFileCoroutines {
    private val fileName = "D:\\\\KtFile\\inventory.txt"
    fun read() {
        GlobalScope.launch(Dispatchers.IO) {
            FileUtility.readFile(filename = fileName)
        }
    }
}