package com.example.clonecodinginstagram

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.clonecodinginstagram.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.tvDetail.setOnClickListener {
            binding.tvPostContent.apply {
                ellipsize=null
                maxLines=Int.MAX_VALUE
                binding.tvDetail.isVisible=false
            }
        }
        binding.postMore.setOnClickListener {
            var intent=Intent(activity,EditActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }


}