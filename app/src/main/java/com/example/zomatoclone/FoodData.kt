package com.example.zomatoclone

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.*
import kotlinx.serialization.Serializable

@Serializable
data class DemoData(
    val data: FoodData
)

@Serializable
data class Sample(@SerialName("sample") val sample: ArrayList<FoodData>)

@Serializable
data class FoodData(@SerialName("imageUrl") val image_url: String, @SerialName("description") val description: String)
