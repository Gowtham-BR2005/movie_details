package com.example.movie

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    private lateinit var btnBasic: Button
    private lateinit var btnAdditional: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBasic = findViewById(R.id.btnBasic)
        btnAdditional = findViewById(R.id.btnAdditional)

        // Load default fragment
        loadFragment(MovieBasicDetailsFragment())

        btnBasic.setOnClickListener {
            loadFragment(MovieBasicDetailsFragment())
        }

        btnAdditional.setOnClickListener {
            loadFragment(MovieAdditionalDetailsFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}