package com.example.myart

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

//@Generated("jsonschema2pojo")
class ProductionCountry {
    @SerializedName("iso_3166_1")
    @Expose
    var iso31661: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null
}