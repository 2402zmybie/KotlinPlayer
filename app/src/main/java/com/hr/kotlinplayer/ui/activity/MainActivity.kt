package com.hr.kotlinplayer.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.hr.kotlinplayer.R
import com.hr.kotlinplayer.base.BaseActivity
import com.hr.kotlinplayer.util.FragmentUtil
import com.hr.kotlinplayer.util.ToolBarManager
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.find

class MainActivity : BaseActivity(),ToolBarManager {
    //复写ToolBarManager中的成员, 并且实现惰性加载
    override val toolbar:Toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        initMainToolBar()
    }

    override fun initListener() {
        //设置底部切换的监听
        bottomBar.setOnTabSelectListener {
            //如果OnTabSelectListener 中只有一个未实现的方法, 则直接使用{}即可
            var beginTransaction = supportFragmentManager.beginTransaction()
            beginTransaction.replace(R.id.container,FragmentUtil.fragmentUtil.getFragment(it),it.toString())
            beginTransaction.commit()
        }
    }

}
