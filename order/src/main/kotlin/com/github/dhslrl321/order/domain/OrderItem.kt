package com.github.dhslrl321.order.domain

import java.math.BigDecimal

class OrderItem(
  val id: String,
  val name: String,
  val price: BigDecimal,
  val quantity: Int,
) {
}
