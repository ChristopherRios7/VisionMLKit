package biz.aurafreelancersstudio.visionkit

import android.app.Application

//creates the entire application
class VisionKitApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: VisionKitApplication
    }
}
