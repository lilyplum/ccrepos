import React from 'react'
import "./Display.css"
import Button from 'react-bootstrap/Button';



export default function CharacterDisplay( { character, onClose } ) {

  return (
    <div className='modal'>
      <div className='modal-content'>

        <div className="pic">
          <img src={character.image} alt=""></img>
          <p>Gender: {character.gender}</p>
          <p>Name: {character.name}</p>
          <p>Species: {character.species}</p>
          <p>Status: {character.status}</p>
          <p>Location: {character.location.name}</p>
        </div>

        <div>
          <Button variant="secondary" type='button' onClick={() => onClose()}>Close</Button>
        </div>

      </div>
    </div>
  )
}
