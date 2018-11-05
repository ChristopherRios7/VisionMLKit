package biz.aurafreelancersstudio.visionkit.ui.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import biz.aurafreelancersstudio.visionkit.R
import biz.aurafreelancersstudio.visionkit.core.model.UserOption
import kotlinx.android.synthetic.main.item_user_option.view.*

//binds users current option to use that specific ML kit method
class UserOptionViewHolder(parent: ViewGroup, private val onItemClickListener: (UserOption) -> Unit) :
        RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_user_option, parent, false)) {

    fun bind(option: UserOption) {
        itemView.userOptionImageView.setImageResource(option.iconResId)
        itemView.setOnClickListener { onItemClickListener.invoke(option) }
    }
}
