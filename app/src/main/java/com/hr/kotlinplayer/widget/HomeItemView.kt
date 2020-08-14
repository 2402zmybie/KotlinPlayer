package com.hr.kotlinplayer.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.RelativeLayout
import com.hr.kotlinplayer.R

class HomeItemView:RelativeLayout {
    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    /**
     * 不管使用哪种构造, 都会走初始化方法
     */
    init {
        View.inflate(context, R.layout.item_home,this)
    }
}