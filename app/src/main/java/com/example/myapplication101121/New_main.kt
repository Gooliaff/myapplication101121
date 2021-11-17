package com.example.myapplication101121

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class New_main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_main)

        val carList: List<Car> = listOf(
            Car("Audi", "Red"),
            Car("BMW", "Blue"),
            Car("Ferrari", "White"),
            Car("Ferrari", "White"),
            Car("Ferrari", "White"),
            Car("Ferrari", "White"),
            Car("Ferrari", "White")
        )

        val usersRecyclerView: RecyclerView = findViewById(R.id.users_recycler_view)
        usersRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        usersRecyclerView.adapter = CarAdapter(carList)


    }
}