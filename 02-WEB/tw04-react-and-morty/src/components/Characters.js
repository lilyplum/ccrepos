import React from 'react'
import Card from 'react-bootstrap/Card';

import { useCharacters } from '../api/useData'

export default function Characters( {characters, shownPage, setCharacter, setCharacterDisplay} ) {
  let newCharacters = useCharacters(shownPage);
  
  const showCharDisplay = (character) => {
    setCharacterDisplay(true);
    setCharacter(character);
  } 

    if (newCharacters !== "Loading...") {
    const CharCards = newCharacters.results.map( character => {
      return(
      <Card border="secondary" style={{ width: '16rem' }} className="CharCard" key={character.id} onClick={() => showCharDisplay(character)}>
          <Card.Img src={character.image} alt=""></Card.Img>
          <Card.Body>
            <p>Name: {character.name}</p>
            <p>Species: {character.species}</p>
          </Card.Body>
      </Card >
      )}
    )
    return CharCards
}}

