package com.example.runningtrackerapp.di

import android.content.Context
import androidx.room.Room
import com.example.runningtrackerapp.database.RunningDatabase
import com.example.runningtrackerapp.other.Constants.RUNNING_DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

@Module
@InstallIn(
    ApplicationComponent::class
)
object AppModule {

    @Provides
    @Singleton
    fun provideRunningDatabase(
        @ApplicationContext
        context: Context
    ) = Room.databaseBuilder(
        context,
        RunningDatabase::class.java,
        RUNNING_DATABASE_NAME
    ).build()

    @Provides
    @Singleton
    fun provideRunDao(
        db : RunningDatabase
    ) = db.getRunDao()

}