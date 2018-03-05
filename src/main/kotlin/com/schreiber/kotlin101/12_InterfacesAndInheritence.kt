package com.schreiber.kotlin101

data class Order(val orderNumber : Int)

interface OrderRepository {
    fun findOrder(identifier: Int): Order
}

class OracleOrderRepository : OrderRepository {
    override fun findOrder(identifier : Int) : Order  = Order(123)
}

