package com.example.aaaaaa
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class superhero(
    val imgsuperhero: Int,
    val namesuperhero: String,
    val descsuperhero: String
) : Parcelable
