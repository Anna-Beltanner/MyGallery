package com.example.mygallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.mygallery.api.FlickrFetch

class GalleryViewModel : ViewModel() {
    val galleryItemLiveData: LiveData<List<GalleryItem>>

    init {
        galleryItemLiveData = FlickrFetch().fetchPhotos()
        //запускаем запрос данных при первом создании ViewModel, при повороте останется в памяти
    }
}