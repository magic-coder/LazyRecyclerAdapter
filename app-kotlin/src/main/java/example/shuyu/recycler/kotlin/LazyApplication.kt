package example.shuyu.recycler.kotlin

import android.app.Application
import com.facebook.stetho.Stetho

import example.shuyu.recycler.kotlin.chat.utils.ChatConst

/**
 * Created by guoshuyu on 2017/9/8.
 */

open class LazyApplication : Application() {

    companion object {
        @Volatile lateinit var INSTANCE: LazyApplication
    }

    override fun onCreate() {
        super.onCreate()
        ChatConst.ChatInit(this)
        Stetho.initializeWithDefaults(this)
        INSTANCE = this
    }

}
