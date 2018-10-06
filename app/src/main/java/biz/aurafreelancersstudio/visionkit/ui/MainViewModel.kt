package biz.aurafreelancersstudio.visionkit.ui
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import biz.aurafreelancersstudio.visionkit.core.api.MLkitApiFactory
import biz.aurafreelancersstudio.visionkit.core.model.MLKitApiOption
import biz.aurafreelancersstudio.visionkit.ui.usecase.DisplayMLKitAboutDialogUseCase

class MainViewModel : ViewModel() {

    val viewState: MutableLiveData<MainViewState> by lazy {
        MutableLiveData<MainViewState>().apply {
            value = MainViewState()
        }
    }

    fun onImageSelected(imagePath: String) {
        viewState.value = viewState.value?.copy(imagePath = imagePath)
        processImage()
    }

    private fun processImage() {
        viewState.value?.let {
            processImageWithMLKitApiOption(it.imagePath, it.mlKitApiOption)
        }
    }

    private fun processImageWithMLKitApiOption(image: String, mlKitApiOption: MLKitApiOption) {
        if (!mlKitApiOption.isEnabled) {
            return
        }
        viewState.value = viewState.value?.copy(isLoading = true)
        MLkitApiFactory.get(mlKitApiOption.type).process(
                image,
                { viewState.value = viewState.value?.copy(isLoading = false, result = it, error = "") },
                { viewState.value = viewState.value?.copy(isLoading = false, result = "", error = it) })
    }

    fun onMLKitApiOptionSelected(option: MLKitApiOption) {
        viewState.value?.mlKitApiOption = option
        showAboutDialogForMLKitApi(option)
        processImage()
    }

    private fun showAboutDialogForMLKitApi(option: MLKitApiOption) {
        if (DisplayMLKitAboutDialogUseCase.shouldShowAboutDialogFor(option)) {
            viewState.value = viewState.value?.copy(displayAboutDialog = true)
        }
    }

    fun onMLKitAboutDialogDismissed() {
        viewState.value = viewState.value?.copy(displayAboutDialog = false)
    }
}