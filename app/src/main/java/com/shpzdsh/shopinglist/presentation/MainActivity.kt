package com.shpzdsh.shopinglist.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.lifecycle.ViewModelProvider
import com.shpzdsh.shopinglist.R
import org.chromium.base.Log

class MainActivity : ComponentActivity() {

    private lateinit var viewModel: MainViewModel

    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class]
        viewModel.shopList.observe(this) {
            Log.d("MainActivityTest", it.toString())
            if (count == 0) {
                count++
                val item = it[0]
                viewModel.deleteShopItem(item)
            }
        }
    }
}