package com.example.mygallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GalleryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        val isFragmentContainerEmpty = savedInstanceState == null
        if (isFragmentContainerEmpty) {
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.fragmentContainer, GalleryFragment.newInstance())
                    .commit()
        }
    }
}
