import homework5.data.Post

fun main() {

    val origin = Post(
        101, 110, 250, "Михаил", 2021, "Инит", 101, 105,
        1, 250, 15, 12, 14, 15, "Interesting", 20,
        canPin = true, canDelete = true, canEdit = true, isPinned = true,
        markedAsAds = true, isFavorite = true, 50, 10
    )

    println("Напишите ваш первый комментарий на стене")
    val whatYourFirstPost = readLine()

    val postsAtWall: Array<String> = arrayOf(arrayOf(0,1,2,3,4).toString())
    postsAtWall[0] = whatYourFirstPost.toString()
    println(postsAtWall[0])

    val service = WallService()
    service.add(origin)
}