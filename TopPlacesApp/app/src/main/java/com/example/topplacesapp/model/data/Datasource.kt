package com.example.topplacesapp.model.data

import com.example.topplacesapp.R
import com.example.topplacesapp.model.Place

class Datasource {
    fun getPlaces(): List<Place> {
        return listOf(
            Place(R.string.cairns, R.string.cairns_desc, R.drawable.cairns),
            Place(R.string.sydney, R.string.sydney_desc, R.drawable.sydney),
            Place(R.string.uluru, R.string.uluru_desc, R.drawable.uluru),
            Place(R.string.melbourne, R.string.melbourne_desc, R.drawable.melbourne),
            Place(R.string.perth, R.string.perth_desc, R.drawable.perth),
            Place(R.string.kangaroo, R.string.kangaroo_desc, R.drawable.kangaroo),
            Place(R.string.kakadu, R.string.kakadu_desc, R.drawable.kakadu),
            Place(R.string.hobart, R.string.hobart_desc, R.drawable.hobart),
            Place(R.string.goldcoast, R.string.goldcoast_desc, R.drawable.goldcoast),
            Place(R.string.byronbay, R.string.byronbay_desc, R.drawable.byronbay),
        )
    }
}