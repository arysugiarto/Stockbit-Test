package com.stockbit.hiring.data.model


import com.google.gson.annotations.SerializedName

data class Test(
    @SerializedName("Data")
    var `data`: List<Data>
) {
    data class Data(
        @SerializedName("exchange")
        var exchange: String,
        @SerializedName("fromSymbol")
        var fromSymbol: String,
        @SerializedName("toSymbol")
        var toSymbol: String,
        @SerializedName("volume24h")
        var volume24h: Double,
        @SerializedName("volume24hTo")
        var volume24hTo: Double,
        @SerializedName("price")
        var price: Double,
        @SerializedName("lastUpdateTs")
        var lastUpdateTs: Int,
        @SerializedName("exchangeGradePoints")
        var exchangeGradePoints: Int,
        @SerializedName("exchangeGrade")
        var exchangeGrade: String
    )
}