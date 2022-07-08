package com.promedia.materialdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.promedia.materialdesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b:ActivityMainBinding
    companion object {
        private val ID_GROUP_BR = Menu.FIRST
        private val ID_ELEMENTO_CHECKBOX = Menu.FIRST
        private val ID_BOTONRADIO_1 = Menu.FIRST + 1
        private val ID_BOTONRADIO_2 = Menu.FIRST + 2
        private val ID_BOTONRADIO_3 = Menu.FIRST + 3
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        val actionBar = supportActionBar
        actionBar!!.title = "\t\tSign Up"
        actionBar.setIcon(R.drawable.ic_arrow_back_24)

        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)

    }
    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        super.onPrepareOptionsMenu(menu)
        var menuItem = menu?.findItem(ID_BOTONRADIO_2)
        menuItem?.setTitle("Papafrita")
        menuItem = menu?.findItem(ID_BOTONRADIO_3)
        menuItem?.setIcon(R.drawable.ic_android_black_24dp)
        menuItem?.setTitle(R.string.app_name)
        return true
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        // Asociamos el fichero de recurso /res/menu/custom_menu.xml
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

}