package com.bedu_apk.tu_carrito_a.models

import android.os.Parcel
import android.os.Parcelable

data class ArticleModel2(
    val name: String,
    val description: String,
    val price: String,
    val rating: Float,
    val idImage: Int
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readFloat(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(description)
        parcel.writeString(price)
        parcel.writeFloat(rating)
        parcel.writeInt(idImage)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ArticleModel2> {
        override fun createFromParcel(parcel: Parcel): ArticleModel2 {
            return ArticleModel2(parcel)
        }

        override fun newArray(size: Int): Array<ArticleModel2?> {
            return arrayOfNulls(size)
        }
    }
}

