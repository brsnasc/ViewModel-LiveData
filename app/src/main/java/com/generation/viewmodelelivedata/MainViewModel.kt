package com.generation.viewmodelelivedata

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var cont = MutableLiveData<Int>(0)

    fun addNum(){
        cont.value = cont.value?.plus(1)
    }


}