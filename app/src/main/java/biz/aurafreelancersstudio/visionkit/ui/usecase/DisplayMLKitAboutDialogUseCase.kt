package biz.aurafreelancersstudio.visionkit.ui.usecase

import biz.aurafreelancersstudio.visionkit.core.model.MLKitApiOption
import biz.aurafreelancersstudio.visionkit.core.wrapper.SharedPreferencesWrapper


object DisplayMLKitAboutDialogUseCase {

    fun shouldShowAboutDialogFor(option: MLKitApiOption): Boolean {
        val isOptionFirstCall = SharedPreferencesWrapper.getBoolean(option.type.name)
        if (isOptionFirstCall) {
            SharedPreferencesWrapper.put(option.type.name, false)
        }
        return isOptionFirstCall || !option.isEnabled
    }
}