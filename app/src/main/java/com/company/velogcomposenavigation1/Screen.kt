package com.company.velogcomposenavigation1

sealed class Screen(val route : String) {
    object MainScreen : Screen("main_screen")
    object DetailScreen : Screen("detail_screen")
}


// 'Compose Navigation'을 활용하려면 , 화면이 있어야 되기 때문에 화면을 먼저 만들어 주어야 한다.
