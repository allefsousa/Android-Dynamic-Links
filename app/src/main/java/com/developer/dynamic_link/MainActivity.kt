package com.developer.dynamic_link

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.developer.dynamic_link.feature1.Feature1Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val action = intent.action
        val uri = intent.data
        Log.d(MainActivity::class.java.simpleName, "onCreate: Uri = $uri\naction $action")


        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({

            if (uri?.getBooleanQueryParameter("userId",false) == true){
                val intent = Intent(this,Feature1Activity::class.java).apply {
                    putExtra("id",uri.getQueryParameter("userId"))
                }
                startActivity(intent)
                finish()
            }else{
                Log.d(MainActivity::class.java.simpleName, "Sem QueryParameter")

            }

        }, SPLASH_TIME)


    }
    companion object {
        const val SPLASH_TIME: Long = 1000
    }
}