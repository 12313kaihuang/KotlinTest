package com.yu.hu.musicplayerskintest

import android.os.Bundle
import android.util.Log
import com.yu.hu.musicplayerskintest.databinding.ActivityMainBinding
import com.yu.hu.musicplayerskintest.skin.SkinManager
import com.yu.hu.musicplayerskintest.skin.getSkin

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val username = intent?.getStringExtra("username")
        mDataBinding?.username?.text = username

        val user = SkinManager.getUserData(username!!)
        val skin = getSkin(user.skinType)
        Log.d("MainActivity", "viewType = $skin")
        mDataBinding?.actionLayout?.actionBar?.setBackgroundColor(skin.getSkinColor())
    }

    override fun getLayoutId(): Int = R.layout.activity_main
}
