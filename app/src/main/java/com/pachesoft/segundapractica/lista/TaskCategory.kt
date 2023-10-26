package com.pachesoft.segundapractica.lista

sealed class TaskCategory(var isSelected:Boolean=true) {
    object Desayuno: TaskCategory()
    object Almuerzo: TaskCategory()
    object Cena: TaskCategory()
}