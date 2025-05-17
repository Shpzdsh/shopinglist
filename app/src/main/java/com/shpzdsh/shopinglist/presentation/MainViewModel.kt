package com.shpzdsh.shopinglist.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shpzdsh.shopinglist.data.ShopListRepositoryImpl
import com.shpzdsh.shopinglist.domain.DeleteShopItemUseCase
import com.shpzdsh.shopinglist.domain.EditShopItemUseCase
import com.shpzdsh.shopinglist.domain.GetShopListUseCase
import com.shpzdsh.shopinglist.domain.ShopItem

class MainViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()


    fun deleteShopItem(shopItem: ShopItem) {
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnabledState(shopItem: ShopItem) {
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}