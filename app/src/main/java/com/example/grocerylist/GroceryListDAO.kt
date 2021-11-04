package com.example.grocerylist

import androidx.room.*


@Dao
interface GroceryListDAO {
    @Insert
    suspend fun insert(grocery:GroceryListEntity)

    @Update
    suspend fun update(grocery:GroceryListEntity)

    @Delete
    suspend fun delete(grocery:GroceryListEntity)

    @Query("delete from groceryList")
    suspend fun deleteAllGrocerList()
}