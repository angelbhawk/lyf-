package mx.gob.sapalapaz.lyf.domain.repository

import mx.gob.sapalapaz.lyf.domain.models.Impresora

interface BluetoothRepository {
    fun startScan()
    fun stopScan()
    fun getConnectedDevices(): List<Impresora>
}