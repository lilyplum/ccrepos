import {isPanelOn, formatTemperatureValue} from "./panel.js"

const setTemperatureElement = document.querySelector("#set-temperature-num");
const roomTemperatureElement = document.querySelector("#temperature-num")


function changeTemperature(roomTemperature, setTemperature) {
    /**
     * Correct the room temperature according to the set temperature
     * by calling the decreaseTemperature() or increaseTemperature() function.
     * If the temperature equals the setting, write a message to the console.
     *
     * @param {number} roomTemperature - the current temperature of the room
     * @param {number} setTemperature - the current setting for the thermostat
     *
     * @returns the corrected room temperature.
     */
    //TODO - increase or decrease the room temperature in the room?
    //your code here
}

function increaseTemperature(roomTemperature) {
    /**
     * Increase the room temperature with 0.5.
     * @param {number} roomTemperature - the current room temperature, which this function increases.
     * @returns The correctly set value for roomTemperature.
     */
    console.log("Temperature is increased by 0.5 °C")
    //TODO - what should this function return ?
    //your code here
}

function decreaseTemperature(roomTemperature) {
    /**
     * Decrease the room temperature with 0.5.
     * @param {number} roomTemperature - the current room temperature, which this function decreases.
     * @returns The correctly set value for roomTemperature.
     */
    console.log("Room temperature equals the set value.")
    //TODO - what should this function return ?
    //your code here
}

export function changeSetTemperature(isIncrease) {
    /**
     * Change the set temperature based on the clicked button
     * by calling the increaseSetTemperature or the decreaseSetTemperature based on the value of isIncrease.
     *
     * @param {boolean} isIncrease - helps to decide whether to increase, or decrease the set temperature.
     */

    if (isPanelOn()) {

        let setTemperature;
        const currentTemperature = parseFloat(setTemperatureElement.innerText)
        //TODO - increase or decrease the temperature setting?
        //your code here

        setTemperatureElement.innerText = formatTemperatureValue(setTemperature);
    } else {
        console.error("Panel is turned off, sorry!");
    }
}

function increaseSetTemperature(setTemperature) {
    /**
     * Increase the set temperature with 0.5.
     * @param {number} setTemperature - the temperature setting, which this function increases.
     * @returns The correctly set value for setTemperature.
     */
    console.log("Temperature is set higher by 0.5 °C")
    //TODO - what should this functios return?
    //your code here
}

function decreaseSetTemperature(setTemperature) {
    /**
     * Decrease the set temperature with 0.5.
     * @param {number} setTemperature - the temperature setting, which this function decreases.
     * @returns The correctly set value for setTemperature.
     */
    console.log("Temperature is set lower by 0.5 °C")
    //TODO - what should this function return ?
    //your code here
}

export function handleRoomTemperatureChange() {
    /**
     * Handles changes in room temperature according to the set temperature at stated intervals.
     * Works only, if the device is on.
     */
    if (isPanelOn()) {
        let roomTemperature = parseFloat(roomTemperatureElement.innerText);
        let setTemperature = parseFloat(setTemperatureElement.innerText);

        let changedTemperature = changeTemperature(roomTemperature, setTemperature);
        roomTemperatureElement.innerText = formatTemperatureValue(changedTemperature);
    }
}
