package app.util

object HttpRoute {
    const val API_KEY = "e803fb0588cf45e1a78121355231107"
    private const val BASE_URL = "http://api.weatherapi.com/v1"
    const val CURRENT_WEATHER = "$BASE_URL/current.json"
    const val FORECAST_WEATHER = "$BASE_URL/forecast.json"
    const val SEARCH_WEATHER = "$BASE_URL/search.json"
}