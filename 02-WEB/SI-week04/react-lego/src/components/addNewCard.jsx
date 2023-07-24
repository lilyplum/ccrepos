import React, {useState} from "react";
import data from "../sampleData";


const AddNewCard = ( {setCard, addNewCardFollowers} ) => {
    const [name, setName] = useState("")
    const [followers, setFollowers] = useState("")
    const [difference, setDifference] = useState("")

    const newCardData = {
        "name" : name,
        "followers" : parseInt(followers),
        "difference" : parseInt(difference)
    }

    const addNewCard = () => {
        console.log(isNaN(followers))

        if(!name || isNaN(followers) || !followers || isNaN(difference) || !difference) {
            alert("invalid input")
        } else {
            addNewCardFollowers(parseInt(followers));
            data.users.push(newCardData);
            setCard(newCardData);
        }

        setName("");
        setFollowers("");
        setDifference("");
    }
    
    return (
        <div className="add-card">
            <input type='text' value={name} placeholder="name" onChange={e => setName(e.target.value)}></input>
            <input type='text' value={followers} placeholder="followers" onChange={e => setFollowers(e.target.value)}></input>
            <input type='text' value={difference} placeholder="difference" onChange={e => setDifference(e.target.value)}></input>
            <button onClick={addNewCard}>Create New Card</button>
        </div>
    )
}

export default AddNewCard
