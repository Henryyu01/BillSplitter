package com.hy.billsplitterandroid.ui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ExpenseItem(
    title: String,
    valueDescription: String,
    value: String,
    date: String,
) {
    Card(
        onClick = { },
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Row {
            Text(
                text = title,
                modifier = Modifier.padding(4.dp)
            )
            Text(
                text = valueDescription,
                modifier = Modifier.padding(4.dp)
            )
            Text(
                text = date,
                modifier = Modifier.padding(4.dp)
            )
            Text(
                text = value,
                textAlign = TextAlign.Right,
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Composable
@Preview
private fun ExpenseItemPreview() {
    ExpenseItem(
        title = "Groceries",
        valueDescription = "You owe: ",
        value = "$10.00",
        date = "August 14, 2024",
    )
}