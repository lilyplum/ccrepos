//task 1
const myFavBook = {
    title: 'Eragon',
    author: 'Christopher Paolini',
    year: 2002,
    description: 'Fantasy book',
};

//task 2
const myFavMovie = {
    title: 'Top Gun: Maverick',
    director: 'Joseph Kosinski',
    year: 2022,
    description: 'Action movie',
    actors: [
        {
            actorName: 'Tom Cruise',
            roleName: 'Maverick', 
        },

        {
            actorName: 'Monica Barbaro',
            roleName: 'Phoenix', 
        },

        {
            actorName: 'Miles Teller',
            roleName: 'Rooster', 
        },

        {
            actorName: 'Glen Powell',
            roleName: 'Hangman', 
        },
        {
            actorName: 'Lewis Pullman',
            roleName: 'Bob', 
        }
    ],  
};

//task 3
const myFavSeries = {
    title: 'Altered Carbon',
    directors: ['John G. Lenic'],
    seasons: [
        {
            episodes: 10,
            starYear: 2018,
            endYear: 2018,
        },

        {
            episodes: 8,
            starYear: 2020,
            endYear: 2020,
        }
    ],
    description: 'Cyberpunk',
    actors: [
        {
            actorName: 'Will Yun Lee',
            roleName: 'Takeshi Kovacs', 
        },

        {
            actorName: 'Martha Higareda',
            roleName: 'Kristin Ortega', 
        },

        {
            actorName: 'Dichen Lachman',
            roleName: 'Reileen Kawahara', 
        },

        {
            actorName: 'James Purefoy',
            roleName: 'Laurens Bancroft', 
        },
        {
            actorName: 'Kristin Lehman',
            roleName: 'Miriam Bancroft', 
        }
    ],
};

//task 4
const myFavs = {
    book: myFavBook,
    movie: myFavMovie,
    series: myFavSeries,
};

//task 5
console.log(myFavBook.author);
console.log(myFavMovie.actors[0].roleName);
console.log(myFavSeries.seasons[1].endYear);

//task 6
for (let i = 0; i < myFavs.series.seasons[myFavs.series.seasons.length - 1].episodes; i++) {
    console.log(i + 1);
};

//task 7
for (let i = 0; i < myFavSeries.directors.length; i++)
{
    if (myFavSeries.directors[i]){
        console.log(myFavSeries.directors[i]);
    }
};