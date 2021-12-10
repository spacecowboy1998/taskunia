package com.example.a4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.a4.fragments.BlankFragment
import com.example.a4.fragments.BlankFragmentDirections
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        val controler = findNavController(R.id.nav_fragment)

        var appBarConfiguration = AppBarConfiguration(
            setOf(
                R.layout.fragment_blank,
                R.layout.fragment_blank2,
                R.layout.fragment_blank3,
                R.layout.fragment_blank4
            )
        )

        setupActionBarWithNavController(controler,appBarConfiguration)
        navigation.setupWithNavController(controler)



    }

}