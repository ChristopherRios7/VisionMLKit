package biz.aurafreelancersstudio.visionkit.ui.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import biz.aurafreelancersstudio.visionkit.R

class ImagePickerDialog : DialogFragment() {

    private var listener: Listener? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is Listener) {
            listener = context
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(context!!)
                .setTitle(R.string.image_picker_dialog_title)
                .setMessage(R.string.image_picker_dialog_message)
                .setPositiveButton(R.string.image_picker_dialog_button_camera, { _, _ ->
                    listener?.onCameraSelected()
                })
                .setNegativeButton(R.string.image_picker_dialog_button_gallery, { _, _ ->
                    listener?.onGallerySelected()
                })
                .create()
    }

    companion object {
        val TAG = ImagePickerDialog::class.java.simpleName
    }

    interface Listener {
        fun onCameraSelected()
        fun onGallerySelected()
    }
}