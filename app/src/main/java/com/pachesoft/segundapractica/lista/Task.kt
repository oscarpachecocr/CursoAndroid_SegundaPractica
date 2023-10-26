package com.pachesoft.segundapractica.lista

data class Task(val name:String,
                val category: TaskCategory,
                val isSelected: Boolean=false)
{
}