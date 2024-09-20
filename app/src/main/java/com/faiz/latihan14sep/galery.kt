package com.faiz.latihan14sep

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faiz.latihan14sep.Adapter.GalleryAdapter
import com.faiz.latihan14sep.Model.ImageModel
import com.faiz.latihan14sep.R
import com.faiz.latihan14sep.photo_detail


class galery : AppCompatActivity() {
    // Sample image resource array
    private val imageList = arrayOf(
        R.drawable.cyber,
        R.drawable.logopoli,
        R.drawable.ti,
        R.drawable.hima,
        R.drawable.rpl,
        R.drawable.tekom
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galery)

        // Set up the GridView for photos
        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = GalleryAdapter(this, imageList)
        gridView.adapter = adapter

        // Set up onClickListener for grid items
        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, photo_detail::class.java)
            intent.putExtra("imageResId", imageList[position]) // Pass the selected image ID to detail activity
            startActivity(intent)
        }
    }
}
