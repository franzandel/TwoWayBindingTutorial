package com.example.twowaybindingtutorial

import android.text.TextWatcher

import android.widget.EditText
import androidx.databinding.BindingAdapter


/**
 * Created by Franz Andel on 05/03/20.
 * Android Engineer
 */

// ONE WAY BINDING WITH TEXT WATCHER / DIRTY TWO WAY BINDING
object EditTextBindingAdapters {
    @JvmStatic
    @BindingAdapter("textChangedListener")
    fun bindTextWatcher(editText: EditText, textWatcher: TextWatcher) {
        editText.addTextChangedListener(textWatcher)
    }
}