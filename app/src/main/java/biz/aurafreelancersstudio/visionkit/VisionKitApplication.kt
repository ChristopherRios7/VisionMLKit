package biz.aurafreelancersstudio.visionkit

import android.app.Application


class VisionKitApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: VisionKitApplication
    }
}