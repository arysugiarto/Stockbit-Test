package com.stockbit.hiring.util

object Const {
    object Network {
        const val PREFIX_GENERAL = "v1/general/"
        const val PREFIX = "v1/"

        object Example {
            const val DATA_EXAMPLE =  "data/top/totaltoptiervolfull?limit=10&tsym=USD"
            const val DATA_EXAMPLES =  "data/top/pairs?fsym=BTC"
        }
    }

    object Access {
        const val AUTH_PREFIX = "Bearer"
    }



    object Database {
        const val DATABASE_NAME = "EXAMPLE_STOCKBIT"

        object Table {
            const val EXAMPLE = "product_entity"
        }
    }

    object DataStore{
        const val TOKEN = "TOKEN_KEY"
        const val USERNAME = "USERNAME"
    }

    object File {
        object Location {
            const val basePath = "Stockbit/"
            const val storePath = "STOCKBIT/"
        }

        object MimeType {
            const val image = "image/jpeg"
            const val pdf = "application/pdf"
        }

        object Image {
            const val defaultFileName = "STOCKBIT-Image"
        }

        object Pending {
            const val isPending = 1
            const val notPending = 0
        }
    }
}