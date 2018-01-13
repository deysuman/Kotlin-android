package jp.satorufujiwara.kotlin.ui.main

import dagger.Component
import jp.satorufujiwara.kotlin.AppComponent
import jp.satorufujiwara.kotlin.KotlinApp

@MainScope
@Component(dependencies = arrayOf(AppComponent::class), modules = arrayOf(MainModule::class))
public interface MainComponent {

    public fun inject(activity: MainActivity)

    public fun inject(fragment: MainFragment)

    public object Initializer {

        public fun init(activity: MainActivity): MainComponent {
            return DaggerMainComponent.builder()
                    .appComponent(KotlinApp.appComponent(activity))
                    .mainModule(MainModule())
                    .build()
        }
    }
}
