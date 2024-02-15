package utils
import java.io.File

class FileUtility {
    companion object {
        // add text to file
        suspend fun appendToFile(filename : String,text : String) {
            File(filename).appendText("$text\r\n")
        }
        // read text
        suspend fun readFile(filename:String) : String {
            return if(File(filename).exists()) {
                var result = ""
                File(filename).forEachLine { result+= "$it\n" }
                result
            } else {
                println("فایل مورد نظر وجود ندارد، لطفا یک فایل جدید ایجاد کنید.")
                ""
            }
        }
        // write new text to file
        suspend fun write(filename : String,text : String) {
            File(filename).writeText("$text\r\n")
        }

    }
}