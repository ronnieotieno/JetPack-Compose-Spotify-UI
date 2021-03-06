package dev.ronnie.github.sportifyui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import dev.ronnie.github.sportifyui.ui.HomeScreen
import dev.ronnie.github.sportifyui.ui.theme.SportifyUITheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SportifyUITheme {
                Scaffold(
                    bottomBar = { BottomNavigationBar() }
                ) {
                    Home()
                }
            }

        }
    }

    @Composable
    @Preview
    fun Home() {
        HomeScreen()
    }

    @Composable
    @Preview
    fun BottomNavigationBar() {
        val items = listOf(
            NavigationItem.Home,
            NavigationItem.Search,
            NavigationItem.Library,
        )

        BottomNavigation(
            backgroundColor = Color(0XD9000000),
            contentColor = Color.White,
        ) {
            items.forEach { item ->
                BottomNavigationItem(
                    icon = {
                        Icon(
                            painterResource(id = item.icon),
                            contentDescription = item.title
                        )
                    },
                    label = { Text(text = item.title) },
                    selectedContentColor = Color.White,
                    unselectedContentColor = Color.White.copy(0.4f),
                    alwaysShowLabel = true,
                    selected = item.title == "Home",
                    onClick = {
                    },

                    )
            }
        }
    }
}
