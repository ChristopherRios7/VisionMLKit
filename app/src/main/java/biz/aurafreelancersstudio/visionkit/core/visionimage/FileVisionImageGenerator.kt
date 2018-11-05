package biz.aurafreelancersstudio.visionkit.core.visionimage

import android.content.Context
import android.net.Uri
import com.google.firebase.ml.vision.common.FirebaseVisionImage

//firebase pareses the image
class FileVisionImageGenerator(
        private val context: Context,
        private val imagePath: String) : FirebaseVisionImageGenerator {

    override fun get(): FirebaseVisionImage =
            FirebaseVisionImage.fromFilePath(context, Uri.parse(URI_FILE_PREFIX + imagePath))

    companion object {
        private const val URI_FILE_PREFIX = "file://"
    }
}
