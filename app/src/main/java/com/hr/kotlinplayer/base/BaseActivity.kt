package com.hr.kotlinplayer.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hr.kotlinplayer.ui.activity.MainActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

abstract class BaseActivity: AppCompatActivity(),AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
        initData()
    }

    open fun initData() {}

    open fun initListener() {}

    /**
     * 获取布局Id
     */
    abstract fun getLayoutId():Int

    open fun myToast(msg:String) {
        runOnUiThread { toast(msg) }
    }

    inline fun <reified T:BaseActivity> startActivityAndFinish() {
        startActivity<T>()
        finish()
    }

}