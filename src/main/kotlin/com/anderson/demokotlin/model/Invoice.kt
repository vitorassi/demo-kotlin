package com.anderson.demokotlin.model

import java.math.BigDecimal
import java.time.LocalDate


class Invoice(var id: Int, var description: String, var expiryDate: LocalDate, var value: BigDecimal = BigDecimal.ZERO) {

}