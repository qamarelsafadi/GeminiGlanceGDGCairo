package com.qamar.geminiglance.glance

import android.content.Context
import android.graphics.BitmapFactory
import androidx.glance.action.ActionParameters
import androidx.glance.appwidget.updateAll
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.content
import com.qamar.geminiglance.BuildConfig
import com.qamar.geminiglance.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.withContext

object MyGeminiRepository {

    // TODO #10: define the param key
    val actionWidgetKey = ActionParameters.Key<Int>("action-widget-key")

    // TODO #6: Define our breakfast photos
//    val images = arrayOf(
//        // Image generated using Gemini from the prompt "cupcake image"
//        R.drawable.breakfast_1,
//        // Image generated using Gemini from the prompt "cookies images"
//        R.drawable.breakfast_2,
//        // Image generated using Gemini from the prompt "cake images"
//        R.drawable.breakfast_3,
//        // Image generated using Gemini from the prompt "cake images"
//        R.drawable.breakfast_4,
//    )


// TODO #7 : define our PreferencesKeys we have three :
//  1- the out come from gemini which is the result. result
//  2- getting a random image when click on image. randomImage
//  3- showing loading bar when waiting for gemini result. isLoading

//    var result = MutableStateFlow("")
//        private set
//    var randomImage = MutableStateFlow<Int>( R.drawable.breakfast_2)
//        private set
//    var isLoading = MutableStateFlow(false)
//        private set

    //TODO #12: what we need from Gemini template
//    private val generativeModel = GenerativeModel(
//        modelName = "gemini-1.5-flash",
//        apiKey = BuildConfig.apiKey
//    )


    // #TODO #13: getting the params and update the state for loading.
//    suspend fun updateLoadingState(context: Context) = withContext(Dispatchers.IO) {
//        isLoading.value = true
//        MyAppWidget().updateAll(context = context)
//    }


    // #TODO #14: getting the image and pass it to gemini model to analyse it
//    suspend fun getRecipe(context: Context, drawableRes: Int) = withContext(Dispatchers.IO) {
//        updateLoadingState(context)
//        val bitmap = BitmapFactory.decodeResource(
//            context.resources,
//            drawableRes
//        )
//        val response = generativeModel.generateContent(
//            content {
//                image(bitmap)
//                text("Provide a recipe for the breakfast goods in the image")
//            }
//        )
//        response.text?.let { outputContent ->
//            isLoading.value = false
//            result.value = outputContent
//        }
//
//        MyAppWidget().updateAll(context = context)
//    }


    // TODO #16: get random image and update the state.
//    suspend fun getRandomImage(context: Context) = withContext(Dispatchers.IO) {
//        randomImage.value = images.random()
//        MyAppWidget().updateAll(context)
//    }

}