package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    class MyHandler {
        fun onDelete() {
            // ...
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.mybutton.setOnClickListener(){

            if (binding.mybutton.text == "Отобразить") {
                binding.mybutton.text = "Скрыть"
                binding.textView.isVisible = true
            }
            else {
                binding.mybutton.text = "Отобразить"
                binding.textView.isVisible = false
            }
        }

    }
}