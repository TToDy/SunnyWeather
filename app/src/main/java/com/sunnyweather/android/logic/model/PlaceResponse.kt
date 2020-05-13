package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * Created by Administrator on 2020/5/12
 */
data class PlaceResponse(val status: String, val palce: List<Place>)

data class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)

data class Location (val lng: String, val lat: String)