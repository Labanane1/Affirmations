package com.example.affirmation.model
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class affirmation(
    val stringResourceId: Int,
    val imageResourceId: Int
)

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)