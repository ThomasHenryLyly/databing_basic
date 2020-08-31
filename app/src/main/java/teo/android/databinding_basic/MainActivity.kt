package teo.android.databinding_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import teo.android.databinding_basic.databinding.ActivityMainBinding
import teo.android.databinding_basic.extensions.showToast

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnClick.setOnClickListener {
            binding.txtText.text = binding.edtInputText.text.toString()
            showToast("Alalalala")
        }

    }

}