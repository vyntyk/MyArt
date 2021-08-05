package com.example.myart

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose

//@Generated("jsonschema2pojo")
class ProductionCompany {
    @SerializedName("id")
    @Expose
    var id: Int? = null

    @SerializedName("logo_path")
    @Expose
    var logoPath: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null

    @SerializedName("origin_country")
    @Expose
    var originCountry: String? = null
}