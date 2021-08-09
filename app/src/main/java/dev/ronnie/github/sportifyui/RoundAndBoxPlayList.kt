package dev.ronnie.github.sportifyui

import androidx.annotation.DrawableRes

data class RoundAndBoxPlayList(
    @DrawableRes val res: Int,
    val title: String,
    val isItArtist: Boolean
)