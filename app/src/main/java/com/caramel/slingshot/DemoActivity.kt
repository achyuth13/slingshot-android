package com.caramel.slingshot

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.caramel.slingshot.factory.DemoViewModelFactory
import com.caramel.slingshot.repo.SlingshotRepository
import com.caramel.slingshot.viewmodel.DemoViewModel

class DemoActivity : AppCompatActivity() {

    // Get the ViewModel using the viewModels delegate
    private val demoViewModel: DemoViewModel by viewModels {
        DemoViewModelFactory(SlingshotRepository())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Observe the loading state
        demoViewModel.isLoading.observe(this, Observer { isLoading ->
            // Show or hide loading indicator based on isLoading
            findViewById<View>(R.id.loadingIndicator).visibility =
                if (isLoading) View.VISIBLE else View.GONE
        })

        // Observe the error state
        demoViewModel.errorMessage.observe(this, Observer { errorMessage ->
            errorMessage?.let {
                Toast.makeText(this, errorMessage, Toast.LENGTH_SHORT).show()
            }
        })

        // Observe the data
        demoViewModel.playersData.observe(this, Observer { players ->
            // Update UI with the data (for example, show players in a RecyclerView)
        })

        // Call the fetch function when ready (e.g., on a button click)
        findViewById<View>(R.id.fetchButton).setOnClickListener {
            demoViewModel.fetchPlayers()
        }
    }
}
