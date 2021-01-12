package com.example.runningtrackerapp.repository

import com.example.runningtrackerapp.database.Run
import com.example.runningtrackerapp.database.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDao
) {

    suspend fun insertRun(run: Run) =
        runDao.insertRun(run)

    suspend fun deleteRun(run: Run) =
        runDao.deleteRun(run)

    fun getAllRunsSortedByDate() =
        runDao.getAllRunSortedByDate()

    fun getAllRunsSortedByDistance() =
        runDao.getAllRunSortedByDistance()

    fun getAllRunSortedByTimeInMillis() =
        runDao.getAllRunSortedByTimeInMillis()

    fun getAllRunSortedByAverageSpeed() =
        runDao.getAllRunSortedByAverageSpeed()

    fun getAllRunSortedByCaloriesBurned() =
        runDao.getAllRunSortedByCaloriesBurned()

    fun getTotalAverageSpeed() =
        runDao.getTotalAverageSpeed()

    fun getTotalDistance() =
        runDao.getTotalDistance()

    fun getTotalCaloriesBurned() =
        runDao.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() =
        runDao.getTotalTimeInMillis()

}