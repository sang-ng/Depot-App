package com.example.android.depot.repository.purchases

import com.example.android.depot.db.purchase.PurchaseDao
import com.example.android.depot.db.purchase.PurchaseDatabaseItem


class PurchaseRepository(private val dao : PurchaseDao) {

    val purchases = dao.getPurchases()

    suspend fun getPurchases(){
        dao.getPurchases()
    }

    suspend fun addPurchase(purchase: PurchaseDatabaseItem){
        dao.addPurchase(purchase)
    }

    suspend fun deletePurchase(purchase: PurchaseDatabaseItem){
        dao.deletePurchase(purchase)
    }

    suspend fun deleteAllPurchases(){
        dao.deleteAllPurchases()
    }
}