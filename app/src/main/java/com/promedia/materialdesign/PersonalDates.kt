package com.promedia.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.promedia.materialdesign.databinding.ActivityPersonalDatesBinding

class PersonalDates : AppCompatActivity() {
    private lateinit var b:ActivityPersonalDatesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityPersonalDatesBinding.inflate(layoutInflater)
        setContentView(b.root)
    }
}