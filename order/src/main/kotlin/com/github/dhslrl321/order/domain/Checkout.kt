package com.github.dhslrl321.order.domain

import java.math.BigDecimal
import java.time.Instant

class Checkout(
  val id: String,
  val buyerId: String,
  val orderItems: List<OrderItem>,
  val createdAt: Instant,
) {
  val orderAmount: BigDecimal
    get() = orderItems
      .map { it.price * BigDecimal(it.quantity) }
      .reduce { acc, itemTotal -> acc + itemTotal }
}
