package com.example.grocerylist

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "groceryList")
data class GroceryListEntity(
   private val groceryName:String,
   private val quantity:Int
){
   @PrimaryKey(autoGenerate = true)
   val id:Int?=null
}

