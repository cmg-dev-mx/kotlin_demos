import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.text.SimpleDateFormat
import java.util.*

internal class TimeLeftKtTest {

    @Test
    fun validateDaysLeft() {
        val endDate = SimpleDateFormat("yyyy MM dd HH:mm:ss").parse("2023 08 14 00:00:00")
        val daysLeft = timeLeft(endDate)
        val expected = "68"
        assertEquals(expected, daysLeft)
    }
}