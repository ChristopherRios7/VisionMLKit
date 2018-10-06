package biz.aurafreelancersstudio.visionkit.ui

import biz.aurafreelancersstudio.visionkit.core.model.MLKitApiOption
import biz.aurafreelancersstudio.visionkit.core.model.UserOption
import biz.aurafreelancersstudio.visionkit.ui.data.UserOptionsRepository

data class MainViewState(
        val userOptions: Array<UserOption> = UserOptionsRepository.options,
        var isLoading: Boolean = false,
        var imagePath: String = "",
        var result: String = "",
        var error: String = "",
        var mlKitApiOption: MLKitApiOption = UserOptionsRepository.firstMLKitApiOption,
        var displayAboutDialog: Boolean = false
)