package com.hr.kotlinplayer.ui.activity

import androidx.appcompat.widget.Toolbar
import com.hr.kotlinplayer.R
import com.hr.kotlinplayer.base.BaseActivity
import com.hr.kotlinplayer.util.ToolBarManager
import org.jetbrains.anko.find

class AboutActivity:BaseActivity(),ToolBarManager {

    override val toolbar: Toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_about
    }

    override fun initData() {
        initAboutToolBar()
    }


}