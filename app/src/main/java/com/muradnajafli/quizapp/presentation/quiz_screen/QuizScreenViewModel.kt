package com.muradnajafli.quizapp.presentation.quiz_screen

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.muradnajafli.quizapp.ui.theme.QuizBoxFalseBorderHighlightColor
import com.muradnajafli.quizapp.ui.theme.QuizBoxFalseHighlightColor
import com.muradnajafli.quizapp.ui.theme.QuizBoxTrueBorderHighlightColor
import com.muradnajafli.quizapp.ui.theme.QuizBoxTrueHighlightColor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class QuizScreenViewModel @Inject constructor() : ViewModel(){

    val backgroundColor = mutableStateListOf<Color>(Color.White, Color.White, Color.White, Color.White)
    val borderColor = mutableStateListOf<Color>(Color.Gray, Color.Gray, Color.Gray, Color.Gray)
    val answerState = mutableStateListOf<Boolean>(false, true, false, false)

    fun highLight(index: Int){
        backgroundColor.fill(Color.White)
        borderColor.fill(Color.Gray)

        val trueAnswer = answerState[index]

        if(trueAnswer) {
            backgroundColor[index] = QuizBoxTrueHighlightColor
            borderColor[index] = QuizBoxTrueBorderHighlightColor
        }else {
            backgroundColor[index] = QuizBoxFalseHighlightColor
            borderColor[index] = QuizBoxFalseBorderHighlightColor

            val trueIndex = answerState.indexOf(true)

            backgroundColor[trueIndex] = QuizBoxTrueHighlightColor
            borderColor[trueIndex] = QuizBoxTrueBorderHighlightColor
        }
    }

    fun handleNextButton(){
        //TODO
    }

    fun setTrueAnswer(index: Int){
        answerState.fill(false)
        answerState[index] = true
    }
}