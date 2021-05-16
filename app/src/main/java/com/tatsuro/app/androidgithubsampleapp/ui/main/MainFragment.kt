package com.tatsuro.app.androidgithubsampleapp.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.tatsuro.app.androidgithubsampleapp.R

class MainFragment : Fragment(R.layout.main_fragment) {

    companion object {
        fun newInstance() = MainFragment()
    }

    private val viewModel: MainViewModel by viewModels()
}