package com.example.vetvaccinereminder

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PetRegistrationScreen(modifier: Modifier = Modifier) { // ✅ added modifier

    var petName by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var breed by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }

    Column(
        modifier = modifier // use passed modifier here
            .fillMaxSize()
            .padding(20.dp)
    ) {

        Text("Pet Registration", style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(
            value = petName,
            onValueChange = { petName = it },
            label = { Text("Pet Name") }
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = age,
            onValueChange = { age = it },
            label = { Text("Age") }
        )

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = breed,
            onValueChange = { breed = it },
            label = { Text("Breed") }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            message = if (petName.isNotEmpty()) "Pet Saved!" else "Enter pet name"
        }) {
            Text("Save Pet")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(message)
    }
}