package com.palak.roomview.dsl

import android.app.Activity
import android.os.Bundle
import com.palak.roomview.R

class DSLActivity : Activity(){

    private val person = person {
        name = "Palak"
        age = 28
        address = address {
            street = "as"
            number = 23
            city = "we2asa"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dsl)


        println("Person is : $person")
    }
}