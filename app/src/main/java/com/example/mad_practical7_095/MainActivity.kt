package com.example.mad_practical_7_21012011095

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.mad_practical7_095.YotubeActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myVideoview : VideoView = findViewById(R.id.video)
        val mediaController = MediaController(this)
        val uri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        myVideoview.setMediaController(mediaController)
        mediaController.setAnchorView(myVideoview)
        myVideoview.setVideoURI(uri)
        myVideoview.requestFocus()
        myVideoview.start()

        val button = findViewById<FloatingActionButton>(R.layout.FlotingActionBotton)
        button.setOnClickListener {
            Intent(this,YoutubeActivity::class.java).apply { startActivity(this) }
        }
    }
}