package com.muradnajafli.quizapp.data

import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface QuizRepository {

    suspend fun insert(question: Question)

    suspend fun delete(question: Question)

    fun getAllQuestions(): Flow<List<Question>>

    fun getQuestionsByCategory(category: QuestionCategory): Flow<List<Question>>

    suspend fun getQuestionById(id: Int): Question?
}