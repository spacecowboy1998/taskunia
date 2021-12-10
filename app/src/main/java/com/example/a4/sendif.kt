package com.example.a4

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class sendif (
    val first : String ,
    val second : String,
    val third : String
): Parcelable


