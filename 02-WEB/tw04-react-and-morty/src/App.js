import React from "react";
import "./App.css";
import 'bootstrap/dist/css/bootstrap.min.css';
import { useCharacters, useLocations } from "./api/useData";
import { useState } from "react";

import Description from "./components/Description";
import Characters from "./components/Characters";
import Location from "./components/Locations";
import Pagebar from "./components/Pagebar/Pagebar";
import CharacterDisplay from "./components/Displays/CharacterDisplay";
import LocationDisplay from "./components/Displays/LocationDisplay";

import Button from 'react-bootstrap/Button';


function App() {

  const [shownPage, setShownPage] = useState(1)
  const [shownLocPage, setShownLocPage] = useState(1)

  const characters = useCharacters(shownPage)
  const locations = useLocations(shownLocPage);

  const [shownSection, setShownSection] = useState(<Description />)
  const [pagebarIsVisible, setPagebarIsVisible] = useState(false)

  const [characterDisplay, setCharacterDisplay] = useState(false);
  const [character, setCharacter] = useState();
  const [locationDisplay, setLocationDisplay] = useState(false);
  const [location, setLocation] = useState();

  // console.log("Locations data: ");
  // console.log(locations);

  const showLocationsElem = () => {
    setShownLocPage(1);
    
    setShownSection(
      <Location
        locations={locations}
        setLocationDisplay={setLocationDisplay}
        setLocation={setLocation}
        shownLocPage={1}
      />
    );
    setPagebarIsVisible(true);
  }

  const showCharsElem = () => {
    setShownPage(1);

    setShownSection(
      <Characters
        characters={characters}
        shownPage={1}
        setCharacterDisplay={setCharacterDisplay}
        setCharacter={setCharacter}
      />
    );
    setPagebarIsVisible(true);
  }

  return (
    <>
      <div className="app">
        <div className="header">
          <img src="./tt.png" className="headerimg" alt="react-morty-logo"></img>
        </div>

        <div className="main-buttons">
          <Button variant="light" size="lg" onClick={showCharsElem}>
            Characters
          </Button>

          <Button variant="light" size="lg" onClick={showLocationsElem}>
            Locations
          </Button>
        </div>

        <div className="content">
          {shownSection}
          {
            characterDisplay === true
              ? <CharacterDisplay
                onClose={() => setCharacterDisplay(false)}
                characterDisplay={characterDisplay}
                character={character}
              />
              : ""
          }
          {
            locationDisplay === true
              ? <LocationDisplay
                onClose={() => setLocationDisplay(false)}
                locationDisplay={locationDisplay}
                location={location}
              />
              : ""
          }
        </div>
        <div className="pagebar-container">
          {
            pagebarIsVisible === true ?
              <Pagebar
                shownPage={shownPage}
                setShownPage={setShownPage}
                shownLocPage={shownLocPage}
                setShownLocPage={setShownLocPage}
                shownSection={shownSection}
                setShownSection={setShownSection}
                characters={characters}
                locations={locations}
                setCharacterDisplay={setCharacterDisplay}
                setCharacter={setCharacter}
                setLocationDisplay={setLocationDisplay}
                setLocation={setLocation} />
              : ""
          }


        </div>
      </div>
    </>
  )
}

export default App;
