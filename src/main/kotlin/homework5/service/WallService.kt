import homework5.data.Post

class WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        TODO("Что то пошло не так!")
    }

    fun removeByID(post: Long): Boolean {
        TODO("Что то пошло не так!")
    }

    fun likeById(id: Long) {
        for ((index, post) in posts.withIndex()) {
            if (post.id= id ) {
                posts[index] = post.copy(likes = post.likes + 1)
            }
        }
    }
}