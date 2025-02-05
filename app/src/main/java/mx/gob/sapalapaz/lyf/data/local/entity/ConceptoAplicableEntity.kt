package mx.gob.sapalapaz.lyf.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ConceptoAplicableEntity(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val id_concepto_catalogo: Int,
    val id_modelo: Int,
    val modelo: String,
    val rango_minimo: Double,
    val rango_maximo: Double
)
