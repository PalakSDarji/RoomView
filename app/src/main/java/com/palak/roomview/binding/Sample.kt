package com.palak.roomview.binding

import android.database.Observable
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableField
import com.palak.roomview.BR

class Sample : BaseObservable(){

    @get: Bindable
    var firstName : String = "asds"
    set(value) {
        field = value
        notifyPropertyChanged(BR.firstName)
    }

    var lastName : String = "SSD"
    @Bindable get() = field
    set(value) {
        field = value
        notifyPropertyChanged(BR.lastName)
    }


    val o: ObservableField<Int> = ObservableField<Int>().apply {
        set(45)
    }

    val a = ObservableArrayList<Any>().apply {
        add("hihu")
        add(457)
        add(true)
    }

    private fun sampleMethod(){

    }
}