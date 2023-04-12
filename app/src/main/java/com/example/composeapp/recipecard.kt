package com.example.composeapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.example.composeapp.model.Recipe
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RecipeCard(recipe:Recipe, modifier: Modifier){
    Surface(shape = RoundedCornerShape(8.dp), elevation = 12.dp,
    modifier = Modifier) {
        val image = painterResource(id = recipe.imageResource)
//    class to call image and text
        Column(modifier= Modifier.fillMaxWidth()) {
//        image and text
            Image(painter = image, contentDescription = "a delicious cake",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(144.dp),
                contentScale = ContentScale.Crop)
            Text(recipe.title, modifier = Modifier.padding(5.dp))
//        tag for ingredients
            Text(text = "INGREDIENTS....", modifier = Modifier.padding(5.dp))
//        looping ingredients to show ingredients
            for (ingredient in recipe.ingredients){
                Text("-$ingredient", modifier = Modifier.padding(5.dp))
            }
        }
        
    }
}
//dummy
@Composable
@Preview
fun DefaultRecipeCard(){
//  default  from recipe.kt dummy objects
    RecipeCard(defaultrecipes[3], modifier = Modifier.padding(16.dp))
}