package com.example.yugioh.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun MainScreen() {
    val navItemList = listOf(
        NavItem(label = "List", icon = Icons.Default.List),
        NavItem(label = "Map", icon = Icons.Default.LocationOn),
        NavItem(label = "Hello", icon = Icons.Default.Person)
    )

    var selectedIndex by remember { mutableStateOf(0) }
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItemList.forEachIndexed { index,navItem ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = { selectedIndex = index },
                        icon = { Icon(imageVector = navItem.icon, contentDescription = "icon") },
                        label = { Text(text = navItem.label) }
                    )
                }
            }

        }) {innerPadding ->
        ContentScreen(modifier = Modifier.padding(innerPadding), selectedIndex)
    }
}

@Composable
fun ContentScreen(modifier: Modifier, selectedIndex: Int) {
    when (selectedIndex) {
        0 -> ListPage()
        1 -> ShowingMap()
        2 -> Hello()
    }
}
@Composable
fun MyBottomNavigation() {
    BottomNavigation {
        BottomNavigationItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = { Icons.Default.List },
            label = { Text(text = "List") }
        )
    }
    BottomNavigation {
        BottomNavigationItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = { Icons.Default.List },
            label = { Text(text = "List") }
        )
    }
    BottomNavigation {
        BottomNavigationItem(
            selected = false,
            onClick = { /*TODO*/ },
            icon = { Icons.Default.List },
            label = { Text(text = "List") }
        )
    }
}

data class NavItem(val label: String, val icon: ImageVector)