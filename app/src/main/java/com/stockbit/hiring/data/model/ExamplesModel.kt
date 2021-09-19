package com.stockbit.hiring.data.model


import com.google.gson.annotations.SerializedName

data class ExamplesModel(
    @SerializedName("SponsoredData")
    var sponsoredData: List<SponsoredData>,
    @SerializedName("Data")
    var `data`: List<Data>
) {
    data class SponsoredData(
        @SerializedName("CoinInfo")
        var coinInfo: CoinInfo
    ) {
        data class CoinInfo(
            @SerializedName("Id")
            var id: String,
            @SerializedName("Name")
            var name: String,
            @SerializedName("FullName")
            var fullName: String,
            @SerializedName("Internal")
            var `internal`: String,
            @SerializedName("ImageUrl")
            var imageUrl: String,
            @SerializedName("Url")
            var url: String,
            @SerializedName("Algorithm")
            var algorithm: String,
            @SerializedName("ProofType")
            var proofType: String,
            @SerializedName("Rating")
            var rating: Rating,
            @SerializedName("NetHashesPerSecond")
            var netHashesPerSecond: Int,
            @SerializedName("BlockNumber")
            var blockNumber: Int,
            @SerializedName("BlockTime")
            var blockTime: Int,
            @SerializedName("BlockReward")
            var blockReward: Int,
            @SerializedName("AssetLaunchDate")
            var assetLaunchDate: String,
            @SerializedName("MaxSupply")
            var maxSupply: Int,
            @SerializedName("Type")
            var type: Int,
            @SerializedName("DocumentType")
            var documentType: String
        ) {
            data class Rating(
                @SerializedName("Weiss")
                var weiss: Weiss
            ) {
                data class Weiss(
                    @SerializedName("Rating")
                    var rating: String,
                    @SerializedName("TechnologyAdoptionRating")
                    var technologyAdoptionRating: String,
                    @SerializedName("MarketPerformanceRating")
                    var marketPerformanceRating: String
                )
            }
        }
    }

    data class Data(
        @SerializedName("CoinInfo")
        var coinInfo: CoinInfo,
        @SerializedName("RAW")
        var rAW: RAW,
        @SerializedName("DISPLAY")
        var dISPLAY: DISPLAY
    ) {
        data class CoinInfo(
            @SerializedName("Id")
            var id: String,
            @SerializedName("Name")
            var name: String,
            @SerializedName("FullName")
            var fullName: String,
            @SerializedName("Internal")
            var `internal`: String,
            @SerializedName("ImageUrl")
            var imageUrl: String,
            @SerializedName("Url")
            var url: String,
            @SerializedName("Algorithm")
            var algorithm: String,
            @SerializedName("ProofType")
            var proofType: String,
            @SerializedName("Rating")
            var rating: Rating,
            @SerializedName("NetHashesPerSecond")
            var netHashesPerSecond: Int,
            @SerializedName("BlockNumber")
            var blockNumber: Int,
            @SerializedName("BlockTime")
            var blockTime: Int,
            @SerializedName("BlockReward")
            var blockReward: Double,
            @SerializedName("AssetLaunchDate")
            var assetLaunchDate: String,
            @SerializedName("MaxSupply")
            var maxSupply: Double,
            @SerializedName("Type")
            var type: Int,
            @SerializedName("DocumentType")
            var documentType: String
        ) {
            data class Rating(
                @SerializedName("Weiss")
                var weiss: Weiss
            ) {
                data class Weiss(
                    @SerializedName("Rating")
                    var rating: String,
                    @SerializedName("TechnologyAdoptionRating")
                    var technologyAdoptionRating: String,
                    @SerializedName("MarketPerformanceRating")
                    var marketPerformanceRating: String
                )
            }
        }

        data class RAW(
            @SerializedName("USD")
            var uSD: USD
        ) {
            data class USD(
                @SerializedName("TYPE")
                var tYPE: String,
                @SerializedName("MARKET")
                var mARKET: String,
                @SerializedName("FROMSYMBOL")
                var fROMSYMBOL: String,
                @SerializedName("TOSYMBOL")
                var tOSYMBOL: String,
                @SerializedName("FLAGS")
                var fLAGS: String,
                @SerializedName("PRICE")
                var pRICE: Double,
                @SerializedName("LASTUPDATE")
                var lASTUPDATE: Int,
                @SerializedName("MEDIAN")
                var mEDIAN: Double,
                @SerializedName("LASTVOLUME")
                var lASTVOLUME: Double,
                @SerializedName("LASTVOLUMETO")
                var lASTVOLUMETO: Double,
                @SerializedName("LASTTRADEID")
                var lASTTRADEID: String,
                @SerializedName("VOLUMEDAY")
                var vOLUMEDAY: Double,
                @SerializedName("VOLUMEDAYTO")
                var vOLUMEDAYTO: Double,
                @SerializedName("VOLUME24HOUR")
                var vOLUME24HOUR: Double,
                @SerializedName("VOLUME24HOURTO")
                var vOLUME24HOURTO: Double,
                @SerializedName("OPENDAY")
                var oPENDAY: Double,
                @SerializedName("HIGHDAY")
                var hIGHDAY: Int,
                @SerializedName("LOWDAY")
                var lOWDAY: Double,
                @SerializedName("OPEN24HOUR")
                var oPEN24HOUR: Double,
                @SerializedName("HIGH24HOUR")
                var hIGH24HOUR: Double,
                @SerializedName("LOW24HOUR")
                var lOW24HOUR: Double,
                @SerializedName("LASTMARKET")
                var lASTMARKET: String,
                @SerializedName("VOLUMEHOUR")
                var vOLUMEHOUR: Double,
                @SerializedName("VOLUMEHOURTO")
                var vOLUMEHOURTO: Double,
                @SerializedName("OPENHOUR")
                var oPENHOUR: Double,
                @SerializedName("HIGHHOUR")
                var hIGHHOUR: Double,
                @SerializedName("LOWHOUR")
                var lOWHOUR: Double,
                @SerializedName("TOPTIERVOLUME24HOUR")
                var tOPTIERVOLUME24HOUR: Double,
                @SerializedName("TOPTIERVOLUME24HOURTO")
                var tOPTIERVOLUME24HOURTO: Double,
                @SerializedName("CHANGE24HOUR")
                var cHANGE24HOUR: Double,
                @SerializedName("CHANGEPCT24HOUR")
                var cHANGEPCT24HOUR: Double,
                @SerializedName("CHANGEDAY")
                var cHANGEDAY: Double,
                @SerializedName("CHANGEPCTDAY")
                var cHANGEPCTDAY: Double,
                @SerializedName("CHANGEHOUR")
                var cHANGEHOUR: Double,
                @SerializedName("CHANGEPCTHOUR")
                var cHANGEPCTHOUR: Double,
                @SerializedName("CONVERSIONTYPE")
                var cONVERSIONTYPE: String,
                @SerializedName("CONVERSIONSYMBOL")
                var cONVERSIONSYMBOL: String,
                @SerializedName("SUPPLY")
                var sUPPLY: Int,
                @SerializedName("MKTCAP")
                var mKTCAP: Double,
                @SerializedName("MKTCAPPENALTY")
                var mKTCAPPENALTY: Int,
                @SerializedName("CIRCULATINGSUPPLY")
                var cIRCULATINGSUPPLY: Int,
                @SerializedName("CIRCULATINGSUPPLYMKTCAP")
                var cIRCULATINGSUPPLYMKTCAP: Double,
                @SerializedName("TOTALVOLUME24H")
                var tOTALVOLUME24H: Double,
                @SerializedName("TOTALVOLUME24HTO")
                var tOTALVOLUME24HTO: Double,
                @SerializedName("TOTALTOPTIERVOLUME24H")
                var tOTALTOPTIERVOLUME24H: Double,
                @SerializedName("TOTALTOPTIERVOLUME24HTO")
                var tOTALTOPTIERVOLUME24HTO: Double,
                @SerializedName("IMAGEURL")
                var iMAGEURL: String
            )
        }

        data class DISPLAY(
            @SerializedName("USD")
            var uSD: USD
        ) {
            data class USD(
                @SerializedName("FROMSYMBOL")
                var fROMSYMBOL: String,
                @SerializedName("TOSYMBOL")
                var tOSYMBOL: String,
                @SerializedName("MARKET")
                var mARKET: String,
                @SerializedName("PRICE")
                var pRICE: String,
                @SerializedName("LASTUPDATE")
                var lASTUPDATE: String,
                @SerializedName("LASTVOLUME")
                var lASTVOLUME: String,
                @SerializedName("LASTVOLUMETO")
                var lASTVOLUMETO: String,
                @SerializedName("LASTTRADEID")
                var lASTTRADEID: String,
                @SerializedName("VOLUMEDAY")
                var vOLUMEDAY: String,
                @SerializedName("VOLUMEDAYTO")
                var vOLUMEDAYTO: String,
                @SerializedName("VOLUME24HOUR")
                var vOLUME24HOUR: String,
                @SerializedName("VOLUME24HOURTO")
                var vOLUME24HOURTO: String,
                @SerializedName("OPENDAY")
                var oPENDAY: String,
                @SerializedName("HIGHDAY")
                var hIGHDAY: String,
                @SerializedName("LOWDAY")
                var lOWDAY: String,
                @SerializedName("OPEN24HOUR")
                var oPEN24HOUR: String,
                @SerializedName("HIGH24HOUR")
                var hIGH24HOUR: String,
                @SerializedName("LOW24HOUR")
                var lOW24HOUR: String,
                @SerializedName("LASTMARKET")
                var lASTMARKET: String,
                @SerializedName("VOLUMEHOUR")
                var vOLUMEHOUR: String,
                @SerializedName("VOLUMEHOURTO")
                var vOLUMEHOURTO: String,
                @SerializedName("OPENHOUR")
                var oPENHOUR: String,
                @SerializedName("HIGHHOUR")
                var hIGHHOUR: String,
                @SerializedName("LOWHOUR")
                var lOWHOUR: String,
                @SerializedName("TOPTIERVOLUME24HOUR")
                var tOPTIERVOLUME24HOUR: String,
                @SerializedName("TOPTIERVOLUME24HOURTO")
                var tOPTIERVOLUME24HOURTO: String,
                @SerializedName("CHANGE24HOUR")
                var cHANGE24HOUR: String,
                @SerializedName("CHANGEPCT24HOUR")
                var cHANGEPCT24HOUR: String,
                @SerializedName("CHANGEDAY")
                var cHANGEDAY: String,
                @SerializedName("CHANGEPCTDAY")
                var cHANGEPCTDAY: String,
                @SerializedName("CHANGEHOUR")
                var cHANGEHOUR: String,
                @SerializedName("CHANGEPCTHOUR")
                var cHANGEPCTHOUR: String,
                @SerializedName("CONVERSIONTYPE")
                var cONVERSIONTYPE: String,
                @SerializedName("CONVERSIONSYMBOL")
                var cONVERSIONSYMBOL: String,
                @SerializedName("SUPPLY")
                var sUPPLY: String,
                @SerializedName("MKTCAP")
                var mKTCAP: String,
                @SerializedName("MKTCAPPENALTY")
                var mKTCAPPENALTY: String,
                @SerializedName("CIRCULATINGSUPPLY")
                var cIRCULATINGSUPPLY: String,
                @SerializedName("CIRCULATINGSUPPLYMKTCAP")
                var cIRCULATINGSUPPLYMKTCAP: String,
                @SerializedName("TOTALVOLUME24H")
                var tOTALVOLUME24H: String,
                @SerializedName("TOTALVOLUME24HTO")
                var tOTALVOLUME24HTO: String,
                @SerializedName("TOTALTOPTIERVOLUME24H")
                var tOTALTOPTIERVOLUME24H: String,
                @SerializedName("TOTALTOPTIERVOLUME24HTO")
                var tOTALTOPTIERVOLUME24HTO: String,
                @SerializedName("IMAGEURL")
                var iMAGEURL: String
            )
        }
    }
}