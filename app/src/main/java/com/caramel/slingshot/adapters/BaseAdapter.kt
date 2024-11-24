package com.caramel.slingshot.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// Base adapter for RecyclerView
open class BaseAdapter<T>(
    var dataList: List<T>,
    private val layoutId: Int,
    private val bind: (view: View, item: T) -> Unit
) : RecyclerView.Adapter<BaseAdapter.BaseViewHolder<T>>() {

    // ViewHolder class to hold the view and bind data
    class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: T, bind: (view: View, item: T) -> Unit) {
            bind(itemView, item)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<T> {
        val view = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)
        return BaseViewHolder(view)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<T>, position: Int) {
        holder.bind(dataList[position], bind)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    // Update data in the adapter
    fun updateData(newData: List<T>) {
        dataList = newData
        notifyDataSetChanged()
    }
}
