package com.muradnajafli.quizapp.data

import androidx.room.Query
import kotlinx.coroutines.flow.Flow

interface QuizRepository {
    fun getAllQuestions(): Flow<List<Question>>
    fun getQuestionsByCategory(category: QuestionCategory): Flow<List<Question>>
}