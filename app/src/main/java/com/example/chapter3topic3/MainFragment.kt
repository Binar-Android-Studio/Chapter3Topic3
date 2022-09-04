package com.example.chapter3topic3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import com.example.chapter3topic3.bottomnav.GojekActivity
import com.example.chapter3topic3.bottomnav.HomeFragment
import kotlinx.android.synthetic.main.activity_gojek.*
import kotlinx.android.synthetic.main.activity_main_fragment.*

class MainFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_fragment)

//        var btn1 = findViewById(R.id.bttn1) as Button
//        var btn2 = findViewById(R.id.bttn2) as Button

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fcFragment, FragmentSatu())

        }

        bttn1.setOnClickListener {
            var inten = Intent(this, GojekActivity()::class.java)
            startActivity(inten)
//            supportFragmentManager.beginTransaction().apply {
//                replace(R.id.fcFragment, FragmentSatu())
//                commit()
//            }
         }
        bttn2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fcFragment, FragmentDua())
                commit()
            }
        }
    }
}