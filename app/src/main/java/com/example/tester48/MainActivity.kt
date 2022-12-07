 package com.example.tester48

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tester48.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding
     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)
         initClicker()
     }

     private fun initClicker() {
         with(binding) {
             calculate.setOnClickListener {
                 resultTv.text = Math().add(firstEd.text.toString(), secondEd.text.toString())
             }
         }
     }
 }