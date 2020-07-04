package com.yu.hu.musicplayerskintest

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import java.lang.RuntimeException

/**
 *@author Hy
 *created on 2020/07/04 18:30
 **/
abstract class BaseActivity<T : ViewDataBinding> : AppCompatActivity() {

    protected var mDataBinding: T? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mDataBinding = DataBindingUtil.setContentView(this, getLayoutId())
        if (null == mDataBinding) {
            throw RuntimeException("error inflate dataBinding with layout:${getLayoutId()}")
        }
    }

    fun shortToast(msg: String) = Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    /**
     * get the layout res
     */
    @LayoutRes
    abstract fun getLayoutId(): Int
}