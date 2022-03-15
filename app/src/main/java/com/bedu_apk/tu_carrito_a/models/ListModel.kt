package com.bedu_apk.tu_carrito_a.models

import android.os.Parcel
import android.os.Parcelable

data class ListModel(
    val titulo: String,
    val categoria: String,
    val price: String,
    val rating: Float,
    val idPortrait: Int
)


