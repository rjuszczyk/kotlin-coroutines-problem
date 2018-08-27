package com.example.coroutinestest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.lib.OtherModuleInterface
import kotlinx.coroutines.experimental.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val t: OtherModuleInterface = OtherModuleImpl()
        launch {
            t.test()
        }
    }
}
