package com.deucate.sapii.util

import android.app.AlertDialog
import android.content.Context
import android.widget.Toast

class Utils(val context: Context) {

    interface OnAlertCall {
        fun onClickPositive()
    }

    fun showAlertDialog(title: String, message: String) {
        AlertDialog.Builder(context).setTitle(title).setMessage(message).setPositiveButton("OK") { _, _ -> }.show()
    }

    fun showAlertDialogWithCallBack(title: String, message: String, listener: OnAlertCall) {
        AlertDialog.Builder(context).setTitle(title).setMessage(message).setPositiveButton("OK") { _, _ ->
            listener.onClickPositive()
        }.show()
    }

    fun showToastMessage(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }

}