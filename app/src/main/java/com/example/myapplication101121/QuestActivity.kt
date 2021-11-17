package com.example.myapplication101121

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class QuestActivity : AppCompatActivity() {


    var questions = listOf(
        "Какой океан омывает восточное побережье США? \n\n A) Атлантический \n\n B) Тихий \n\n C) Индийский",
        "Между какими странами находится Берингов пролив? \n\n A) Франция и Великобритания \n\n B) США и Россия \n\n C) Финляндия и Россия",
        "Какая самая длинная река в мире? \n\n A) Нил \n\n B) Амазонка \n\n C) Конго",
        "Какая самый глубокий океан на Земле? \n\n A) Северный Ледовитый \n\n B) Индийский \n\n C) Тихий",
        "Какова длина экватора? \n\n A) Приблизительно 30 тысяч километров \n\n B) Приблизительно 40 тысяч километров \n\n C) Приблизительно 50 тысяч километров",
        "Какая самая большая в мире пустыня? \n\n A) Сахара \n\n B) Гоби \n\n C) Калахари",
        "Какая самая маленькая страна мира по площади? \n\n A) Монако \n\n B) Ватикан \n\n C) Гибралтар",
        "Какой самый большой остров? \n\n A) Гренландия \n\n B) Новая Гвинея \n\n C) Мадагаскар",
        "Со сколькими странами граничит Россия? \n\n A) 11 \n\n B) 16 \n\n C) 18",
        "Какова примерная численность населения Земли? \n\n A) 7,7 млрд человек \n\n B) 9,4 млрд человек \n\n C) 11,7 млрд человек"

    )


    var rightAnswers = listOf(1, 2, 2, 3, 2, 1, 2, 1, 3, 1)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quest)
        val button_One: Button = findViewById(R.id.button1)
        val button_Two: Button = findViewById(R.id.button2)
        val button_Tree: Button = findViewById(R.id.button3)



        button_One.setOnClickListener {
            showToast(1)
        }

        button_Two.setOnClickListener {
            showToast(2)
        }

        button_Tree.setOnClickListener {
            showToast(3)
        }

    }

    var counter = 1

    fun showToast(answer: Int) {
        if (answer == rightAnswers.get(questionNo)) {
            Toast.makeText(applicationContext, "Верно!", Toast.LENGTH_SHORT).show()
            this.updateQuestion()
            counter += 1
        } else {
            Toast.makeText(applicationContext, "Подумайте еще!", Toast.LENGTH_SHORT).show()
        }
    }

    var questionNo = 0

    fun updateQuestion() {
        questionNo += 1
        val textQuest: TextView = findViewById(R.id.textField2)
        if (questionNo <= 9) {

            textQuest.setText(questions.get(questionNo))

        } else textQuest.setText("Показать результаты?")

        val result_Score: TextView = findViewById(R.id.button4)

        val procent = counter * 100 / 10

        result_Score.setOnClickListener {
            result_Score.text = "Ваш результат: ${procent} %"

        }

    }
}
