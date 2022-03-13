package com.example.a57programmingexercisesandroid.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a57programmingexercisesandroid.R
import com.example.a57programmingexercisesandroid.databinding.FragmentHelloWorld57Binding

/**
 * A simple [Fragment] subclass.
 * Use the [HelloWorld57.newInstance] factory method to
 * create an instance of this fragment.
 */
class HelloWorld57 : Fragment() {

    private var _binding: FragmentHelloWorld57Binding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHelloWorld57Binding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    companion object {

        @JvmStatic
        fun newInstance() = HelloWorld57()
    }
}