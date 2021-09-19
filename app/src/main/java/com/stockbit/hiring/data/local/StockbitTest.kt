package com.stockbit.hiring.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.stockbit.hiring.data.local.dao.ExampleDao
import com.stockbit.hiring.data.local.entity.Example

@Database(
    entities = [Example::class],
    version = 1,
    exportSchema = false
)
abstract class StockbitTest : RoomDatabase() {
    abstract fun exampleDao(): ExampleDao

    // Todo Add More Dao
}