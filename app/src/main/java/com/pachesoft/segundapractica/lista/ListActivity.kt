package com.pachesoft.segundapractica.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.pachesoft.segundapractica.R

class ListActivity : AppCompatActivity() {

    private lateinit var rvCategories: RecyclerView
    private lateinit var rvTask: RecyclerView
    private lateinit var fabAddTask: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        initComponents()
    }

    fun initComponents(){
        rvCategories=findViewById(R.id.rvCategeries)
        rvTask=findViewById(R.id.rvTasks)
        fabAddTask=findViewById(R.id.fabAddTask)
    }

    fun setListeners(){
        fabAddTask.setOnClickListener{showDialog()}
    }

    private fun showDialog() {
        TODO("Not yet implemented")
    }
}