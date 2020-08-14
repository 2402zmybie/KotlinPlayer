package com.hr.kotlinplayer.ui.activity

import android.preference.PreferenceManager
import androidx.appcompat.widget.Toolbar
import com.hr.kotlinplayer.R
import com.hr.kotlinplayer.base.BaseActivity
import com.hr.kotlinplayer.util.ToolBarManager
import org.jetbrains.anko.debug
import org.jetbrains.anko.find

class SettingActivity:BaseActivity(),ToolBarManager {

    override val toolbar: Toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_setting
    }

    override fun initData() {
        initSettingToolBar()
        //获取推送通知有没有选中
        var defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        var push = defaultSharedPreferences.getBoolean("push", false)
        println("push: ${push}")
    }


}