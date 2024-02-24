package com.muradnajafli.quizapp.data

import kotlinx.coroutines.flow.Flow

class QuizRepositoryImpl(
    private val quizDao: QuizDao
) : QuizRepository {
    override fun getAllQuestions(): Flow<List<Question>> {
        return quizDao.getAllQuestions()
    }
    override fun getQuestionsByCategory(category: QuestionCategory): Flow<List<Question>> {
        return quizDao.getQuestionsByCategory(category)
    }
}