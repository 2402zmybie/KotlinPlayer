package com.hr.kotlinplayer.ui.activity

import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener
import com.hr.kotlinplayer.R
import com.hr.kotlinplayer.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.startActivity

class SplashActivity:BaseActivity(), ViewPropertyAnimatorListener {
    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initData() {
        //设置动画
        ViewCompat.animate(imageView).setDuration(2000).scaleX(1.0f).scaleY(1.0f).setListener(this).start()

    }

    //动画结束监听
    override fun onAnimationEnd(view: View?) {
       startActivityAndFinish<MainActivity>()
    }

    override fun onAnimationCancel(view: View?) {

    }

    override fun onAnimationStart(view: View?) {
    }
}