package com.muradnajafli.quizapp.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muradnajafli.quizapp.R

data class CategoriesItem(
    val iconId: Int,
    val title: String,
    val questionsCount: Int
)

val categories = listOf(
    CategoriesItem(
        iconId = R.drawable.science,
        title = "Science",
        questionsCount = 10
    ),
    CategoriesItem(
        iconId = R.drawable.history,
        title = "History",
        questionsCount = 10
    ),
    CategoriesItem(
        iconId = R.drawable.technology,
        title = "Technology",
        questionsCount = 10
    )
)

@Composable
@Preview
fun CategoriesPanel() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = "Let's play!",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            content = {
                items(categories) { category ->
                    CategoryItem(category)
                }
            }
        )
    }
}

@Composable
fun CategoryItem(category: CategoriesItem) {
    Card(
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(top = 8.dp, start = 8.dp, end = 8.dp, bottom = 8.dp)
        ) {
            Image(
                painter = painterResource(id = category.iconId),
                contentDescription = "Category icon",
                modifier = Modifier
                    .size(100.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = category.title,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Text(
                text = "${category.questionsCount} questions",
                fontSize = 14.sp,
            )
        }
    }
}
