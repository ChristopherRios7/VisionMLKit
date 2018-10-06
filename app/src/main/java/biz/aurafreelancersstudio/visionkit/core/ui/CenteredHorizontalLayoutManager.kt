package biz.aurafreelancersstudio.visionkit.core.ui

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import biz.aurafreelancersstudio.visionkit.R


class CenteredHorizontalLayoutManager(context: AppCompatActivity) :
        LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false) {

    private val windowWidth = context.windowManager.defaultDisplay.width
    private val itemViewWidth = context.resources.getDimension(R.dimen.user_option_imageview_size)

    override fun getPaddingLeft(): Int {
        return ((windowWidth / 2) - (itemViewWidth / 2)).toInt()
    }

    override fun getPaddingRight(): Int {
        return paddingLeft
    }
}