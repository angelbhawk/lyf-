package mx.gob.sapalapaz.lyf.navigation

sealed class NavigationRoute(val route: String) {
    object Login : NavigationRoute("login")
    object Cargas : NavigationRoute("cargas")
    object Tomas : NavigationRoute("tomas/{id_libro}/{id_carga}")
    object Toma : NavigationRoute("toma/{id_toma}")
    object Lectura : NavigationRoute("lectura/{id_toma}")
    object Facturacion : NavigationRoute("facturacion")
    object Configuracion : NavigationRoute("configuracion")
}