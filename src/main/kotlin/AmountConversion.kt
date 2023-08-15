fun validateAmountConversion(amount: String?): String {
    if (amount == null) {
        return ""
    }

    if (amount.replace(",", "").replace(".", "").toDoubleOrNull() == null) {
        return ""
    }

    return if (amount.contains(",")) {
        val pos = amount.length - 3
        if (amount[pos] == ',') {
            val newAmount = amount.replace(".", "")
                .replace(",", ".")
            String.format("%,.2f", newAmount.toDouble())
        } else {
            String.format("%,.2f", amount.replace(",", "").toDouble())
        }
    } else {
        String.format("%,.2f", amount.toDouble())
    }


//    val amountDouble = amount.toDoubleOrNull() ?: return ""
//
//    return String.format("%,.2f", amountDouble)
}