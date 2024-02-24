package com.muradnajafli.quizapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "questions")
data class Question(
    @PrimaryKey(autoGenerate = true) val id : Int,
    val question: String,
    val trueAnswer: String,
    val falseAnswer1 : String,
    val falseAnswer2 : String,
    val questionCategory: QuestionCategory
)
