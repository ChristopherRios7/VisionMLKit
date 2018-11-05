package biz.aurafreelancersstudio.visionkit.core.visionimage

import android.graphics.BitmapFactory
import com.google.firebase.ml.vision.common.FirebaseVisionImage

//Class uses method that converts the image to a format ML Kit uses to 
//apply the computer vision methods onto it. This is similar to OpenCV
class BitmapVisionImageGenerator(private val imagePath: String) : FirebaseVisionImageGenerator {

    override fun get(): FirebaseVisionImage = FirebaseVisionImage.fromBitmap(BitmapFactory.decodeFile(imagePath))
}
