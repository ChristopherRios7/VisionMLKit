package biz.aurafreelancersstudio.visionkit.core.visionimage

import android.graphics.BitmapFactory
import com.google.firebase.ml.vision.common.FirebaseVisionImage


class BitmapVisionImageGenerator(private val imagePath: String) : FirebaseVisionImageGenerator {

    override fun get(): FirebaseVisionImage = FirebaseVisionImage.fromBitmap(BitmapFactory.decodeFile(imagePath))
}