package com.example.photoframeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.photoframeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    var curimg=0
    lateinit var img:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val names= arrayOf("Virat Kohli","Savitri","Brad Pitt","Ludovico Einaudi")
        binding.imageButton2.setOnClickListener {
            var curimgstr="img$curimg"
            var curimgid=this.resources.getIdentifier(curimgstr,"id",packageName)
            img=findViewById(curimgid)
            img.alpha=0f
            curimg=(4+curimg-1)%4
            curimgstr="img$curimg"
            curimgid=this.resources.getIdentifier(curimgstr,"id",packageName)
            img=findViewById(curimgid)
            img.alpha=1f
            binding.textView3.text=names[curimg]
        }
        binding.imageButton3.setOnClickListener {
            var curimg1="img$curimg"
            var curimgid1=this.resources.getIdentifier(curimg1,"id",packageName)
            img=findViewById(curimgid1)
            img.alpha=0f
            curimg=(4+curimg+1)%4
            curimg1="img$curimg"
            curimgid1=this.resources.getIdentifier(curimg1,"id",packageName)
            img=findViewById(curimgid1)
            img.alpha=1f
            binding.textView3.text=names[curimg]
        }

    }
}