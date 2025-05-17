package com.shpzdsh.shopinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shooItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shooItemId)
    }
}