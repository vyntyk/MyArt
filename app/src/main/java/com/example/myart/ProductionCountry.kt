package com.example.myart

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

//@Generated("jsonschema2pojo")
class ProductionCountry {
    @SerializedName("iso_3166_1")
    @Expose
    var iso31661: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null
}