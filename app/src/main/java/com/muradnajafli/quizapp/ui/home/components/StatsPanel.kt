package com.muradnajafli.quizapp.ui.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.muradnajafli.quizapp.R

@Composable
fun StatsItem(
    iconId: Int,
    title: String,
    value: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(8.dp)
    ) {
        Image(
            painter = painterResource(id = iconId),
            contentDescription = title,
            modifier = Modifier.size(50.dp)
        )
        Column(
            modifier = Modifier.padding(
                start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp
            )
        ) {
            Text(
                text = title,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = value,
                fontSize = 24.sp,
                color = Color.Cyan,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
@Preview
fun StatsPanel() {
    Row(
        modifier = Modifier
            .padding(16.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Color.White)
            .fillMaxWidth()
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier.weight(1f)
        ) {
            StatsItem(
                iconId = R.drawable.cup,
                title = "Ranking",
                value = "348"
            )
        }
        VerticalDivider(
            modifier = Modifier
                .width(20.dp)
                .height(50.dp),
            color = Color.Black
        )
        Box(
            modifier = Modifier.weight(1f)
        ) {
            StatsItem(
                iconId = R.drawable.coin,
                title = "Points",
                value = "12"
            )
        }
    }
}
