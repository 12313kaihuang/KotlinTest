package com.yu.hu.musicplayerskintest

import com.yu.hu.musicplayerskintest.skin.PlayerViewType

/**
 *@author Hy
 *created on 2020/07/04 19:38
 **/
data class User(var id: Int, var name: String, var skinType: PlayerViewType = PlayerViewType.RED)