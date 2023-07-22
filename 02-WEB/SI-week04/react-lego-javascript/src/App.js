import React, { useState } from 'react';
import './App.css';
import data from "./sampleData";
import AddNewCard from "./components/addNewCard";
import Header from './components/Header';
import Card from './components/Card';

function App() {
    // console.log(data)

    const [totalFollowers, setTotalFollowers] = useState(data.users.reduce(
        (accumulator, currentValue) => accumulator + currentValue.followers, 0
    ));

    const setNewTotalFollowers = (count) => {
        count > 0 
        ? setTotalFollowers(totalFollowers + 1)
        : setTotalFollowers(totalFollowers - 1)
    }

    const addNewCardFollowers = (followers) => {
        followers > 0 
        ? setTotalFollowers(totalFollowers + followers)
        : setTotalFollowers(totalFollowers - followers)
    }


    const [addCard, setCard] = useState();

    return (
        <div className="root">
            <Header users={totalFollowers}/>
            {
                data.users.map(
                    (card) => {
                        return(
                            <Card 
                            key={card.name} 
                            user={card}
                            setNewTotalFollowers={setNewTotalFollowers}
                            />
                        )
                    }
                )
            }
            <AddNewCard setCard={setCard} addNewCardFollowers={addNewCardFollowers} />
        </div>
    )
}

export default App;
