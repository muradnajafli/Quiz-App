package com.muradnajafli.quizapp.data

import kotlinx.coroutines.flow.Flow

class QuizRepositoryImpl(
    private val quizDao: QuizDao
) : QuizRepository {

    override suspend fun insert(question: Question) {
        quizDao.insert(question)
    }

    override suspend fun delete(question: Question) {
        quizDao.delete(question)
    }

    override fun getAllQuestions(): Flow<List<Question>> {
        return quizDao.getAllQuestions()
    }

    override fun getQuestionsByCategory(category: QuestionCategory): Flow<List<Question>> {
        return quizDao.getQuestionsByCategory(category)
    }

    override suspend fun getQuestionById(id: Int): Question? {
        return quizDao.getQuestionById(id)
    }
}