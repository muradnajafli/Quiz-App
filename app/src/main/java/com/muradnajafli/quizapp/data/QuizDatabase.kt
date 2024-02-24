package com.muradnajafli.quizapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Question::class], version = 1)
abstract class QuizDatabase : RoomDatabase(){
    abstract val quizDao: QuizDao
}