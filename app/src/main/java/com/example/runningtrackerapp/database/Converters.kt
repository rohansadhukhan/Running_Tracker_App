package com.example.runningtrackerapp.database

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverters
import java.io.ByteArrayOutputStream

class Converters {

    @TypeConverters
    fun fromBitmap(
        bmp: Bitmap
    ): ByteArray {
        val outputStream = ByteArrayOutputStream()
        bmp.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
        return outputStream.toByteArray()
    }

    @TypeConverters
    fun tpByteArray(
        bytes: ByteArray
    ): Bitmap =
        BitmapFactory.decodeByteArray(bytes, 0, bytes.size)

}