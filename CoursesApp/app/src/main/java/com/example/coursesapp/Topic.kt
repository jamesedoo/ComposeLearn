package com.example.coursesapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResource: Int,
    val totalModule: Int,
    @DrawableRes val imageResource: Int
)
