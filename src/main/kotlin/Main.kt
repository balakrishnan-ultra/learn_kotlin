"""fun main()
{
    println("Kotlin developer")
}
// kotlin file convert to the jar file
//kotlinc kotlinjar.kt -include-runtime -d kt_jar.jar
// jar file run command
//java -jar kt_jar.jar
"""

// Kotlin folder creat code
import java.io.File

fun createFolder(path: String) {
    val folder = File(path)
    if (!folder.exists()) {
        folder.mkdirs()
        if (folder.exists()) {
            println("Folder created successfully at $path")
        } else {
            println("Failed to create folder at $path")
        }
    } else {
        println("Folder already exists at $path")
    }
}

fun main() {
    val folderPath = "path/to/your/new/folder"
    createFolder(folderPath)
}
