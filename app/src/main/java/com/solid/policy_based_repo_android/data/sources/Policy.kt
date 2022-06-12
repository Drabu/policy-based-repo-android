package com.solid.policy_based_repo_android.data.sources

import com.solid.policy_based_repo_android.data.interfaces.DataSource
import java.util.*

class Policy {
    companion object {
        val API_FIRST = ArrayDeque(arrayListOf(APISource(), DatabaseSource()))
        val DB_FIRST = ArrayDeque(arrayListOf(DatabaseSource(), APISource()))
        val JUST_API = ArrayDeque(arrayListOf<DataSource>(APISource()))
        val JUST_DB = ArrayDeque(arrayListOf<DataSource>(DatabaseSource()))
    }
}