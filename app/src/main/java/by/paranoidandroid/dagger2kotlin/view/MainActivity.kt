package by.paranoidandroid.dagger2kotlin.view

import android.app.Activity
import android.os.Bundle
import by.paranoidandroid.dagger2kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: Activity() {

    val info = Info()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTest.text = info.message
    }

    class Info {
        val message = "Dagger Kotlin Example"
    }
}