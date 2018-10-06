package biz.aurafreelancersstudio.visionkit.core.visionimage

import com.google.firebase.ml.vision.common.FirebaseVisionImage


interface FirebaseVisionImageGenerator {

    fun get() : FirebaseVisionImage
}