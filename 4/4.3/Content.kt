import java.io.File

class Content {
    var text: String? = null
    fun loadFile(file: File) {
        text = file.readText()
    }
}

fun getContentSize(content: Content) = content.text?.length ?: 0
