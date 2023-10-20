package com.example.Flixster2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners

class TvShowDetailActivity : AppCompatActivity() {
    private lateinit var mediaImageView: ImageView
    private lateinit var titleTextView: TextView
    private lateinit var abstractTextView: TextView
    private lateinit var popularityTextView: TextView
    private lateinit var firstAirDateTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tvshow_activity_detail)

        // TODO: Find the views for the screen
        mediaImageView = findViewById(R.id.tvShowMediaImage)
        titleTextView = findViewById(R.id.tvShowMediaTitle)
        abstractTextView = findViewById(R.id.tvShowMediaAbstract)
        popularityTextView = findViewById(R.id.tvShowPopularity)
        firstAirDateTextView = findViewById(R.id.tvShowFirstAirDate)

        // TODO: Get the extra from the Intent
        val tvShow = intent.getSerializableExtra(TV_EXTRA) as TvShow

        // TODO: Set the title, byline, and abstract information from the article
        titleTextView.text = tvShow.title
        abstractTextView.text = tvShow.description
        popularityTextView.text = tvShow.popularity.toString()
        firstAirDateTextView.text = tvShow.firstAirDate

        // TODO: Load the media image
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w500" + tvShow.imagePosterPath)
            .placeholder(R.drawable.ic_launcher_foreground)
            .centerCrop()
            .transform(RoundedCorners(40))
            .into(mediaImageView)
    }
}