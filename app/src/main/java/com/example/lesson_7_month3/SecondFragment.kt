package com.example.lesson_7_month3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.lesson_7_month3.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val nameRes = arguments?.getString("name")
        val statusRes = arguments?.getString("status")
        val photoRes = arguments?.getString("photo")

        Glide.with(binding.imgPhoto).load(photoRes).into(binding.imgPhoto)
        binding.tvName.text = nameRes
        binding.tvStatus.text = statusRes
    }

}