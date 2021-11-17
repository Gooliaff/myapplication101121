package com.example.myapplication101121

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userNameList: List<String> = listOf("Maxim", "Ivan", "Olga", "Elena", "Andrey", "Oleg")

        //  val carList: List<Car> = listOf(
        //  Car("Audi", "Red"),
        //   Car("BMW", "Blue"),
        //  Car("Ferrari", "White"),
        // Car("Ferrari", "White"),
        // Car("Ferrari", "White"),
        // Car("Ferrari", "White"),
        // Car("Ferrari", "White")
        //)
        val bannerList: List<Banner> = listOf(
            Banner(R.drawable.android_card, "Hello"),
            Banner(R.drawable.android_card, "Bye"),
            Banner(R.drawable.android_card, "Bye"),
            Banner(R.drawable.android_card, "Bye"),
            Banner(R.drawable.android_card, "Bye"),
            Banner(R.drawable.android_card, "Bye"),
            Banner(R.drawable.android_card, "Bye")
        )


        val cityList: List<City> = listOf(
            City("Москва", 11514370),
            City("Санкт-Петербург", 4848814),
            City("Новосибирск", 1499011),
            City("Екатеринбург", 1377792),
            City("Нижний Новгород", 1250639)
        )


        val res_button: TextView = findViewById(R.id.button_true)
        res_button.setOnClickListener {
            val intent = Intent(this, New_main::class.java)
            startActivity(intent)


            val res_button2: TextView = findViewById(R.id.button_true2)
            res_button2.setOnClickListener {
                val intent = Intent(this, QuestActivity::class.java)
                startActivity(intent)


                // val usersRecyclerView: RecyclerView = findViewById(R.id.users_recycler_view)
                // usersRecyclerView.layoutManager =
                // LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


                //usersRecyclerView.addItemDecoration(
                // DividerItemDecoration(
                // this,
                // DividerItemDecoration.VERTICAL
                // )
                // )
                // usersRecyclerView.adapter = UserAdapter(userNameList)
                // usersRecyclerView.adapter = CarAdapter(carList)
                //usersRecyclerView.adapter = CityAdapter(cityList)
//usersRecyclerView.adapter = BannerAdapter(bannerList)
            }
        }
    }}