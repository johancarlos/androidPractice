package com.example.estudiante.practica7

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Snackbar.make(layoutPrincipal , getString(R.string.mensaje_snackbar), Snackbar.LENGTH_LONG).show()

    }


    fun selectedButton(view: View) {
        if (view.id === R.id.btnServices) {
            val intent: Intent = Intent(view.context, ServiceActivity::class.java)
            startActivity(intent)

        } else {
            Toast.makeText(view.context, "Evento no definido", Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {

            R.id.action_search -> {
                Log.d("TEST", "ICON SEARCH")
                true
            }
        }
        return super.onOptionsItemSelected(item)
    }


}
