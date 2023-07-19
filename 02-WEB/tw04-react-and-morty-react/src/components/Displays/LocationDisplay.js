import React from 'react'
import "./Display.css"
import Button from 'react-bootstrap/Button';



export default function LocationDisplay( { onClose, location } ) {
  
  return (
    <div className='modal'>
      <div className='modal-content'>

        <p>Name: {location.name}</p>
        <p>Dimension: {location.dimension}</p>
        <p>Type: {location.type}</p>
        <p>Residents: {location.residents.length}</p>

        <div>
          <Button variant="secondary" type='button' onClick={() => onClose()}>Close</Button>
        </div>

      </div>
    </div>
  )
}
