package com.example.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.mainActivityNesnesi = this

        viewModel.sonuc.observe(this){
            binding.hesaplamaSonucu =it
        }


    }

    fun topla(alinanSayi1: String, alinanSayi2: String) {

        viewModel.topla(alinanSayi1, alinanSayi2)    // işlem yapıyo

    }

    fun carp(alinanSayi1: String, alinanSayi2: String) {
        viewModel.carp(alinanSayi1, alinanSayi2)

    }
}