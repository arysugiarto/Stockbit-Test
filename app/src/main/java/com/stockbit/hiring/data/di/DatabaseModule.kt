package com.stockbit.hiring.data.di

import android.content.Context
import androidx.room.Room
import com.stockbit.hiring.data.local.StockbitTest
import com.stockbit.hiring.util.Const
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext context: Context) =
            Room.databaseBuilder(
                context,
                StockbitTest::class.java,
                Const.Database.DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideUserDao(database: StockbitTest) = database.exampleDao()

    // Todo : Inject Dao Here
}