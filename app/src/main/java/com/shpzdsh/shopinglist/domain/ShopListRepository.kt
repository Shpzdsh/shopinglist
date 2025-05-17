package com.shpzdsh.shopinglist.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getShopItem(shooItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>

}