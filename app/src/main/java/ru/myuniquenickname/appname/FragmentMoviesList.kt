package ru.myuniquenickname.appname

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class FragmentMoviesList: Fragment() {
    private var someFragmentClickListener: SomeFragmentClickListener? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movies_list,container,false)
        val cardView = view.findViewById<CardView>(R.id.card_view_first_film)
        cardView.setOnClickListener(View.OnClickListener {
            someFragmentClickListener?.goToTheFilmDetails()
        })
        return view
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is SomeFragmentClickListener){
            someFragmentClickListener= context
        }
    }

    override fun onDetach() {
        super.onDetach()
        someFragmentClickListener = null
    }
}