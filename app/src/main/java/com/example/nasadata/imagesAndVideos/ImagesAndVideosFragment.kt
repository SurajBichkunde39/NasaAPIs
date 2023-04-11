package com.example.nasadata.imagesAndVideos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nasadata.R

/**
 * A simple [Fragment] subclass.
 * Use the [ImagesAndVideosFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ImagesAndVideosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_images_and_videos, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         */
        @JvmStatic
        fun newInstance() = ImagesAndVideosFragment()
    }
}
