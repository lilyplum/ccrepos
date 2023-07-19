// APIKEY: HFKcKQEfEZPe7gV6CC6mBgdZUxoOc2z4uzmlBXCa
const divContents = document.querySelector("#container");
const img = document.querySelectorAll("img");

const url = "https://api.nasa.gov/planetary/apod?api_key=HFKcKQEfEZPe7gV6CC6mBgdZUxoOc2z4uzmlBXCa"
// fetch(url) 
//     .then ((response) => {
//         return response.json();
//     })

//     .then ((data) => {
//         console.log(data.url);
//         img[0].src = data.url;
//     })

const loadData = async () => {
    try {
        const response = await fetch(url);
        console.log(response.ok)

        const data = await response.json();
        img[0].src = data.url;   
    } catch (err) {
        console.log(err);
    }
}

loadData();