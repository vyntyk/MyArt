package com.example.myart

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

//@Generated("jsonschema2pojo")
class Genre {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("name")
    @Expose
    var name: String? = null
}