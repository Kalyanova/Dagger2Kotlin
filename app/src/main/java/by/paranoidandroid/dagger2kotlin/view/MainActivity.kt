package by.paranoidandroid.dagger2kotlin.view

import android.app.Activity
import android.os.Bundle
import by.paranoidandroid.dagger2kotlin.R
import by.paranoidandroid.dagger2kotlin.injection.DaggerAppComponent
import by.paranoidandroid.dagger2kotlin.injection.Info
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity: Activity() {

    @Inject lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent.create().inject(this)
        tvTest.text = info.message
    }
}