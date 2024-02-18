package utils
import java.io.File

class FileUtility {
    companion object {
        // add text to file
        suspend fun appendToFile(filename : String,text : String) {
            File(filename).appendText("$text\r\n")
        }
        // read text
        suspend fun readFile(filename: String, callback: (String) -> Unit)  {
             if(File(filename).exists()) {
                File(filename).forEachLine { callback(it) }
            }
        }
        // write new text to file
        suspend fun write(filename : String,text : String) {
            File(filename).writeText("$text\r\n")
        }

    }
}