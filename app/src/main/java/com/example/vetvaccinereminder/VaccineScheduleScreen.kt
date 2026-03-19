package com.example.vetvaccinereminder

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun VaccineScheduleScreen() {

    var reminderEnabled by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Text("Vaccine Schedule", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(20.dp))

        Text("Pet: Bruno")
        Text("Next Vaccine: Rabies")
        Text("Date: 12 Aug 2026")

        Spacer(modifier = Modifier.height(20.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {

            Text("Reminder")

            Switch(
                checked = reminderEnabled,
                onCheckedChange = { reminderEnabled = it }
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {}) {
            Tgitext("Mark as Done")
        }
    }
}