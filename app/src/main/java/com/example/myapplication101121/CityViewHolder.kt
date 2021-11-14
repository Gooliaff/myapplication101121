package com.example.myapplication101121

import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(city: City) {
        val citynameTextView: TextView = itemView.findViewById(R.id.city_name_text_view)
        val citysizeTextView: TextView = itemView.findViewById(R.id.city_size_text_view)

        citynameTextView.text = city.name
        citysizeTextView.text = city.size.toString()


        val toastButton: Button = itemView.findViewById(R.id.toast_button)
        toastButton.setOnClickListener {
            Toast.makeText(itemView.context, city.size.toString(), Toast.LENGTH_LONG).show()
        }
    }
}