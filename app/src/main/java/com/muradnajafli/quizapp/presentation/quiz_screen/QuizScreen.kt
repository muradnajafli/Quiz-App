package com.muradnajafli.quizapp.presentation.quiz_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.muradnajafli.quizapp.ui.theme.CircularProgressBarTrackColor
import com.muradnajafli.quizapp.ui.theme.LinearProgressColor
import com.muradnajafli.quizapp.ui.theme.NextButtonColor
import com.muradnajafli.quizapp.ui.theme.ProgressTextColor
import com.muradnajafli.quizapp.ui.theme.QuizQuestionBoxBackgroundColor

@Composable
fun QuizScreen(
    viewModel: QuizScreenViewModel = hiltViewModel()
) {

    viewModel.setTrueAnswer(0)

    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        )
        {
            Icon(Icons.Default.Close,
                contentDescription = "Close",
                modifier = Modifier
                    .width(50.dp)
                    .padding(8.dp)
                    .clickable { /*TODO*/ }
            )

            LinearProgressIndicator(
                progress = { 0.5f },
                color = LinearProgressColor,
                modifier = Modifier
                    .width(200.dp)
                    .height(8.dp)
                    .clip(shape = RoundedCornerShape(4.dp))
            )

            Text(text = "1/10",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                maxLines = 1,
                color = ProgressTextColor,
                modifier = Modifier
                    .width(50.dp)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(24.dp)
                .background(
                    color = QuizQuestionBoxBackgroundColor,
                    shape = RoundedCornerShape(24.dp)
                )
        ) {
                Box(modifier = Modifier
                    .size(50.dp).align(Alignment.TopCenter)
                    .absoluteOffset(y = (-25).dp),
                    contentAlignment = Alignment.Center,
                    ){
                    CircularProgressIndicator(
                        progress = { 0.5f },
                        modifier = Modifier
                            .size(50.dp),
                        color = ProgressTextColor,
                        strokeWidth = 5.dp,
                        strokeCap = StrokeCap.Round,
                        trackColor = CircularProgressBarTrackColor
                    )
                    Text(text = "30",
                        fontSize = 12.sp,
                        maxLines = 1,
                        color = Color.Black,
                        modifier = Modifier
                            .align(Alignment.Center),
                        )
                }
            
                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "This is an example question",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 36.dp, start = 8.dp, end = 8.dp, bottom = 8.dp)
                )
        }

        Column(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            QuizBox(
                text = "This is an example answer",
                backgroundColor = viewModel.backgroundColor[0],
                borderColor = viewModel.borderColor[0],
                textColor = viewModel.borderColor[0],
                onClick = { viewModel.highLight(0) }
            )
            QuizBox(
                text = "This is an example answer",
                backgroundColor = viewModel.backgroundColor[1],
                borderColor = viewModel.borderColor[1],
                textColor = viewModel.borderColor[1],
                onClick = { viewModel.highLight( 1) }
            )
            QuizBox(
                text = "This is an example answer",
                backgroundColor = viewModel.backgroundColor[2],
                borderColor = viewModel.borderColor[2],
                textColor = viewModel.borderColor[2],
                onClick = { viewModel.highLight( 2) }
            )
            QuizBox(
                text = "This is an example answer",
                backgroundColor = viewModel.backgroundColor[3],
                borderColor = viewModel.borderColor[3],
                textColor = viewModel.borderColor[3],
                onClick = { viewModel.highLight( 3) }
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        QuizBox(
            text = "Next",
            backgroundColor = NextButtonColor,
            borderColor = NextButtonColor,
            textColor = Color.White,
            onClick = { viewModel.highLight( 2) }
        )
        Spacer(modifier = Modifier.height(24.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewQuizScreen() {
    QuizScreen()
}