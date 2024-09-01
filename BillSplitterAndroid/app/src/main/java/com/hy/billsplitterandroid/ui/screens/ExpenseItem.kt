package com.hy.billsplitterandroid.ui.screens

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ListItem
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
    value: String,
    date: String,
) {
    ListItem(
        headlineContent = {
            Text(
                text = title,
                modifier = Modifier.padding(4.dp)
            )
        },
        supportingContent = {
            Text(
                text = date,
                modifier = Modifier.padding(4.dp)
            )
        },
        trailingContent = {
            Row {
                Text(
                    text = value,
                    textAlign = TextAlign.Right,
                    modifier = Modifier.padding(4.dp)
                )
            }
        }
    )
}

@Composable
@Preview
private fun ExpenseItemPreview() {
    ExpenseItem(
        title = "Groceries",
        value = "You owe: $10.00",
        date = "August 14, 2024",
    )
}