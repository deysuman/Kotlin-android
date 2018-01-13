package jp.satorufujiwara.kotlin

import com.trello.rxlifecycle.components.support.RxFragment

public abstract class AbstractFragment : RxFragment() {

    override fun onDestroy() {
        super.onDestroy()
        KotlinApp.refWatcher(activity).watch(this)
    }
}
