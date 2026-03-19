package com.example.vetvaccinereminder

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HealthRecordScreen(modifier: Modifier = Modifier) { // ✅ added modifier

    var vaccine by remember { mutableStateOf("") }
    var allergy by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") } // ✅ feedback message

    Column(
        modifier = modifier // use passed modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Text("Health Record", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(20.dp))

        Card(modifier = Modifier.fillMaxWidth()) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Pet Name: Bruno")
                Text("Breed: Labrador")
                Text("Age: 3 years")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = vaccine,
            onValueChange = { vaccine = it },
            label = { Text("Last Vaccine") }
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = allergy,
            onValueChange = { allergy = it },
            label = { Text("Allergy Notes") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            message = if (vaccine.isNotEmpty() || allergy.isNotEmpty()) "Health Record Saved!" else "Enter details"
        }) {
            Text("Save")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(message) // ✅ show feedback message
    }
}