package com.example.coroutinesapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // cant put delay here,   delay(2000)

   /**    one way
    *  lifecycleScope.launch(Dispatchers.Main) {
            delay(2000)
            Toast.makeText(this@MainActivity2, "Some message displayed", Toast.LENGTH_LONG).show()
        }
    } */
// second way, call fun here
        lifecycleScope.launch(Dispatchers.Main) {
            getDataFormInternet()
        }
    }

    private suspend fun  getDataFormInternet() {
        delay(2000)
        Toast.makeText(this@MainActivity2, "Some message displayed", Toast.LENGTH_LONG).show()
    }

    private  suspend fun getData() {
        getDataFormInternet()
    }
}