package com.muradnajafli.quizapp.ui.home

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.muradnajafli.quizapp.ui.home.components.CategoriesPanel
import com.muradnajafli.quizapp.ui.home.components.StatsPanel
import com.muradnajafli.quizapp.ui.home.components.UserPanel

@Composable
@Preview(showBackground = true)
fun HomeScreen() {
    Scaffold {
        Column(
            modifier = Modifier.padding(it)
        ) {
            UserPanel()
            StatsPanel()
            CategoriesPanel()
        }
    }
}