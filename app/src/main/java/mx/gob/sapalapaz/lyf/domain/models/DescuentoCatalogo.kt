package mx.gob.sapalapaz.lyf.domain.models

data class DescuentoCatalogo(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val estado: String,
    val conceptos_aplicables: List<ConceptoAplicable>?
)
