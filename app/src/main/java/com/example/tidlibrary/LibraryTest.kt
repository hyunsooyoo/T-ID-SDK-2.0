package com.example.tidlibrary

import android.content.Context
import android.widget.Toast

class LibraryTest {
    fun showToast(context: Context?, s: String?) {
        Toast.makeText(context, s, Toast.LENGTH_LONG).show()
    }
}
