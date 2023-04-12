package com.example.composeapp

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.composeapp.model.Recipe

@Composable
fun RecipeList(recipes:List<Recipe>){
//    making a recycler view: Lazycolumn
    LazyColumn{
        items(recipes){item ->
            RecipeCard(recipe = item, modifier = Modifier.padding(12.dp))
        }
        
    }
}