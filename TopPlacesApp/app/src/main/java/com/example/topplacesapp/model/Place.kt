package com.example.topplacesapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Place(
    @StringRes val placeName: Int,
    @StringRes val placeDesc: Int,
    @DrawableRes val placeImage: Int,
)

