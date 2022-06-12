package com.solid.policy_based_repo_android

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.solid.policy_based_repo_android.data.sources.Policy
import com.solid.policy_based_repo_android.view.model.ActivityViewModel
import java.util.*

class MainActivity : AppCompatActivity() {

    private val viewModel = ActivityViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.requestData(Policy.JUST_DB)

        val dataStream = viewModel.getDataStream()


        dataStream.observe(this) {
            findViewById<TextView>(R.id.sampleText).text = it.data
        }
    }
}
