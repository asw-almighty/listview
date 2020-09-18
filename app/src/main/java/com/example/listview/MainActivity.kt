package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val list_sample = ArrayList<String>();

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list_sample.add("A")
        list_sample.add("B")
        list_sample.add("C")

        /** 정보를 adapter로 넘겨주는 부분*/
        val list_adapter = MainListAdapter(this, list_sample)
        listView_id.adapter = list_adapter
    }
}