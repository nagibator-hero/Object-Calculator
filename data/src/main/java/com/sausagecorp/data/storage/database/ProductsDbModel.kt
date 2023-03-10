package com.sausagecorp.data.storage.database

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class ProductsDbModel(
    @PrimaryKey
    val productName: String,
    val productPrice: Int,
    val productQuantity: Int,
    val productAddedCount: Int = 0,
    val productParentCategory: String
)
