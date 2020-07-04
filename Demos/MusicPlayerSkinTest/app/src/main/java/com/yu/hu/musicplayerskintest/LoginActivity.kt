package com.yu.hu.musicplayerskintest

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.yu.hu.musicplayerskintest.databinding.ActivityLoginBinding

/**
 *@author Hy
 *created on 2020/07/04 18:30
 *
 * LoginActivity
 **/
class LoginActivity : BaseActivity<ActivityLoginBinding>(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDataBinding?.loginBtn?.setOnClickListener(this)
    }

    override fun getLayoutId(): Int = R.layout.activity_login

    override fun onClick(v: View?) {
        //login button clicked
        val username = mDataBinding?.username?.text.toString()
        if (username.isEmpty()) {
            shortToast("username is null")
            return
        }
        shortToast("hello $username")
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("username", username)
        startActivity(intent)
    }
}