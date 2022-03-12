package com.bedu_apk.tu_carrito_a.models

import android.os.Parcel
import android.os.Parcelable

data class ListModel(
    val titulo: String,
    val categoria: String,
    val price: String,
    val rating: Float,
    val idPortrait: Int
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
        parcel.writeString(titulo)
        parcel.writeString(categoria)
        parcel.writeString(price)
        parcel.writeFloat(rating)
        parcel.writeInt(idPortrait)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ListModel> {
        override fun createFromParcel(parcel: Parcel): ListModel {
            return ListModel(parcel)
        }

        override fun newArray(size: Int): Array<ListModel?> {
            return arrayOfNulls(size)
        }
    }
}




