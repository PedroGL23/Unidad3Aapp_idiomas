package com.example.unidad3aapp_idiomas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.unidad3aapp_idiomas.R.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

}

fun FragmentActivity.findNavigationController (@IdRes host: Int): NavController {
    try {
        val navHostFragment = supportFragmentManager.findFragmentById(host) as NavHostFragment
        return navHostFragment .findNavController()
    } catch (e: Exception) {
        throw IllegalStateException( "Activity $this does not have a NavController set on $host")
    }
}