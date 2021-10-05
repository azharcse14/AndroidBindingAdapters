package com.azhar.androidbindingadapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.azhar.androidbindingadapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val post = Post("Introduction to Kotlin",
            "Learn the basics of Kotlin, a modern programming language that allows you to express your ideas in a concise way.",
            "https://res.cloudinary.com/practicaldev/image/fetch/s--atJ3Q0XA--/c_imagga_scale,f_auto,fl_progressive,h_420,q_auto,w_1000/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/ptvv9ewtvq7bocu1kq12.png"
        )

        binding.post = post
    }
}