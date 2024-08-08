package com.qamar.geminiglance.glance

import android.content.Context
import android.util.Log
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.unit.dp
import androidx.glance.Button
import androidx.glance.ButtonDefaults
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.Image
import androidx.glance.ImageProvider
import androidx.glance.Visibility
import androidx.glance.action.ActionParameters
import androidx.glance.action.clickable
import androidx.glance.appwidget.CircularProgressIndicator
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.action.ActionCallback
import androidx.glance.appwidget.action.actionRunCallback
import androidx.glance.appwidget.cornerRadius
import androidx.glance.appwidget.provideContent
import androidx.glance.appwidget.state.updateAppWidgetState
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.ContentScale
import androidx.glance.layout.Spacer
import androidx.glance.layout.fillMaxWidth
import androidx.glance.layout.height
import androidx.glance.layout.padding
import androidx.glance.layout.size
import androidx.glance.layout.wrapContentHeight
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import androidx.glance.visibility
import com.qamar.geminiglance.R


class MyAppWidget : GlanceAppWidget() {

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        provideContent {
            // TODO #8: collect my states
//            val isLoading by MyGeminiRepository.isLoading.collectAsState()
//            val result by MyGeminiRepository.result.collectAsState()
//            val randomImage by MyGeminiRepository.randomImage.collectAsState()

            // TODO #9: create our UI.
//            Column(
//                GlanceModifier.fillMaxWidth()
//                    .padding(10.dp)
//                    .wrapContentHeight()
//                    .background(Blue),
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Spacer(GlanceModifier.height(10.dp))
//                Text(
//                    text = "Breakfast with Breakfasty!", style = TextStyle(
//                        color = ColorProvider(Color.White)
//                    )
//                )
//                Spacer(GlanceModifier.height(10.dp))
//                Image(
//                    provider = ImageProvider(randomImage),
//                    contentDescription = "",
//                    modifier = GlanceModifier.fillMaxWidth()
//                        .height(100.dp)
//                        .cornerRadius(25.dp)
//                        .clickable(actionRunCallback<GetRandomImage>()),
//                    contentScale = ContentScale.Crop
//                )
//
//                Spacer(GlanceModifier.height(10.dp))
//
//                androidx.glance.appwidget.lazy.LazyColumn(horizontalAlignment = Alignment.CenterHorizontally) {
//                    item {
//                        if (isLoading.not()) {
//                            Text(
//                                text = result, style = TextStyle(
//                                    color = ColorProvider(Color.White)
//                                )
//                            )
//                        }
//                    }
//                    item {
//                        Spacer(GlanceModifier.height(20.dp))
//                        CircularProgressIndicator(
//                            color = ColorProvider(Color.White),
//                            modifier = GlanceModifier.visibility(
//                                if (isLoading)
//                                    Visibility.Visible
//                                else Visibility.Gone
//                            ).size(30.dp)
//                        )
//                        Button(
//                            text = "get recipe",
//                            onClick = actionRunCallback<GetRecipe>(),
//                            colors = ButtonDefaults.buttonColors(
//                                backgroundColor = ColorProvider(
//                                    Color.White
//                                ),
//                                contentColor = ColorProvider(Blue)
//                            ),
//                            modifier = GlanceModifier.visibility(
//                                if (isLoading.not())
//                                    Visibility.Visible
//                                else Visibility.Gone
//                            )
//                        )
//                    }
//                }
//            }
        }
    }
}


class GetRandomImage : ActionCallback {
    override suspend fun onAction(
        context: Context,
        glanceId: GlanceId,
        parameters: ActionParameters
    ) {
        // TODO #17: get random image and update the state.
      //  MyGeminiRepository.getRandomImage(context)
    }
}

// TODO #11: define the callback action.
class GetRecipe : ActionCallback {
    override suspend fun onAction(
        context: Context,
        glanceId: GlanceId,
        parameters: ActionParameters
    ) {
//        val drawableRes = parameters[MyGeminiRepository.actionWidgetKey] ?: R.drawable.baked_goods_2
//        updateAppWidgetState(context, glanceId) { prefs ->
//            // #TODO #15: getting the image and pass it to gemini model to analyse it
//          //  MyGeminiRepository.getRecipe(context, drawableRes)
//        }
    }
}
