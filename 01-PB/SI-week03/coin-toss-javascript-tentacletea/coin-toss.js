const message = document.getElementById('message');
console.log(message);
const heads = document.getElementById('heads');
console.log(heads);
const tails = document.getElementById('tails');
console.log(tails);

const randomNumber = Math.floor(Math.random() * 2);

if (randomNumber === 0) {
    tails.classList.remove('hide')
    message.innerText = 'You have selected tails !';
} else {
    heads.classList.remove('hide')
    message.innerText = 'You have selected heads !';
}