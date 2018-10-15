package by.paranoidandroid.dagger2kotlin.injection

import by.paranoidandroid.dagger2kotlin.view.MainActivity
import dagger.Component

@Component
interface AppComponent {

    fun inject(mainActivity: MainActivity)
}