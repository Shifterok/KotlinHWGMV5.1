package homework5.service

import homework5.data.Post
import org.junit.Test
import org.junit.Assert.*


class WallServiceTest {

    @Test
    fun add_checkingId() {
        val wallService = WallService()
        var resoult = Post()
        resoult = wallService.add(resoult)
        assertNotEquals(resoult.id, 0)
    }

    @Test
    fun update_areThisIsUpdate() {
        val wallService = WallService()
        var resoult = Post()
        resoult = wallService.add(resoult)
        assertTrue(wallService.update(resoult))
    }

    @Test
    fun update_areThisNotUpdate() {
        val wallService = WallService()
        assertFalse(wallService.update(Post()))
    }
}