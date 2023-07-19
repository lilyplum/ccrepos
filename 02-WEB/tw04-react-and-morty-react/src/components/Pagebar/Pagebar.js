import React from 'react'
import Characters from '../Characters'
import Locations from "../Locations"
import "./Pagebar.css"

import Button from 'react-bootstrap/Button';


export default function Pagebar({ shownPage, shownLocPage, setShownLocPage, setShownPage, shownSection, setShownSection, characters, locations, setCharacter, setCharacterDisplay, setLocation, setLocationDisplay }) {


  function handleLastLoc() {
    if (shownLocPage > 1) {
      setShownLocPage(shownLocPage - 1)

      setShownSection(
        <Locations
          locations={locations}
          shownLocPage={shownLocPage - 1}
          setLocationDisplay={setLocationDisplay}
          setLocation={setLocation} />
      )
    }
  }


  function handleLastChar() {
    if (shownPage > 1) {
      setShownPage(shownPage - 1)

      setShownSection(
        <Characters
          characters={characters}
          shownPage={shownPage - 1}
          setCharacter={setCharacter}
          setCharacterDisplay={setCharacterDisplay} />
      )
    }
  }


  function handleNextLoc() {
    if (shownLocPage < locations.info.pages) {
      setShownLocPage(shownLocPage + 1)
      setShownSection(
        <Locations
          locations={locations}
          shownLocPage={shownLocPage + 1}
          setLocationDisplay={setLocationDisplay}
          setLocation={setLocation} />
      )
    }
  }

  function handleNextChar() {
    if (shownPage < characters.info.pages) {
      setShownPage(shownPage + 1)
      console.log(shownSection.props);
      setShownSection(
        <Characters
          characters={characters}
          shownPage={shownPage + 1}
          setCharacter={setCharacter}
          setCharacterDisplay={setCharacterDisplay} />
      )
    }
  }


  function handleSpecificLoc(e) {
    setShownLocPage(parseInt(e.target.innerHTML))

    setShownSection(
      <Locations
        locations={locations}
        shownPage={parseInt(e.target.innerHTML)}
        setLocationDisplay={setLocationDisplay}
        setLocation={setLocation} />
    )
  }

  function handleSpecificChar(e) {
    setShownPage(parseInt(e.target.innerHTML))

    setShownSection(
      <Characters
        characters={characters}
        shownPage={parseInt(e.target.innerHTML)}
        setCharacter={setCharacter}
        setCharacterDisplay={setCharacterDisplay} />
    )
  }

  const isSectionCharProp = shownSection.props.characters !== undefined

  const isSectionsLocProp = shownSection.props.locations !== undefined


  return (
    <div className='pagebar'>
      <Button variant="light" onClick={ isSectionCharProp ? handleLastChar : handleLastLoc}
      >{"<-Last Page"}
      </Button>


      <Button  variant="light" className={  isSectionCharProp && shownPage < 3 
                                          ? "hidden" 
                                          : isSectionsLocProp && shownLocPage < 3 ? "hidden"
                                          : ""}
                               onClick={e =>  isSectionCharProp ? handleSpecificChar(e) : handleSpecificLoc(e)}
      
      >{  isSectionCharProp && shownPage >= 3 ? shownPage - 2 
        : isSectionsLocProp && shownLocPage >= 3 ? shownLocPage -2 
        : ""}
      </Button>


      <Button variant="light" className={ isSectionCharProp && shownPage < 2 ? "hidden" 
                                          : isSectionsLocProp && shownLocPage < 2 ? "hidden"
                                          : ""}
                              onClick={e =>   isSectionCharProp ? handleSpecificChar(e) : handleSpecificLoc(e)}
      
      >{  isSectionCharProp && shownPage >= 2 ? shownPage - 1 
        : isSectionsLocProp && shownLocPage >= 2 ? shownLocPage -1
        : ""}
      </Button>

      <Button variant="light" className="currentPage"
                              onClick={e =>   isSectionCharProp ? handleSpecificChar(e) : handleSpecificLoc(e)}
      >{  isSectionCharProp ? shownPage : shownLocPage }
      </Button>


      <Button variant="light" className={ isSectionCharProp && shownPage + 1 > characters.info.pages ? "hidden"
                                         : isSectionsLocProp && shownLocPage + 1 > locations.info.pages ? "hidden"
                                         : ""}
                              onClick={e =>   isSectionCharProp ? handleSpecificChar(e) : handleSpecificLoc(e)}

      >{  isSectionCharProp && shownPage + 1 <= characters.info.pages ? shownPage + 1 
        : isSectionsLocProp && shownLocPage + 1 <= locations.info.pages ? shownLocPage + 1 
        : ""}
      </Button>


      <Button variant="light" className={ isSectionCharProp && shownPage + 2 > characters.info.pages ? "hidden" 
                                        : isSectionsLocProp && shownLocPage + 2 > locations.info.pages ? "hidden" 
                                        : ""}
        onClick={e =>   isSectionCharProp ? handleSpecificChar(e) : handleSpecificLoc(e)}

      >{  isSectionCharProp && shownPage + 2 <= characters.info.pages ? shownPage + 2
        : isSectionsLocProp && shownLocPage + 2 <= locations.info.pages ? shownLocPage + 2
        : ""}
      </Button>

      <Button  variant="light" onClick={  isSectionCharProp ? handleNextChar : handleNextLoc}
      >{"Next Page->"}
      </Button>
    </div>
  )
}
