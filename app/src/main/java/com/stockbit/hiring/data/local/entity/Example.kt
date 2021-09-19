package com.stockbit.hiring.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.stockbit.hiring.util.Const

@Entity(tableName = Const.Database.Table.EXAMPLE)
data class Example(
    @PrimaryKey
    var id: Long
)
