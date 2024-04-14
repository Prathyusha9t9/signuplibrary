package com.example.signuplibrary

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.signuplibrary.databinding.ActivityRegisterBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegisterActivity : AppCompatActivity() {
        private lateinit var binding: ActivityRegisterBinding
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register)
            var registerViewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)
            binding.lifecycleOwner = this
            binding.registerviewmodel = registerViewModel
            registerViewModel.getRegistrationDetails().observe(this, object : Observer<RegisterModel> {
                override fun onChanged(value: RegisterModel) {
                    println("value $value")
                }
            })

            val allData = registerViewModel.getAllInsertedData()
            println("allData $allData")

        enableEdgeToEdge()
//        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val go_to_sign_in = findViewById<TextView>(R.id.go_to_sign_in)
        go_to_sign_in.setOnClickListener {
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}