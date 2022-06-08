package com.example.daggerhiltexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository:RetrofitRepository):ViewModel() {

    var liveData:MutableLiveData<List<Post>>
    init {
        liveData= MutableLiveData()
    }

    fun getLiveDataObserver():MutableLiveData<List<Post>>{
        return liveData
    }

    fun loadData(){
        repository.getPosts(liveData)
    }
}