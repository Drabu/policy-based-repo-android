package com.solid.policy_based_repo_android.data.sources

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.solid.policy_based_repo_android.data.interfaces.DataSource
import com.solid.policy_based_repo_android.data.interfaces.Task
import com.solid.policy_based_repo_android.data.structures.DataModel
import java.util.*

class Repository : Task {

    private val dataStream = MutableLiveData<DataModel>()

    private lateinit var arrayDeque: ArrayDeque<DataSource>

    fun requestData(policy: ArrayDeque<DataSource>?) {
        arrayDeque = policy ?: Policy.API_FIRST
        arrayDeque.pop().getData(this)
    }

    fun getDataStream(): LiveData<DataModel> = dataStream

    override fun onSuccess(data: DataModel) {
        dataStream.postValue(data)
    }

    override fun onFailure() {
        if (arrayDeque.isNotEmpty())
            arrayDeque.pop().getData(this)

    }
}
