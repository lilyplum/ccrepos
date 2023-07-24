import React from 'react'
import { useLocations } from '../api/useData'
import Card from 'react-bootstrap/Card';



export default function Locations( {location, shownLocPage, setLocationDisplay, setLocation} ) {

  const showLocationDisplay = (location) => {
    setLocationDisplay(true);
    setLocation(location);
  }

  let newLocations = useLocations(shownLocPage)

  if (newLocations !== "Loading...") {

    const LocCards = newLocations.results.map( location => {

      return(
        <Card border="secondary" style={{ width: '18rem', height: '8rem' }} className="LocCard" key={location.id} onClick={() => showLocationDisplay(location)}>
            <p>Location name: {location.name}</p>
        </Card>
      )
    })
    return LocCards
  }
}
