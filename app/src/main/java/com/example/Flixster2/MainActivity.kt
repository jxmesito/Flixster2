package com.example.Flixster2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.Flixster2.R.id


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(id.movieContent, PopularMoviesFragment(), null)
        fragmentTransaction.replace(id.TvShowContent, TvShowsFragment(), null).commit()

    }
}