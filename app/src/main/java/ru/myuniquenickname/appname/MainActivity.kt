package ru.myuniquenickname.appname

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_movies_list.*

class MainActivity : AppCompatActivity(),SomeFragmentClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.frame_layout, FragmentMoviesList())
            .commit()


    }

    override fun onBackPressedDetails() {
        supportFragmentManager.beginTransaction()
            .add(R.id.frame_layout,FragmentMoviesList())
            .commit()
    }

    override fun goToTheFilmDetails() {
        supportFragmentManager.beginTransaction()
            .add(R.id.frame_layout,FragmentMoviesDetails())
            .commit()
    }



}


