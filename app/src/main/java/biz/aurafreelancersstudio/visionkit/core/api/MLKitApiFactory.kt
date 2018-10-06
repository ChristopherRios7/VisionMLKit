package biz.aurafreelancersstudio.visionkit.core.api

import biz.aurafreelancersstudio.visionkit.core.model.MLKitApiType
import biz.aurafreelancersstudio.visionkit.core.model.MLKitApiType.*
import java.util.*


object MLkitApiFactory {

    private val apis = EnumMap<MLKitApiType, MLKitApi<*, *>>(MLKitApiType::class.java)

    fun get(type: MLKitApiType): MLKitApi<*, *> = when (type) {
        BARCODE_DETECTOR -> apis.getOrPut(BARCODE_DETECTOR, { BarcodeDetector() })
        FACE_DETECTOR -> apis.getOrPut(FACE_DETECTOR, { FaceDetector() })
        IMAGE_LABELER -> apis.getOrPut(IMAGE_LABELER, { ImageLabeler() })
        LANDMARK_DETECTOR -> apis.getOrPut(LANDMARK_DETECTOR, { LandmarkDetector() })
        TEXT_DETECTOR -> apis.getOrPut(TEXT_DETECTOR, { TextDetector() })
    }
}