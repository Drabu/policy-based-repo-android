package com.solid.policy_based_repo_android.data.interfaces

import com.solid.policy_based_repo_android.data.structures.DataModel

interface Task {
    fun onSuccess(data: DataModel)
    fun onFailure()
}