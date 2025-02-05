package mx.gob.sapalapaz.lyf

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import mx.gob.oomsapaslapaz.LyF.navigation.NavigationHost
import mx.gob.oomsapaslapaz.LyF.navigation.NavigationRoute
import mx.gob.oomsapaslapaz.LyF.ui.LyFTheme

@SuppressLint("RestrictedApi")
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    val viewmodel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        viewmodel.isLoggedIn.observe(this) { isLoggedIn ->
            val startDestination = if (isLoggedIn) {
                NavigationRoute.Cargas
            } else {
                NavigationRoute.Login
            }

            setContent {
                LyFTheme(dynamicColor = false) {
                    Surface(
                        modifier = Modifier.fillMaxSize(),

                    ) {
                        val navController = rememberNavController()
                        NavigationHost(
                            navHostController = navController,
                            startDestination = startDestination
                        )
                    }
                }
            }

        }
    }
}