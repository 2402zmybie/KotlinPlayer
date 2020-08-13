package com.hr.kotlinplayer.util

import androidx.appcompat.widget.Toolbar
import com.hr.kotlinplayer.R
import com.hr.kotlinplayer.ui.activity.SettingActivity
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

/**
 * 区别于java, 接口中是可以写实现体的, 并且toolbar也可以不用给默认值
 */
interface ToolBarManager {

    val toolbar:Toolbar

    /**
     * 处置主页面的ToolBar
     */
    fun initMainToolBar() {
        toolbar.title = "老何影音"
        toolbar.inflateMenu(R.menu.menu_main)
        toolbar.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.setting -> {
                    //跳转到设置界面
                    toolbar.context.startActivity<SettingActivity>()
                }
            }

            true
        }
    }

    /**
     * 处置设置界面的toolBar
     */
    fun initSettingToolBar() {
        toolbar.title = "设置"
    }
}