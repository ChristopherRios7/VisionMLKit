package biz.aurafreelancersstudio.visionkit.ui.data

import biz.aurafreelancersstudio.visionkit.core.model.MLKitApiOption
import biz.aurafreelancersstudio.visionkit.core.model.UserOption
import biz.aurafreelancersstudio.visionkit.core.model.MLKitApiType.*
import biz.aurafreelancersstudio.visionkit.core.model.NewImageOption
import biz.aurafreelancersstudio.visionkit.R

object UserOptionsRepository {

    val options: Array<UserOption> by lazy {
        arrayOf(
                NewImageOption(
                        R.drawable.ic_new_image,
                        R.string.new_image_title,
                        R.string.new_image_body),
                MLKitApiOption(
                        R.drawable.ic_barcode_detector,
                        R.string.barcode_detector_title,
                        R.string.barcode_detector_body,
                        BARCODE_DETECTOR,
                        true),
                MLKitApiOption(
                        R.drawable.ic_face_detector,
                        R.string.face_detector_title,
                        R.string.face_detector_body,
                        FACE_DETECTOR,
                        true),
                MLKitApiOption(
                        R.drawable.ic_image_labeler,
                        R.string.image_labeler_title,
                        R.string.image_labeler_body,
                        IMAGE_LABELER,
                        true),
                MLKitApiOption(
                        R.drawable.ic_landmark_detector,
                        R.string.landmark_detector_title,
                        R.string.landmark_detector_body,
                        LANDMARK_DETECTOR,
                        false),
                MLKitApiOption(
                        R.drawable.ic_text_detector,
                        R.string.text_detector_title,
                        R.string.text_detector_body,
                        TEXT_DETECTOR,
                        true))
    }

    val firstMLKitApiOption: MLKitApiOption = options[1] as MLKitApiOption
}