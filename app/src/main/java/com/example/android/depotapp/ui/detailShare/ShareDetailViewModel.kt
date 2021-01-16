package com.example.android.depotapp.ui.detailShare

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.depotapp.model.Share
import com.example.android.depotapp.repository.share.ShareRepository

class ShareDetailViewModel(private val shareRepository: ShareRepository) : ViewModel() {


    val selectedShare: LiveData<Share>
        get() = _selectedShare

    private val _selectedShare = MutableLiveData<Share>()

    fun setShare(share: Share) {
        _selectedShare.value = share
    }
}