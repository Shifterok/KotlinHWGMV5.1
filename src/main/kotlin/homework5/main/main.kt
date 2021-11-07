import homework5.data.Post
import homework5.service.WallService

fun main() {
    val origin = Post(
        1, 1005, 1005, "Михаил", 2021, "Инициализация", 2, 105,
        1, 250, 15, 12, 14, 15, "Interesting", 20,
        canPin = true, canDelete = true, canEdit = true, isPinned = true,
        markedAsAds = true, isFavorite = true, 50, 10
    )
    println(origin.text)

    println("Напишите ваш первый комментарий на стене")
    val myFirstPost = readLine()
    origin.text = myFirstPost.toString()

    println(origin.text)
}