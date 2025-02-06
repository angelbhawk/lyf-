package mx.gob.sapalapaz.lyf.domain.models

data class ConceptoAplicable(
    val id: Int,
    val id_concepto_catalogo: Int,
    val id_modelo: Int,
    val descuento_catalogo: String,
    val rango_minimo: String,
    val rango_maximo: String
)
