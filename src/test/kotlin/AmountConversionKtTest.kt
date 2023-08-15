import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class AmountConversionKtTest {

    @Test
    fun validateAmountNull() {
        val amount: String? = null
        val expected = ""
        val response = validateAmountConversion(amount)
        assertEquals(expected, response)
    }

    @Test
    fun validateAmountWithWrongString() {
        val amount = "hello"
        val expected = ""
        val response = validateAmountConversion(amount)
        assertEquals(expected, response)
    }

    @Test
    fun validateAmount() {
        val amount = "14.599999"
        val expected = "14.60"
        val response = validateAmountConversion(amount)
        assertEquals(expected, response)
    }

    @Test
    fun validateBigAmount() {
        val amount = "123456789.012"
        val expected = "123,456,789.01"
        val response = validateAmountConversion(amount)
        assertEquals(expected, response)
    }

    @Test
    fun validateZeroAmount() {
        val amount = "0"
        val expected = "0.00"
        val response = validateAmountConversion(amount)
        assertEquals(expected, response)
    }

    @Test
    fun validateAmountWithPreviousFormat() {
        val amount = "3,113.28"
        val expected = "3,113.28"
        val response = validateAmountConversion(amount)
        assertEquals(expected, response)
    }

    @Test
    fun validateWithIncorrectFormatSmall() {
        val amount = "1,20"
        val expected = "1.20"
        val response = validateAmountConversion(amount)
        assertEquals(expected, response)
    }

    @Test
    fun validateWithIncorrectFormatBig() {
        val amount = "1.234.567.890,12"
        val expected = "1,234,567,890.12"
        val response = validateAmountConversion(amount)
        assertEquals(expected, response)
    }
}