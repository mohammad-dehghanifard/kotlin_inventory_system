package coroutines
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import utils.FileUtility

@OptIn(DelicateCoroutinesApi::class)
class ReadFileCoroutines {
    private val fileName = "D:\\\\KtFile\\inventory.txt"
    fun read(callback : (String) -> Unit) {
        GlobalScope.launch(Dispatchers.IO) {
            val result = FileUtility.readFile(filename = fileName)
            callback(result)
        }
    }
}