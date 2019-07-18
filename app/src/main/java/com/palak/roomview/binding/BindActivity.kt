package com.palak.roomview.binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.palak.roomview.R
import com.palak.roomview.databinding.ActivityBindBinding
import kotlinx.android.synthetic.main.activity_bind.*

class BindActivity : AppCompatActivity() {

    val sampleValue = Sample()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityBindBinding = DataBindingUtil.setContentView(this,R.layout.activity_bind)

        binding.sampleValue = sampleValue
        
        sampleValue.lastName = "Palakk"
        button.setOnClickListener { sampleValue.lastName= "DDARjI" }


    }
}
