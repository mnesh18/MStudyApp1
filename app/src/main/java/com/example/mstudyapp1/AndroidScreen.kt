package com.example.mstudyapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_screen)
        this.title = "Android Review"

        var myRV = findViewById<RecyclerView>(R.id.rvAndroid)
        myRV.adapter = AndroidScreenRecycler()
        myRV.layoutManager = LinearLayoutManager(this)
    }
}