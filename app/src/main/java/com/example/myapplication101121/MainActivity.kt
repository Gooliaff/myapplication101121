package com.example.myapplication101121

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userNameList: List<String> = listOf("Maxim", "Ivan", "Olga", "Elena", "Andrey", "Oleg")

        val carList: List<Car> = listOf(
            Car("Audi", "Red", 300),
            Car("BMW", "Blue", 350),
            Car("Ferrari", "White", 450)
        )
val bannerList:List<Banner> = listOf(
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
            City("Екатеринбург",1377792),
            City("Нижний Новгород", 1250639)
        )

        val usersRecyclerView: RecyclerView = findViewById(R.id.users_recycler_view)
        usersRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


        //usersRecyclerView.addItemDecoration(
          //  DividerItemDecoration(
            //    this,
              //  DividerItemDecoration.VERTICAL
            //)
                //)
          // usersRecyclerView.adapter = UserAdapter(userNameList)
                //usersRecyclerView.adapter = CarAdapter(carList)
        //usersRecyclerView.adapter = CityAdapter(cityList)
usersRecyclerView.adapter = BannerAdapter(bannerList)
    }
}