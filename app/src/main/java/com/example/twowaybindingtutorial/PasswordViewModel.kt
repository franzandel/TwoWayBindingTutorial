package com.example.twowaybindingtutorial

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable


/**
 * Created by Franz Andel on 05/03/20.
 * Android Engineer
 */

class PasswordViewModel : BaseObservable() {

    private var password = ""
    @Bindable
    fun getPasswordQuality(): String {
        return when {
            password.isEmpty() -> {
                "Enter a password"
            }
            password == "password" -> {
                "Very bad"
            }
            password.length < 6 -> {
                "Short"
            }
            else -> {
                "Okay"
            }
        }
    }

    @Bindable
    fun getPassword(): String {
        return password
    }

    fun setPassword(password: String) {
        this.password = password
        notifyPropertyChanged(BR.password)
        notifyPropertyChanged(BR.passwordQuality)
    }

    // ONE WAY BINDING WITH TEXT WATCHER / DIRTY TWO WAY BINDING

    //    fun setPassword(password: String) {
//        this.password = password
//        notifyPropertyChanged(BR.passwordQuality)
//    }

//    @Bindable
//    fun getPasswordTextWatcher(): TextWatcher {
//        return object : TextWatcher {
//            override fun beforeTextChanged(
//                s: CharSequence,
//                start: Int,
//                count: Int,
//                after: Int
//            ) { // Do nothing.
//            }
//
//            override fun onTextChanged(
//                s: CharSequence,
//                start: Int,
//                before: Int,
//                count: Int
//            ) {
//                setPassword(s.toString())
//            }
//
//            override fun afterTextChanged(s: Editable) { // Do nothing.
//            }
//        }
//    }
}