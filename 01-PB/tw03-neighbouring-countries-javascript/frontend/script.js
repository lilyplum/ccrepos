const countryList = document.getElementById("all");
const populationButton = document.getElementById("population");
const areaButton = document.getElementById("area");
const nextButton = document.getElementById("next");
const previousButton = document.getElementById("previous");

countryList.addEventListener("change", userSelectedCountry);
populationButton.addEventListener("click", populationMain);
areaButton.addEventListener("click", areaMain);
nextButton.addEventListener("click", nextCountry);
previousButton.addEventListener("click", previousCountry);

populationButton.style.visibility = "hidden";
areaButton.style.visibility = "hidden";
nextButton.disabled = true;
previousButton.disabled = true;

let history = [];
let historyIndex = null;

for(let i = 0; i < countries.length; i++) {
    let countryName = countries[i].name.common;
    const newOption = document.createElement("option");
    const optionContent = document.createTextNode(countryName);
    newOption.appendChild(optionContent);
    countryList.appendChild(newOption);
}

function userSelectedCountry() {
    let currentIndex = countryList.selectedIndex;
    selectCountry(currentIndex);
}

function selectCountry (countryIndex) {
    showCountry(countryIndex);
    populationButton.style.visibility = "visible"; 
    areaButton.style.visibility = "visible";
    history.push(countryIndex);
    historyIndex = history.length -1;
    if (history.length >= 2) {
        previousButton.disabled = false;
        previousButton.classList.remove("disabled");
    }
    return countryIndex;
}

function showCountry(countryIndex) {
    document.getElementById("noneselected").innerText = "";
    document.getElementById("flag").src = countries[countryIndex].flags.png;
    document.getElementById("common-name").innerText = countries[countryIndex].name.common;
    document.getElementById("region").innerText = countries[countryIndex].region;
    document.getElementById("subregion").innerText = countries[countryIndex].subregion;
    document.getElementById("capital").innerText = countries[countryIndex].capital;
}

function previousCountry() {
    nextButton.disabled = false;
    nextButton.classList.remove("disabled");
    historyIndex = historyIndex -1;
    if (historyIndex === 0) {
        showCountry(history[historyIndex]);
        previousButton.disabled = true;
        previousButton.classList.add("disabled");
        countryList.value = countries[history[historyIndex]].name.common;
    } else {
        showCountry(history[historyIndex]);
        countryList.value = countries[history[historyIndex]].name.common;
    }
}

function nextCountry() {
    previousButton.disabled = false;
    previousButton.classList.remove("disabled");
    historyIndex = historyIndex +1;
    if (historyIndex === history.length -1) {
        showCountry(history[historyIndex])
        nextButton.disabled = true;
        nextButton.classList.add("disabled");
        countryList.value = countries[history[historyIndex]].name.common;
    } else {
        showCountry(history[historyIndex]);
        countryList.value = countries[history[historyIndex]].name.common;
    }
}

function getNeighbourCountries() {
    currentIndex = countryList.selectedIndex;
    let neighbourList = countries[currentIndex].borders;
    return neighbourList;
}

function getNeighbourIndex(neighbourList) {
    let indexList = [];
    if (neighbourList === undefined) {
        return;
    } else {
        for( let i = 0; i < neighbourList.length; i++) {
            for(let j = 0; j < countries.length; j++) {
                if(neighbourList[i] === countries[j].cca3) {
                    indexList.push(j);
                }
            }
        }
    }
    return indexList;
}

function largestPopulation(indexList) {
    let neighbourPopulation = 0;
    if (indexList === undefined) {
        return;
    } else {
        for (let i = 0; i < indexList.length; i++) {
            if (neighbourPopulation < countries[indexList[i]].population) {
                neighbourPopulation = countries[indexList[i]].population;
            }
        }
    }
    for(let i = 0; i < countries.length; i++) {
        if (neighbourPopulation === countries[i].population) {
            return i;
        }
    }
}

function largestArea(indexList) {
    let neighbourArea = 0;
    if (indexList === undefined) {
        return;
    } else {
        for (let i = 0; i < indexList.length; i++) {
            if (neighbourArea < countries[indexList[i]].area) {
                neighbourArea = countries[indexList[i]].area;
            }
        }
    }
    for(let i = 0; i < countries.length; i++) {
        if (neighbourArea === countries[i].area) {
            return i;
        }
    }
}

function populationMain() {
    nextButton.disabled = true;
    nextButton.classList.add("disabled");
    let neighbourList = getNeighbourCountries();
    let neighbourIndex = getNeighbourIndex(neighbourList);
    let largestPopulationIndex = largestPopulation(neighbourIndex);
    if(largestPopulationIndex === undefined) {
        alert(`There are no Neighbours for: ${countries[currentIndex].name.common}`);
    } else {
        selectCountry(largestPopulationIndex);
        countryList.value = countries[largestPopulationIndex].name.common;
    }
}

function areaMain() {
    nextButton.disabled = true;
    nextButton.classList.add("disabled");
    let neighbourList = getNeighbourCountries();
    let neighbourIndex = getNeighbourIndex(neighbourList);
    let largestAreaIndex = largestArea(neighbourIndex);
    if(largestAreaIndex === undefined) {
        alert(`There are no Neighbours for: ${countries[currentIndex].name.common}`);
    } else {
        selectCountry(largestAreaIndex);
        countryList.value = countries[largestAreaIndex].name.common;
    }
}