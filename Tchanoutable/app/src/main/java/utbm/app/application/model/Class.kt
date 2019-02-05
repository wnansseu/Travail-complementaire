package utbm.app.application.model

import java.io.Serializable

/**
 * A class period in a day
 */
class Class : Serializable {
    val id: Int? = null
    val nom: String? = null
    val prof: String? = null
    val lieu: String? = null
    val day: Int? = null
    val debut: Int? = null
    val fin: Int? = null

    val length: Int
        get() = (fin ?: 0) - (debut ?: 0)
}
