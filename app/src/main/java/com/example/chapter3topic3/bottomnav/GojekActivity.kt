package com.example.chapter3topic3.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chapter3topic3.R
import kotlinx.android.synthetic.main.activity_gojek.*

class GojekActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gojek)

        bottomnav.setOnNavigationItemReselectedListener {
            when(it.itemId){
                R.id.home -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.mainfragment,HomeFragment())
                        .commit()
                    return@setOnNavigationItemReselectedListener true
                }
                R.id.chat -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.mainfragment,ChatFragment())
                        .commit()
                    return@setOnNavigationItemReselectedListener true
                }
                R.id.promo -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.mainfragment,HomeFragment())
                        .commit()
                    return@setOnNavigationItemReselectedListener true
                }
                R.id.profile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.mainfragment,ChatFragment())
                        .commit()
                    return@setOnNavigationItemReselectedListener true
                }
            }
            false
        }
    }

}