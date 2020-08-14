package com.hr.kotlinplayer.util

import androidx.fragment.app.Fragment
import com.hr.kotlinplayer.R
import com.hr.kotlinplayer.base.BaseFragment
import com.hr.kotlinplayer.ui.fragment.HomeFragment
import com.hr.kotlinplayer.ui.fragment.MvFragment
import com.hr.kotlinplayer.ui.fragment.VBangFragment
import com.hr.kotlinplayer.ui.fragment.YueDanFragment

/**
 * 管理Fragment的类
 * 单例
 *
 * private constructor()私有构造
 * companion object 伴生对象,  相当于java的静态内部属性
 */
class FragmentUtil private constructor(){
    val homeFragment:BaseFragment by lazy { HomeFragment() }
    val mvFragment:BaseFragment by lazy { MvFragment() }
    val vBangFragment:BaseFragment by lazy { VBangFragment() }
    val yueDanFragment:BaseFragment by lazy { YueDanFragment() }

    companion object {
        val fragmentUtil by lazy { FragmentUtil() }
    }

    fun getFragment(tabId:Int): BaseFragment {
        when(tabId) {
            R.id.tab_home -> return homeFragment
            R.id.tab_mv -> return mvFragment
            R.id.tab_vlist -> return vBangFragment
            R.id.tab_yue_dan -> return yueDanFragment
            else -> return homeFragment
        }
    }
}