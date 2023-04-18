package com.example.days_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.days_6.adapter.UserCustomAdapter
import com.example.days_6.services.UserService





class MainActivity : AppCompatActivity() {

    lateinit var listView_user : ListView
    val userService = UserService()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView_user = findViewById(R.id.listView_user)
        val customAdapter = UserCustomAdapter(this,userService.userResult())
        listView_user.adapter = customAdapter

    }
}