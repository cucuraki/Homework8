package com.example.homework8

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.homework8.databinding.ActivityAuthorizeBinding

class AuthorizeActivity: AppCompatActivity(){
    private lateinit var binding: ActivityAuthorizeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthorizeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}