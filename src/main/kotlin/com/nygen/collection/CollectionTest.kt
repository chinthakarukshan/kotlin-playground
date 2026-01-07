package com.nygen.collection

import com.nygen.restaurant.Recipe

fun main(args: Array<String>) {
    val shopping: List<String> = listOf("Tea","Eggs","Milk")

    if (shopping.size > 0) {
        println(shopping[0])
    }

    val mutableShopping = mutableListOf("Tea","Eggs")

    mutableShopping.add("Milk")

    mutableShopping.forEach { print(",$it") }

    mutableShopping.add(1,"Biscuit")

    mutableShopping.forEach { print(",$it") }

    if(mutableShopping.contains("Biscuit")) {
        mutableShopping.remove("Biscuit")
    }
    println()

    mutableShopping.forEach { print(",$it") }

    if (mutableShopping.size > 0) {
        mutableShopping.set(0,"Coffee")
    }
    println()
    mutableShopping.forEach { print(",$it") }

    mutableShopping.sort()
    println()
    mutableShopping.forEach { print(",$it") }

    mutableShopping.reverse()
    println()
    mutableShopping.forEach { print(",$it") }

    val toAdd = listOf("Cookies", "Sugar")

    mutableShopping.addAll(toAdd)

    println()
    mutableShopping.forEach { print(",$it") }

    mutableShopping.clear()
    println()
    mutableShopping.forEach { print(",$it") }

    val friendSet = setOf("Nuwan","Damitha","Nalaka")
    println()
    friendSet.forEach { print(", $it") }

    val mFriendSet = mutableSetOf("Jim","Sue")
    println()
    mFriendSet.forEach { print(", $it") }

    mFriendSet.add("Nuhan")
    println()
    mFriendSet.forEach { print(", $it") }

    mFriendSet.remove("Jim")
    println()
    mFriendSet.forEach { print(", $it") }

    val newFriends = setOf("Joe","Mia")
    mFriendSet.addAll(newFriends)
    println()
    mFriendSet.forEach { print(", $it") }

    val newFriendsSnapshot = mFriendSet.toSet()
    println()
    newFriendsSnapshot.forEach { print(", $it") }

    val receip01 = Recipe("Chicken Soup", false)
    val receip02 = Recipe("Veg soup", true)
    val receip03 = Recipe("Dhal tikka", true)

    val recipeMap = mapOf("Recipe01" to receip01, "Recipe02" to receip02, "Recipe03" to receip03)
    val recipeMap02: Map<String, Recipe> = mapOf("Recipe01" to receip01, "Recipe02" to receip02, "Recipe03" to receip03)

    val receipToCheck = Recipe("Chicken Soup", false)

    if(recipeMap.containsKey("Recipe01")) println("Recipe01 is available in the Map")

    if(recipeMap.containsValue(receipToCheck)) println("Recipe has the value")

    println(recipeMap02.getValue("Recipe01"))//throws an exception if the key doesn't exist
    println(recipeMap02.get("Recipe02"))// returns null if the key doesn't exist

    for((key,value) in recipeMap) {
        println("key is $key and the value is $value")
    }

    val mRecipeMap = mutableMapOf("Recipe01" to receip01, "Recipe02" to receip02)
    mRecipeMap.put("Recipe03",receip03)

    mRecipeMap.remove("Recipe02")
}