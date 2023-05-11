package com.example.yearthreeproj

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

class newsFeedFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_feed, container, false)
    }

}