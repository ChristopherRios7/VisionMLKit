package biz.aurafreelancersstudio.visionkit.ui.dialog

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import biz.aurafreelancersstudio.visionkit.R


class MLKitApiAboutDialog : DialogFragment() {

    private var listener: Listener? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is Listener) {
            listener = context
        }
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val title = arguments?.getInt(KEY_TITLE) ?: 0
        val body = arguments?.getInt(KEY_BODY) ?: 0
        return AlertDialog.Builder(context!!)
                .setTitle(title)
                .setMessage(body)
                .setPositiveButton(R.string.definition_dialog_button_label, { _, _ -> listener?.onDismissed() })
                .create()
    }

    companion object {
        val TAG = MLKitApiAboutDialog::class.java.simpleName
        const val KEY_TITLE = "key_title"
        const val KEY_BODY = "key_body"
    }

    interface Listener {
        fun onDismissed()
    }
}