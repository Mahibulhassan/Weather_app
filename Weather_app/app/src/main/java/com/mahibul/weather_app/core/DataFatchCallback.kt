package com.mahibul.weather_app.core

interface DataFatchCallback<T> {
    fun onSuccess (data : T)
    fun onError (throwable: Throwable)
}