package com.stockbit.hiring.ui.login

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.stockbit.hiring.R

class LoginFragmentDirections private constructor() {
  companion object {
    fun actionToMain(): NavDirections = ActionOnlyNavDirections(R.id.action_to_main)
  }
}
