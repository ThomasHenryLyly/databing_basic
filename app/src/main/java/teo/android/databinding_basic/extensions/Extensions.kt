package teo.android.databinding_basic.extensions

import android.content.Context
import android.widget.Toast
import java.time.Duration

fun Context.showToast(msg: String = "", duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, msg, duration).show()
}