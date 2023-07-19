// const pizza = async () => {
//     const url = "http://localhost:8000/api/pizza";

//     const reponse = await fetch(url);
//     const data = await reponse.json();

//     return data;
// }

// const renderData = async () => {
//     const pizzaData = await pizza();

//     for (const pizza of pizzaData) {
//         const pizzaDiv = document.createElement("div");
//         const addToBasketButton = document.createElement("button");
//         const pizzaNameElement = document.createElement("p");
//         const ingredientsList = document.createElement("ul");
//         const allergenes = document.createElement("p");

//         addToBasketButton.innerText = pizza.price + " €,-";
//         pizzaNameElement.innerText = pizza.name;
//         allergenes.innerHTML = pizza.allergens;
//         addToBasketButton.setAttribute("data", pizza.price);

//         for (const ingredient of pizza.ingredients) {
//             const ingredientElement = document.createElement("li");
//             ingredientElement.innerText = ingredient;
//             ingredientsList.append(ingredientElement);
//         }

//         addToBasketButton.classList.add("button", "addToBasket");
//         addToBasketButton.addEventListener("click", addPizzaToBasket);
//         allergenes.classList.add("text", "allergenesText");
//         pizzaNameElement.classList.add("text", "pizzaNameElement");
//         ingredientsList.classList.add("text");

//         pizzaDiv.setAttribute("id", "selection");
//         pizzaDiv.append(
//             pizzaNameElement,
//             ingredientsList,
//             allergenes,
//             addToBasketButton
//         );

//         pizzaList.append(pizzaDiv);
//     }
// }

// const addPizzaToBasket = (event) => {
//     const pizzaName = event.target.parentNode.firstChild.innerText;
//     const price = event.target.attributes[0].value;

//     const basket = {
//         "pizzaType": pizzaName,
//         "price": price
//     }

//     userBasket.value += JSON.stringify(basket);

//     userInputBackground.classList.remove("hidden");
//     headerbox.classList.add("blurry");
//     pizzaList.classList.add("blurry");
// }

// renderData();

// const body = document.getElementById("main");

// //
// // HEADER NOTE //
// //

// const headerNote = document.createElement("div");
// const logohead = document.createElement("img");
// const restaurantName = document.createElement("p");

// logohead.src = "https://cdn-icons-png.flaticon.com/512/1404/1404996.png";
// restaurantName.innerText = "Laguna Pantofolaio";

// restaurantName.classList.add("restaurantName");
// headerNote.classList.add("headNoteBox");
// logohead.classList.add("icon");

// headerNote.append(logohead, restaurantName);

// //
// // FOOTER NOTE //
// //

// const footNote = document.createElement("div");
// const logofoot = document.createElement("img");

// logofoot.src = "https://cdn-icons-png.flaticon.com/512/1404/1404996.png";

// footNote.classList.add("footNoteBox");
// logofoot.classList.add("iconbottom");

// footNote.append(logofoot);

// //
// // HTML BODY DIV //
// //

// const htmlBody = document.createElement("div");
// htmlBody.classList.add("wholedamnthing");

// //
// // BANNER BOX //
// //

// const headerbox = document.createElement("div");
// const headline = document.createElement("h1");
// const info = document.createElement("p");
// const pizzaIMG = document.createElement("img");
// const transparentIMG1 = document.createElement("img");
// const transparentIMG2 = document.createElement("img");
// const transparentIMG3 = document.createElement("img");

// headline.innerText = "Laguna Pantofolaio";
// info.innerText = `+43 0650/12345678
//                 Mo-Fr -> 10-22
//                 Sa -> 15-22
//                 So -> Closed`;
// pizzaIMG.src = "https://pizzapanorama.ca/images/adobestock_266429012.jpg?crc=125304778";
// transparentIMG1.src = "https://cdn-icons-png.flaticon.com/512/1404/1404996.png";
// transparentIMG2.src = "https://cdn-icons-png.flaticon.com/512/1404/1404996.png";
// transparentIMG3.src = "https://cdn-icons-png.flaticon.com/512/1404/1404996.png";

// headerbox.classList.add("headerbox");
// headline.classList.add("headline", "header");
// info.classList.add("infotext", "header");
// pizzaIMG.classList.add("pizzaIMG", "header");

// transparentIMG1.classList.add("transparentPNG1", "header");
// transparentIMG2.classList.add("transparentPNG2", "header");
// transparentIMG3.classList.add("transparentPNG3", "header");

