
const input = document.querySelector("input");
const charLabel = document.getElementById("charname");
//const genderList = document.querySelectorAll(".gender option");
const gendersList = document.querySelector(".gender");
const racesList = document.querySelector(".races");
const classesList = document.querySelector(".classes");
//const female = document.getElementById("female");

input.addEventListener("input", updateCharacterInput);
gendersList.addEventListener("input", updateGender);
racesList.addEventListener("input", updateRace);
classesList.addEventListener("input", updateClass);

/* for(gender of genderList) {
    gender.addEventListener("click", updateGender);
    console.log(gender);
} */

function updateCharacterInput(charInput) {
    charLabel.textContent = charInput.target.value;
}

function updateGender() {
    if(this.value === 'female') {
        document.getElementById("female").classList.remove('hide');
        document.getElementById("male").classList.add('hide');
        document.getElementById("nb").classList.add('hide');
        document.getElementById("none").textContent = ""
    } else if(this.value === 'male') {
        document.getElementById("male").classList.remove('hide');
        document.getElementById("female").classList.add('hide');
        document.getElementById("nb").classList.add('hide');
        document.getElementById("none").textContent = ""
    } else if(this.value === 'non-binary') {
        document.getElementById("nb").classList.remove('hide');
        document.getElementById("female").classList.add('hide');
        document.getElementById("male").classList.add('hide');
        document.getElementById("none").textContent = ""

    } else if(this.value === 'none') {
        document.getElementById("none").textContent = "Genderless"
        document.getElementById("female").classList.add('hide');
        document.getElementById("male").classList.add('hide');
        document.getElementById("nb").classList.add('hide');

    }
}

function updateRace() {
    if(this.value === 'elf') {
        document.getElementById("elf").classList.remove('hide');
        document.getElementById("dwarf").classList.add('hide');
        document.getElementById("human").classList.add('hide');
        document.getElementById("orc").classList.add('hide');
    } else if(this.value === 'dwarf') {
        document.getElementById("dwarf").classList.remove('hide');
        document.getElementById("elf").classList.add('hide');
        document.getElementById("human").classList.add('hide');
        document.getElementById("orc").classList.add('hide');
    } else if(this.value === 'human') {
        document.getElementById("human").classList.remove('hide');
        document.getElementById("elf").classList.add('hide');
        document.getElementById("dwarf").classList.add('hide');
        document.getElementById("orc").classList.add('hide');

    } else if(this.value === 'orc') {
        document.getElementById("orc").remove('hide');
        document.getElementById("elf").classList.add('hide');
        document.getElementById("dwarf").classList.add('hide');
        document.getElementById("human").classList.add('hide');

    }
}

function updateClass() {
    if(this.value === 'mage') {
        document.getElementById("mage").classList.remove('hide');
        document.getElementById("ranger").classList.add('hide');
        document.getElementById("fihter").classList.add('hide');
    } else if(this.value === 'ranger') {
        document.getElementById("ranger").classList.remove('hide');
        document.getElementById("mage").classList.add('hide');
        document.getElementById("warrior").classList.add('hide');
    } else if(this.value === 'warrior') {
        document.getElementById("warrior").classList.remove('hide');
        document.getElementById("mage").classList.add('hide');
        document.getElementById("ranger").classList.add('hide');
    }
}
