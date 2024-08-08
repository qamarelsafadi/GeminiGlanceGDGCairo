package com.qamar.geminiglance.glance

import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver

// TODO #4 : define our broadcast receiver
class MyAppWidgetReceiver : GlanceAppWidgetReceiver()
{
    // TODO #5 : implement our widget
    override val glanceAppWidget: GlanceAppWidget
        get() = MyAppWidget()
}