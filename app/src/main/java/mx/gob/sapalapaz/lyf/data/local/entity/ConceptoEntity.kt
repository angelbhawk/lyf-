package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ConceptoEntity(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val nombre: String,
    val descripcion: String,
    val estado: String,
    val tipo_tarifa: String?,
    val prioridad_abono: Int,
    val prioridad_por_antiguedad: Int,
    val genera_iva: Int,
    val abonable: Int,
    val tarifa_fija: Int,
    val cargo_directo: Int,
    val genera_orden: Int,
    val genera_recargo: Int,
    val concepto_rezago: Int,
    val pide_monto: Int,
    val bonificable: Int,
    val recargo: String
)
