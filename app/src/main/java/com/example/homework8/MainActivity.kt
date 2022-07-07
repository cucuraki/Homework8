package com.example.homework8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.getStarted.setOnClickListener {
            goToAuthorizeActivity()
        }
    }
    //I don't think that's a good idea, but
    //last subject was lifecycle methods, so...
    override fun onStop() {
        super.onStop()
        finish()
    }
    private fun goToAuthorizeActivity(){
        val intent = Intent(this, AuthorizeActivity::class.java)
        startActivity(intent)
        //finish()
    }
}