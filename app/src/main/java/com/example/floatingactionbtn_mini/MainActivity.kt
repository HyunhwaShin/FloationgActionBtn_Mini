package com.example.floatingactionbtn_mini

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView.background = null
        //0=home, 1=search, 2=placeholder,, placeholder 는 거품이기때문에 클릭해서 이벤트가 나타나지 않게 false
        bottomNavigationView.menu.getItem(2).isEnabled=false
    }
}