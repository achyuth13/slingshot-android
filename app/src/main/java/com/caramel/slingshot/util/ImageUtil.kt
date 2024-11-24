package com.caramel.slingshot.util

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.caramel.slingshot.R

object ImageLoader {
    // A simple method to load images into an ImageView
    /* How to use?
        ImageLoader.loadImage(holder.itemView.playerAvatar, player.icon)
    */
    fun loadImage(imageView: ImageView, imageUrl: String?) {
        Glide.with(imageView.context)
            .load(imageUrl)
            .placeholder(R.drawable.ic_launcher_background) // Default placeholder
            .into(imageView)
    }

    fun loadImage(imageView: ImageView, imageUrl: String?, placeholder: Int = R.drawable.ic_launcher_background, errorImage: Int = R.drawable.ic_launcher_foreground) {
            Glide.with(imageView.context)
                .load(imageUrl)
                .placeholder(placeholder)
                .error(errorImage)
                .into(imageView)
    }

}
