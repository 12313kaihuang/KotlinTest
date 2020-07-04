package com.yu.hu.musicplayerskintest.skin

import com.yu.hu.musicplayerskintest.User
import java.util.*

/**
 *@author Hy
 *created on 2020/07/04 19:39
 *
 * 设置了三个用户，分别对应三种皮肤
 **/
class SkinManager {
    companion object {
        private val users = listOf(
            User(1, "Tom", PlayerViewType.RED),
            User(2, "Bob", PlayerViewType.BLUE),
            User(3, "Marry", PlayerViewType.VIP("#00FF00", "GREEN"))
        )

        fun getUserData(name: String): User {
            for (user: User in users) {
                if (name.toLowerCase(Locale.ROOT).trim() == user.name.toLowerCase(Locale.ROOT)) return user
            }
            return User(-1, name, PlayerViewType.RED)
        }
    }
}