package com.solid.policy_based_repo_android.view.model

import androidx.lifecycle.ViewModel
import com.solid.policy_based_repo_android.data.interfaces.DataSource
import com.solid.policy_based_repo_android.data.sources.Repository
import java.util.ArrayDeque

class ActivityViewModel : ViewModel() {

    private val repository by lazy { Repository() }

    fun requestData(policy: ArrayDeque<DataSource>? = null) = repository.requestData(policy)

    fun getDataStream() = repository.getDataStream()

}
