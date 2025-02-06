package mx.gob.sapalapaz.lyf.domain.exceptions

sealed class PermissionException(message: String) : Exception(message) {
    object BluetoothPermissionDenied : PermissionException("Bluetooth permission denied.")
    object LocationPermissionDenied : PermissionException("Location permission denied.")
    object SensorPermissionDenied : PermissionException("Sensor permission denied.")
}
