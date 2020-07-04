package com.yu.hu.musicplayerskintest.skin

/**
 *@author Hy
 *created on 2020/07/04 19:19
 *
 * 密闭类，可以理解为更为强大的枚举
 *
 * 播放器类型
 * 当前以及支持的播放器皮肤有绿色和蓝色两种，还有VIP定制
 **/
sealed class PlayerViewType {
    object RED : PlayerViewType()
    object BLUE : PlayerViewType()
    class VIP(val color: String? = null, val des: String? = null) : PlayerViewType()

    override fun toString(): String {
        return javaClass.simpleName
    }
}

fun getSkin(type: PlayerViewType) = when (type) {
    PlayerViewType.RED -> RedPlayerSkin()
    PlayerViewType.BLUE -> BluePlayerSkin()
    is PlayerViewType.VIP -> VIPSkin(type.color, type.des)
}