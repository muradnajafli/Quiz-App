package com.muradnajafli.quizapp.presentation.quiz_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun QuizBox(
            text : String,
            backgroundColor : Color = Color.White,
            textColor : Color = Color.Gray,
            borderColor : Color = Color.LightGray,
            onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(75.dp)
            .padding(horizontal = 24.dp, vertical = 8.dp)
            .border(3.dp, borderColor, RoundedCornerShape(24.dp))
            .background(backgroundColor, RoundedCornerShape(24.dp))
            .clickable { onClick() }
    ) {
        Text(text = text, fontSize = 20.sp, color = textColor,
            modifier = Modifier.fillMaxSize().wrapContentHeight(),
            textAlign = TextAlign.Center,
            )
    }
}

@Preview(showBackground = true)
@Composable
fun QuizAnswerPreview() {
    QuizBox(text = "This is an example answer") {}
}