package com.example.customdialog

import android.app.Dialog
import android.content.Context
import android.widget.Toast
import kotlinx.android.synthetic.main.dialog_layout.*
import kotlin.system.exitProcess

class CustomDialog(context: Context, themeResId: Int) : Dialog(context, themeResId) {

    init {
        setContentView(R.layout.dialog_layout)
        btnYes.setOnClickListener {
            exitProcess(0)
        }

        btnNo.setOnClickListener {
            Toast.makeText(context, "you click no button", Toast.LENGTH_SHORT).show()
        }
    }
}