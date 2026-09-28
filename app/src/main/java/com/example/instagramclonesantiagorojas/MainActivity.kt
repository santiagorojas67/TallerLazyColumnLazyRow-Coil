package com.example.instagramclonesantiagorojas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.instagramclonesantiagorojas.ui.screens.FeedScreen
import com.example.instagramclonesantiagorojas.ui.theme.InstagramclonesantiagorojasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InstagramclonesantiagorojasTheme {
                FeedScreen()
            }
        }
    }
}