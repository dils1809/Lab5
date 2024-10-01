import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

public final data class WellnessTask(
    val id: Int,
    val label: String,
    var checked: Boolean = false
        )


