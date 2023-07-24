import React, { useState } from "react"
import "./CallToAction.css"

export default function CallToAction(props) {
    const [state, toState] = useState(false);

    if (!props.show) {
        return null;
    };

    const close = () => {
        props.onClose();
        toState(false);
    };

    return (
        <div className="modal">
            <div className="modal-content">
                <div className="modal-header">
                    <p className="modal-title">Donate for a cause</p>
                    <span className="close" onClick={close} >&times;</span>
                </div>
                <br></br>
                {
                    state ?
                        <div className="text-5xl">
                            <h1>Thank for contributing to the animal welfare</h1>
                        </div>
                        :
                        <div className="modal-body">
                            <label>Enter you name: </label>
                            <input type="text" placeholder="name"></input>
                            <br></br>
                            <label>Enter you E-mail: </label>
                            <input type="text" placeholder="e-mail"></input>
                            <br></br>
                            <label>Enter your amount of donate: </label>
                            <input type="text" placeholder="$" className="lastinput"></input>
                            <br></br>
                            <button onClick={() => toState(true)} className="btn">Donate</button>
                        </div>
                }

                <div className="modal-footer">

                </div>
            </div>
        </div>
    );
}
