package utils
import java.io.File

class FileUtility {
    companion object {
        // add text to file
        suspend fun appendToFile(filename : String,text : String) = File(filename).appendText("$text\r\n")
        // read text
        suspend fun readFile(filename:String) {
            if(File(filename).exists()) {
                File(filename).forEachLine {  }
            } else {
                println("فایل مورد نظر وجود ندارد، لطفا یک فایل جدید ایجاد کنید.")
            }
        }
        // write new text to file
        suspend fun write(filename : String,text : String) = File(filename).writeText("$text\r\n")

    }
}