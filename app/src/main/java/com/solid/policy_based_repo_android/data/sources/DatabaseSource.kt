package com.solid.policy_based_repo_android.data.sources

import com.solid.policy_based_repo_android.data.interfaces.DataSource
import com.solid.policy_based_repo_android.data.interfaces.Task
import com.solid.policy_based_repo_android.data.structures.DataModel


class DatabaseSource : DataSource {
    override fun getData(task: Task) {

        /*Get data from from your server*/
        val data = getMockDataFromDatabase()

        /*Once data is assembled, pass it on.*/
        task.onSuccess(data)

    }

    private fun getMockDataFromDatabase() = DataModel("Data from Database!")
}