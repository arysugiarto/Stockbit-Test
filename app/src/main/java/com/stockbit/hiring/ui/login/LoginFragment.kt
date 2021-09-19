package com.stockbit.hiring.ui.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.stockbit.hiring.R
import com.stockbit.hiring.databinding.FragmentLoginBinding
import com.stockbit.hiring.util.navController
import com.stockbit.hiring.util.navigateOrNull
import com.stockbit.hiring.util.viewBinding

class LoginFragment : Fragment(R.layout.fragment_login) {

    private val binding by viewBinding<FragmentLoginBinding>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {
            navController.navigateOrNull(
                LoginFragmentDirections.actionToMain()
            )
        }

    }

}