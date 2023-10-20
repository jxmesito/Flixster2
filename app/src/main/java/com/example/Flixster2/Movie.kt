package com.example.Flixster2

import android.support.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class Movie(
    @JvmField
    @SerializedName("title")
    var title: String? = null,

    @JvmField
    @SerializedName("backdrop_path")
    var imageBackdropPath: String? = null,

    @JvmField
    @SerializedName("poster_path")
    var imagePosterPath: String? = null,

    @JvmField
    @SerializedName("overview")
    var description: String? = null,

    @JvmField
    @SerializedName("release_date")
    var releaseDate: String? = null,

    @JvmField
    @SerializedName("popularity")
    var popularity: Float? = null
) : java.io.Serializable