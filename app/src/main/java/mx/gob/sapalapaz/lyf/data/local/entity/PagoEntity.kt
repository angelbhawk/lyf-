package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PagoEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val folio: String,
    val id_caja: Int,
    val id_dueno: Int,
    val modelo_dueno: String,
    val total_pagado: Double,
    val total_abonado: Double?,
    val saldo_anterior: Double?,
    val saldo_pendiente: Double?,
    val saldo_a_favor: Double?,
    val recibido: Double?,
    val cambio: Double?,
    val forma_pago: String,
    val fecha_pago: String,
    val estado: String,
    val referencia: String?
)
