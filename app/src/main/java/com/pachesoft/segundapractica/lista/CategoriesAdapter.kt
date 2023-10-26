package com.pachesoft.segundapractica.lista

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pachesoft.segundapractica.R

class CategoriesAdapter(
    private val categories:List<TaskCategory>,
    private val OnItemSelected:(Int)->Unit
    ): RecyclerView.Adapter<CategoriesViewHolder>()
{
    //Crear una vista para montar y enviar al onBindViewHolder, para que él la cree!
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_task_category, parent,false)
        return  CategoriesViewHolder(view)
    }

    //Permitirá recuperar la cantidad de elementos que están dentro del la lista!
    override fun getItemCount() = categories.size

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}