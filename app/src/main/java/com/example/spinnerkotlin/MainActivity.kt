package com.example.spinnerkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.spinnerkotlin.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var aaContries: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        aaContries = ArrayAdapter<String>(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item)

        aaContries.addAll(Arrays.asList("Mexico", "EUA"))
        aaContries.add("Argentina")

        mBinding.spinnerContries.onItemSelectedListener = this
        mBinding.spinnerContries.adapter = aaContries


    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            mBinding.tvSelect.text = aaContries.getItem(p2)
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}