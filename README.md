# Weather App

Weather App est une application mobile simple et intuitive développée en **Kotlin** pour Android. Elle permet d’afficher en temps réel la météo de n’importe quelle ville, en utilisant des données provenant d’une API météo externe (OpenWeatherMap, WeatherAPI, etc.).

## Fonctionnalités

- **Recherche de ville** : Saisissez le nom d’une ville pour obtenir ses conditions météorologiques actuelles.
- **Affichage en temps réel** : Récupération et affichage instantané de la météo (température, état du ciel, humidité, etc.).
- **Interface moderne** : UI claire et responsive conçue en Jetpack Compose / XML.
- **Gestion des erreurs** : Messages adaptés en cas de ville non trouvée ou de problème réseau.

## Stack technique

- **Langage** : Kotlin
- **Framework** : Android (Jetpack Compose ou XML)
- **Réseau/API** : Retrofit, OkHttp
- **Parser JSON** : Moshi/Gson
- **API météo utilisée** : [OpenWeatherMap](https://openweathermap.org/api) (ou toute autre API de météo publique)
- **Architecture** : MVVM
- **Gestion des états** : LiveData/Flow

## Capture d’écran

![Capture d’écran de l’application Weather](screenshot.png)

## Utilisation

1. **Clé API** :  
   Obtenez votre clé API gratuite sur [OpenWeatherMap](https://openweathermap.org/appid) ou le service choisi.  
   Ajoutez-la dans le fichier `local.properties` ou dans les ressources de l’appli.

2. **Lancement** :  
   Lancez l’app sur votre appareil ou un émulateur Android.  
   Depuis l’écran principal, recherchez une ville pour afficher sa météo.

## Exemple de code pour appel API

```kotlin
// Exemple d’appel avec Retrofit
@GET("weather")
suspend fun getWeatherByCity(
    @Query("q") city: String,
    @Query("appid") apiKey: String,
    @Query("units") units: String = "metric"
): WeatherResponse
