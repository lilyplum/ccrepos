import React, { useState } from 'react'
import data from "../sampleData";

export default function Card( {user, setNewTotalFollowers} ) {
    const treshold = 9999;

    const [currentFollowers, setNewFollowers] = useState(user.followers)

    const decrementFollowers = () => {
        setNewFollowers(currentFollowers - 1);
        setNewTotalFollowers(-1)
    }

    const incrementFollowers = () => {
        setNewFollowers(currentFollowers + 1);
        setNewTotalFollowers(+1)
    }

    return (
        <section className="platform">
            <div className="icon" >
                <img src={data.icon} alt=""></img>
                <p>{user.name}</p>
            </div>
            <div className="followers">
                <button className="update-followers-button" onClick={decrementFollowers}>-</button>
                    {
                        currentFollowers > treshold 
                        ? currentFollowers.toString().slice(0, -3) + "k" 
                        : currentFollowers
                    }
                <button className="update-followers-button" onClick={incrementFollowers}>+</button>
            </div>
                {
                    user.difference < 0
                    ? <div className="subscribers red"> F O L O W E R S </div>
                    : <div className="subscribers green"> F O L O W E R S </div>
                }
            <div> 
                {
                    user.difference < 0 
                    ? <span className='trend-descend'>▼ {user.difference.toString().slice(1)}</span> 
                    : <span className='trend-ascend'>▲ {user.difference}</span>
                }
            </div>
        </section>
    )
}
