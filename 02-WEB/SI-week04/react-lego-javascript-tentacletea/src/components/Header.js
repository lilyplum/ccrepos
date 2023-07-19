import React from 'react'

export default function Header( {users} ) {

    return (
        <div className="header">
            Social Media Dashboard
            <div className="sub-header">
                Total followers: {users}
            </div>
        </div>
    )
}
