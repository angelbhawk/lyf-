package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DescuentoEntity (
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val id_descuento: Int,
    val id_modelo: Int,
    val modelo_dueno: String,
    val curp: String,
    val id_registra: Int,
    val vigencia: String,
    val estatus: String,
    val folio: String
)