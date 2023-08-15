import java.util.Date

fun timeLeft(endDate: Date): String {

    val today = Date()
    val diff = endDate.time - today.time
    return (diff / (1000 * 60 * 60 * 24)).toString()
}