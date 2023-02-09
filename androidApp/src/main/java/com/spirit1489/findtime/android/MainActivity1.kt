package com.spirit1489.findtime.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.material.TopAppBar
import com.spirit1489.findtime.android.ui.MainView
import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier

class MainActivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // 1
            Napier.base(DebugAntilog())
            setContent {
// 2
                MainView {
// 3
                    TopAppBar(title = {
// 4
                        when (it) {
                            0 -> Text(
                                text = "World Clocks"
                            )
                            else -> Text(text = "Find Meeting Time")
                        }
                    })
                }
            }
        }
    }
}



