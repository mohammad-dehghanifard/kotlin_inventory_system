package coroutines

import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import utils.FileUtility

@OptIn(DelicateCoroutinesApi::class)
class WriteFileCoroutines {
    private val fileName = "D:\\\\KtFile\\inventory.txt"

    fun append(text : String) {
        GlobalScope.launch(Dispatchers.IO) { FileUtility.appendToFile(filename = fileName,text = text) }
    }

    fun write(text : String) {
        GlobalScope.launch(Dispatchers.IO) { FileUtility.write(filename = fileName,text = text) }
    }
}