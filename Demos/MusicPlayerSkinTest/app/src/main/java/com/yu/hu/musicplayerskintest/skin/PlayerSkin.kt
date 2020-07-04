package com.yu.hu.musicplayerskintest.skin

import android.graphics.Color

/**
 *@author Hy
 *created on 2020/07/04 18:00
 **/

const val COLOR = "#FF0000"
const val DESCRIPTION = "null"

open class PlayerSkin(var skinColor: String?, var skinDescription: String? = null) {

    init {
        println("主构造函数")
        skinColor = skinColor ?: COLOR
        skinDescription = skinDescription ?: DESCRIPTION
    }

    constructor() : this(COLOR, DESCRIPTION) {
        println("无参构造方法")
    }

    constructor(skinColor: String?) : this(skinColor, DESCRIPTION) {
        println("一个参数的构造方法")
    }

    fun getSkinColor(): Int = Color.parseColor(skinColor)

    override fun toString(): String {
        return "PlayerSkin(skinColor=$skinColor, skinDescription=$skinDescription)"
    }
}