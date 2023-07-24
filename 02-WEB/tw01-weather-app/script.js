const API_KEY_WEATHER = "486dd4a2f699407b933115924221810";



const initElements = () => {
    const root = document.getElementById("root");
    document.body.classList.add("bgimg")

    const divSearchBox = document.createElement("div");
    divSearchBox.classList.add("search-box");

    const userInput = document.createElement("input");
    userInput.classList.add("locationInput")
    userInput.setAttribute("list", "locations")

    const dataList = document.createElement("datalist");
    dataList.setAttribute("id", "locations")

    divSearchBox.append(userInput, dataList);

    const divLocationBox = document.createElement("div");
    divLocationBox.classList.add("location-box");

    const paraLocation = document.createElement("p");
    paraLocation.classList.add("location");

    divLocationBox.append(paraLocation);

    const divWeatherBox = document.createElement("div");
    divWeatherBox.classList.add("weather-box");

    const skyConditionIcon = document.createElement("img");
    skyConditionIcon.classList.add("icon");
    const paraTemperature = document.createElement("p");
    paraTemperature.classList.add("temperature");
    const paraSkyConditions = document.createElement("p");
    paraSkyConditions.classList.add("skyconditions");

    divWeatherBox.append(skyConditionIcon, paraTemperature, paraSkyConditions);

    const divWeatherDetails = document.createElement("div");
    divWeatherDetails.classList.add("weather-details");

    const paraHumidity = document.createElement("p");
    paraHumidity.classList.add("humidity");
    const paraWindSpeed = document.createElement("p");
    paraWindSpeed.classList.add("windspeed");

    divWeatherDetails.append(paraHumidity, paraWindSpeed);

    const divContainer = document.createElement("div");
    divContainer.classList.add("container");

    divContainer.append(divSearchBox, divLocationBox, divWeatherBox, divWeatherDetails);

    root.append(divContainer);
}

const loadBackground = async (input = "vienna") => {
    // if (input === "") {
    //     return;
    // }

    const pexelsApiPath = "https://api.pexels.com/v1/search?";
    const pexelsParamObjects = {
        query: input
    }

    const pexelsSearchParam = new URLSearchParams(pexelsParamObjects);
    const pexelsUrl = pexelsApiPath + pexelsSearchParam.toString();

    try {
        const options = {
            method: "GET",
            headers: {
                Authorization: "563492ad6f917000010000013c871e82e62d4eb7a848e3e1faca44bf"
            }
        }
        const pexelResponse = await fetch(pexelsUrl, options);
        const pexelData = await pexelResponse.json();

        if (!pexelResponse.ok) {
            document.body.style.backgroundImage = "";
        }

        const randomBackgroundNumber = Math.floor(Math.random() * pexelData.photos.length);
        const backgroundSource = pexelData.photos[randomBackgroundNumber].src.original;
        document.body.style.backgroundImage = `url(${backgroundSource})`;
    } catch (error) {
        console.log("pexelserror: ", error);
    }
}

const loadData = async (input = "vienna") => {
    if (input === "") {
        return;
    }

    const currentWeatherApiPath = "http://api.weatherapi.com/v1/current.json?"; //TODO: Constants
    const paramObjects = {
        key: API_KEY_WEATHER,
        q: input
    }

    const searchParam = new URLSearchParams(paramObjects);
    const url = currentWeatherApiPath + searchParam.toString();

    try {
        const response = await fetch(url);
        const data = await response.json();
        if (!response.ok) {
            const errorMessage = data.error.message;
            const noLocationImgPath = "/no_loc.png"; //TODO: Constants
            const noLocation = "";
            updateElements(errorMessage, noLocationImgPath, noLocation, noLocation, noLocation, noLocation);
        }

        const locationName = data.location.name;
        const conditionIcon = data.current.condition.icon;
        const temperature = `${data.current.temp_c} C°`;
        const skyConditions = data.current.condition.text;
        const humidity = `Humidity\n${data.current.humidity}%`
        const windSpeed = `Wind Speed\n${data.current.wind_kph}kph`;

        updateElements(locationName, conditionIcon, skyConditions, temperature, humidity, windSpeed);
    } catch (error) {
        console.log("loaderror: ", error);
    }


}

const updateElements = (location, iconSource, skyCon, temp, humid, speed) => {
    const locationElement = document.querySelector(".location");
    const tempElement = document.querySelector(".temperature");
    const skyElement = document.querySelector(".skyconditions");
    const humidElement = document.querySelector(".humidity");
    const iconElement = document.querySelector(".icon");
    const windElement = document.querySelector(".windspeed");

    locationElement.innerText = location;
    iconElement.src = iconSource;
    tempElement.innerText = temp;
    skyElement.innerText = skyCon;
    humidElement.innerText = humid;
    windElement.innerText = speed;
}

const autoComplete = async (input) => {
    if (input === "") {
        return;
    }

    const dataList = document.querySelector("#locations");
    const searchApiPath = "http://api.weatherapi.com/v1/search.json?"; //TODO: constant
    const paramObjects = {
        key: API_KEY_WEATHER,
        q: input
    }

    const searchParam = new URLSearchParams(paramObjects);
    const url = searchApiPath + searchParam.toString();

    try {
        const response = await fetch(url);
        const data = await response.json();

        while (dataList.firstChild) {
            dataList.removeChild(dataList.firstChild);
        }

        for (const element of data) {
            const optionElement = document.createElement("option");
            optionElement.value = element.name;
            optionElement.innerText = element.name;
            dataList.append(optionElement);
        }
    } catch (autoCompleteError) {
        console.log("autocomplete error: ", autoCompleteError);
    }
}

const main = () => {
    initElements();
    loadBackground();
    loadData();
    const userInput = document.querySelector(".locationInput");
    userInput.addEventListener("input", (event) => autoComplete(userInput.value));
    userInput.addEventListener("change", (event) => loadBackground(userInput.value) && loadData(userInput.value));
    console.log(window);
}

main();