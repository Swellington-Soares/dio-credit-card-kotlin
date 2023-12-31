package dev.suel.credit.application.system.service

import dev.suel.credit.application.system.entity.Customer

interface ICustomerService {
  fun save(customer: Customer): Customer
  fun findById(id: Long): Customer
  fun delete(id: Long)
}