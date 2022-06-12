package com.application.viewmodelpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.application.viewmodelpractice.adapter.CustomAdapter
import com.application.viewmodelpractice.model.Plant
import com.application.viewmodelpractice.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val rv = findViewById<RecyclerView>(R.id.rv)

        viewModel.getAllData()

        viewModel.result.observe(this, Observer {

            val custonAdapter = CustomAdapter(this,it)
            rv.adapter = custonAdapter
            rv.layoutManager = LinearLayoutManager(this)
        })


    }
}