package com.spirit1489.compose.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.rememberDialogState
import com.spirit1489.compose.ui.onDismissType

@Composable
actual fun MeetingDialogWrapper(
    onDismiss: onDismissType, content:
    @Composable () -> Unit
) {
    Dialog(
        onCloseRequest = { onDismiss() },
        title = "Meetings",
        state = rememberDialogState(
            size = DpSize(
                width = 400.dp, height =
                Dp.Unspecified
            )
        ),
        content = {
            content()
        })
}
