package com.example.Flixster2

import android.support.annotation.Keep
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Keep
@Serializable
class TvShow(
    @JvmField
    @SerializedName("name")
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
    @SerializedName("first_air_date")
    var firstAirDate: String? = null,

    @JvmField
    @SerializedName("popularity")
    var popularity: Float? = null
) : java.io.Serializable