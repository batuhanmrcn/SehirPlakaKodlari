package com.batuhanmercan.sehirlerinplakakodu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.batuhanmercan.sehirlerinplakakodu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonAra.setOnClickListener {
            val plakaKodu = binding.editTextPlaka.text.toString().toIntOrNull()
            binding.textViewSehirIsmi.text = when(plakaKodu){
                71 -> "Kırıkkale"
                16 -> "Bursa"
                34 -> "İstanbul"
                6 -> "Ankara"
                35 ->  "İzmir"
               else -> "Bulunamadı"

            }
        }

                }
        }



