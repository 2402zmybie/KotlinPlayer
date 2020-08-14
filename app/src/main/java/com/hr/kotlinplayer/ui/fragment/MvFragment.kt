package com.hr.kotlinplayer.ui.fragment

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.TextView
import com.hr.kotlinplayer.R
import com.hr.kotlinplayer.base.BaseFragment

class MvFragment:BaseFragment() {
    override fun initView(): View {
        var textView = TextView(context)
        textView.gravity = Gravity.CENTER
        textView.setTextColor(Color.RED)
        textView.text = javaClass.simpleName
        return textView
    }
}