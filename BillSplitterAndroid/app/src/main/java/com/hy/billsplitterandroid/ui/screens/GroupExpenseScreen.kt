package com.hy.billsplitterandroid.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hy.billsplitterandroid.data.Expense

@Composable
fun GroupExpenseScreen(
    group: String,
    expenses: List<Expense>,
) {
    Column {
        Text(
            text = group,
            modifier = Modifier
                .padding(4.dp)
                .align(Alignment.CenterHorizontally)
        )
        HorizontalDivider()
        expenses.forEach { expense ->
            ExpenseItem(
                title = expense.title,
                value = expense.value,
                date = expense.date,
            )
        }
    }

}

@Preview
@Composable
private fun PreviewGroupExpenseScreen() {
    GroupExpenseScreen(
        group = "Home",
        expenses = listOf(
            Expense(
                title = "Groceries",
                date = "May 02, 2024",
                value = "You owe: $20",
                valueDescription = "You owe:"
            ),
            Expense(
                title = "Dinner",
                date = "May 12, 2024",
                value = "You are owed: $50",
                valueDescription = "You owe:"
            )
        )
    )
}