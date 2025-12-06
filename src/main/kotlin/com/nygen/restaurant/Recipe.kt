package com.nygen.restaurant

data class Recipe(val title: String, val isVegetarian: Boolean,var mainIngredient:String = "", val difficulty:String="Easy") {
}