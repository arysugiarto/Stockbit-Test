package com.stockbit.hiring.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import com.stockbit.hiring.R
import com.stockbit.hiring.data.local.preferences.AccessManager
import com.stockbit.hiring.data.remote.Result
import com.stockbit.hiring.databinding.FragmentHomeBinding
import com.stockbit.hiring.ui.main.MainFragment.Companion.parentToolbar
import com.stockbit.hiring.util.viewBinding
import com.stockbit.hiring.viewmodel.ExampleViewModel
import com.stockbit.hiring.util.*
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding<FragmentHomeBinding>()
    private val viewModel by viewModels<ExampleViewModel>()

    private var adapterData = ExampleAdapter.exampleAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        parentToolbar?.isVisible = false

        initObserve()
        initRequestData()
    
    }

    private fun initRequestData(){
        viewModel.getExample()
    }
    private fun initObserve(){
        onDataExampleObserve()
    }

    private fun onDataExampleObserve() {
        viewModel.example.observe(viewLifecycleOwner, { result ->
            when (result) {
                is Result.Loading -> {
                }
                is Result.Success -> {

                    adapterData.items = result.data?.firstOrNull()?.sponsoredData?.take(8).orEmpty()
                    Timber.e("Success get API")

                }
                is Result.Error<*, *> -> {

                }
                else -> {
                }
            }
        })
        binding.rvData.adapter = adapterData
        Timber.e("test recylerview")
    }

}