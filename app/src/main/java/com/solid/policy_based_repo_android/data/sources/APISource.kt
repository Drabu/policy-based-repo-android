package com.solid.policy_based_repo_android.data.sources

import com.solid.policy_based_repo_android.data.interfaces.DataSource
import com.solid.policy_based_repo_android.data.interfaces.Task
import com.solid.policy_based_repo_android.data.structures.DataModel

class APISource : DataSource {
    override fun getData(task: Task) {
        /*Get data from from your server*/
        val data = getMockDataFromAPI()

        /*Once data is assembled, pass it on.*/
        task.onSuccess(data)
    }

    private fun getMockDataFromAPI() = DataModel("Mock data from server")
}