package com.mbivye.notekeeper1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import com.mbivye.notekeeper1.databinding.ActivityMain2Binding
import com.mbivye.notekeeper1.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f,
                    R.drawable.g, R.drawable.h,R.drawable.i)

        val name = arrayOf(
            "Christopher","Peter","Liam","Amani","Mercy","Nduku","Mutinda","Mbivye","Kyalo"
        )
        val lastMessage = arrayOf(
            "Hey Chris","Peter Hi", "How is Baby Liam","Amani how is you mum?","Mercy wow!",
            "Hi Mum","Hi dad","Wow! Mbivye","Hi bro?"
        )
        val lastMsgTime= arrayOf(
            "8:45 PM","9:00 AM","3:20 PM","6:01 AM","2:12 PM","6:00 PM","11:11 AM","00:00","01:23 AM"
        )
        val country = arrayOf(
            "United State","Russia","Kenya","South Africa","Tanzania","United Kingdom","France","Canada",
            "Israel"
        )
        val phoneNo = arrayOf(
            "0711754420","0753657733","0755657733","0751657788","0711657733","0753659654","0777657733"
        )
        val userArrayList = ArrayList()
            for (i in name.indices){
                val user = User(name[i],lastMessage[i],lastMsgTime[i], phoneNo[i], country[i],imageId[i])
                userArrayList.add(user)
            }/*
        binding.listview.is = true
        binding.listview.adapter = MyAdapter(this,userArrayList)
        binding.listItem.adapter =MyAdapter(this,userArrayList)*/

        val fab: View = findViewById(R.id.fab)
        fab.setOnClickListener {
            val activityIntent = Intent(this, MainActivity::class.java)
            startActivity(activityIntent)
        }
/*
        val clubs = listOf("Arsenal","Manchester united","Manchester city","Liverpool","Chelsea")
        listNotes.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,clubs)

        listNotes.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this,clubs[position],Toast.LENGTH_SHORT).show()
        }*/

    }
}