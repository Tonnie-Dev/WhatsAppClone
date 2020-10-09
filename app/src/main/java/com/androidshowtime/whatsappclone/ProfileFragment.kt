package com.androidshowtime.whatsappclone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.androidshowtime.whatsappclone.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //create binding
        val binding = FragmentProfileBinding.inflate(inflater)
        // return root
        return binding.root
    }


}