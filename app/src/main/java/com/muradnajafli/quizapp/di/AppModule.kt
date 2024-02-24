package com.muradnajafli.quizapp.di

import android.app.Application
import androidx.room.Room
import com.muradnajafli.quizapp.data.QuizDao
import com.muradnajafli.quizapp.data.QuizDatabase
import com.muradnajafli.quizapp.data.QuizRepository
import com.muradnajafli.quizapp.data.QuizRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideQuizDatabase(app: Application): QuizDatabase {
        return Room.databaseBuilder(
            app,
            QuizDatabase::class.java,
            "quiz_db"
        ).createFromAsset("database/quiz.db")
            .build()
    }

    @Provides
    @Singleton
    fun provideQuizRepository(dao: QuizDao): QuizRepository {
        return QuizRepositoryImpl(dao)
    }
}