// headerbox.append(
//     headline,
//     info,
//     pizzaIMG,
//     transparentIMG1,
//     transparentIMG2,
//     transparentIMG3
// );

// //
// // OrderBox //
// //

// const pizzaList = document.createElement("div");
// pizzaList.classList.add("pizzaList");

// const transparentIMG4 = document.createElement("img");
// const transparentIMG5 = document.createElement("img");
// const transparentIMG6 = document.createElement("img");
// const transparentIMG7 = document.createElement("img");
// const transparentIMG8 = document.createElement("img");

// transparentIMG4.src = "https://cdn-icons-png.flaticon.com/512/1404/1404996.png";
// transparentIMG5.src = "https://cdn-icons-png.flaticon.com/512/1404/1404996.png";
// transparentIMG6.src = "https://cdn-icons-png.flaticon.com/512/1404/1404996.png";
// transparentIMG7.src = "https://cdn-icons-png.flaticon.com/512/1404/1404996.png";
// transparentIMG8.src = "https://cdn-icons-png.flaticon.com/512/1404/1404996.png";

// transparentIMG4.classList.add("transparentPNG4", "header");
// transparentIMG5.classList.add("transparentPNG5", "header");
// transparentIMG6.classList.add("transparentPNG6", "header");
// transparentIMG7.classList.add("transparentPNG7", "header");
// transparentIMG8.classList.add("transparentPNG8", "header");

// pizzaList.append(
//     transparentIMG4,
//     transparentIMG5,
//     transparentIMG6,
//     transparentIMG7,
//     transparentIMG8
// )

// //
// // Order Information //
// //

// const userInputBackground = document.createElement("div");
// const userInputs = document.createElement("div");

// const orderText = document.createElement("p");

// const userFirstName = document.createElement("input");
// const userLastName = document.createElement("input");
// const userEmailAddress = document.createElement("input");
// const userZip = document.createElement("input");
// const userCity = document.createElement("input");
// const userStreet = document.createElement("input");
// const userBasket = document.createElement("input");
// const submitBtn = document.createElement("button");
// const orderForm = document.createElement("form");

// orderText.innerText = `Please surrender your personal informations to satan.`;
// orderText.classList.add("ordertext");

// orderForm.action = "/api/order";
// orderForm.method = "POST";

// userFirstName.placeholder = "First Name";
// userLastName.placeholder = "Last Name";
// userEmailAddress.placeholder = "Email Address";
// userZip.placeholder = "Zip";
// userCity.placeholder = "City";
// userStreet.placeholder = "Street and Number";

// userFirstName.name = "firstName";
// userLastName.name = "lastName";
// userEmailAddress.name = "emailAddress";
// userZip.name = "zip";
// userCity.name = "city";
// userStreet.name = "address";

// userFirstName.classList.add("firstname", "inputfield");
// userLastName.classList.add("lastname", "inputfield");
// userEmailAddress.classList.add("email", "inputfield");
// userZip.classList.add("zip", "inputfield");
// userCity.classList.add("city", "inputfield");
// userStreet.classList.add("street", "inputfield");

// userBasket.name = "basket";
// //userBasket.style.visibility = "hidden";

// submitBtn.classList.add("submit", "sbmButton");
// submitBtn.innerText = "Order Now";
// submitBtn.type = "submit";

// userInputBackground.classList.add("userInputBackground", "hidden");
// userInputs.classList.add("userInputs");

// userInputs.append(
//     orderText,
//     userFirstName,
//     userLastName,
//     userEmailAddress,
//     userZip,
//     userCity,
//     userStreet,
//     userBasket,
//     submitBtn
// );

// orderForm.append(
//     userInputs
// );

// userInputBackground.append(
//     orderForm
// );

// htmlBody.append(
//     headerbox,
//     pizzaList,
//     userInputBackground
// );

// body.append(
//     headerNote,
//     htmlBody,
//     footNote
// );

const form = document.getElementById('element-form');

form.onsubmit = (e) => {
    e.preventDefault();
    const formData = new FormData(form);
    const data = Object.fromEntries(formData);
    console.log(data);



}
form.oninput = () => {
    const formData = new FormData(form);
    const data = Object.fromEntries(formData);
    console.log(data);

}

const sendData =async(data) => {

    const response = await fetch('/api/order', {
        method: 'POST',
        body: JSON.stringify(data),
        headers: {
            'Content-Type': 'application/json'
        },
    });
    const data = await response.json();
    console.log(data);
}