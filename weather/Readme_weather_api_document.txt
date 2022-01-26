

API 1 :

HTTP METHOD : GET
URL : localhost:8080/api/adnan/weather_by_city_country?q=Karachi,pk
REQUEST PARAMS : q = comma separated {city name},{country code}
RESPONSE PARAMS : "data" will have response, "success" will have api response true or false, "timestamp" will have timestamp of the response

Sample Response :

{
    "data": {
        "coord": {
            "lon": 67.0822,
            "lat": 24.9056
        },
        "weather": [
            {
                "id": 800,
                "main": "Clear",
                "description": "clear sky",
                "icon": "01d"
            }
        ],
        "base": "stations",
        "main": {
            "temp": 294.05,
            "feels_like": 293.32,
            "temp_min": 294.05,
            "temp_max": 294.05,
            "pressure": 1018,
            "humidity": 43
        },
        "visibility": 6000,
        "wind": {
            "speed": 4.12,
            "deg": 80
        },
        "clouds": {
            "all": 0
        },
        "dt": 1643177761,
        "sys": {
            "type": 1,
            "id": 7576,
            "country": "PK",
            "sunrise": 1643163385,
            "sunset": 1643202696
        },
        "timezone": 18000,
        "id": 1174872,
        "name": "Karachi",
        "cod": 200
    },
    "success": true,
    "timestamp": "2022-01-26T06:23:18.428Z"
} 
 
API 2 :

HTTP METHOD : GET
URL : localhost:8080/api/adnan/weather_by_lat_lon?lat=35&lon=139
REQUEST PARAMS : lat = {latitude in numbers} , lon={longitude in numbers}
RESPONSE PARAMS : "data" will have response, "success" will have api response true or false, "timestamp" will have timestamp of the response

Sample Response :

{
    "data": {
        "coord": {
            "lon": 139.0,
            "lat": 35.0
        },
        "weather": [
            {
                "id": 804,
                "main": "Clouds",
                "description": "overcast clouds",
                "icon": "04d"
            }
        ],
        "base": "stations",
        "main": {
            "temp": 279.71,
            "feels_like": 279.71,
            "temp_min": 279.44,
            "temp_max": 281.8,
            "pressure": 1013,
            "humidity": 83
        },
        "visibility": 10000,
        "wind": {
            "speed": 0.45,
            "deg": 158
        },
        "clouds": {
            "all": 90
        },
        "dt": 1643178175,
        "sys": {
            "type": 2,
            "id": 2019346,
            "country": "JP",
            "sunrise": 1643147227,
            "sunset": 1643184328
        },
        "timezone": 32400,
        "id": 1851632,
        "name": "Shuzenji",
        "cod": 200
    },
    "success": true,
    "timestamp": "2022-01-26T06:23:37.035Z"
}