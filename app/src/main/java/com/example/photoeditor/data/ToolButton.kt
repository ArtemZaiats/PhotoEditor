package com.example.photoeditor.data

data class ToolButton(
    val tool: TOOL,
    val onClick: () -> Unit,
    val icon: Int = 0
)
