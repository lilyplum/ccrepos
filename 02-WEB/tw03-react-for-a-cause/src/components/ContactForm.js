import React, { useState } from "react";
import "./ContactForm.css";


export default function Contact(props) {
    const initialFormData = {
        firstName: "",
        lastName: "",
        email: "",
        subject: "",
        message: ""
    };

    const [formData, udpateFormData] = useState(initialFormData);
    const [show, setForm] = useState(false);

    const handleChange = (e) => {
        udpateFormData({
            ...formData,
            [e.target.name]: e.target.value.trim()
        });
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        setForm(false);
        props.onSend();
        console.log("Form data", formData);
    };

    return (
        <div className="component">
            <div className="contact">
                {
                    show ?
                        <div className="contactForm">
                            <form className="formElem">
                                <label>Name: </label>
                                <input className="inputs" type='text' placeholder="Enter your name" name="firstName" onChange={handleChange}></input>
                                <br></br>
                                <label>Surname </label>
                                <input className="inputs" type='text' placeholder="Enter your age" id="inptage" name="lastName" onChange={handleChange}></input>
                                <br></br>
                                <label>E-mail: </label>
                                <input className="inputs" type='text' placeholder="Enter your Mail" id="inptmail" name="email" onChange={handleChange}></input>
                                <br></br>
                                <label>Subject: </label>
                                <input className="inputs" type='text' placeholder="Subject" id="inptmail" name="subject" onChange={handleChange}></input>
                                <br></br>
                                <label>message: </label>
                                <textarea rows="8" name="message" onChange={handleChange}></textarea>
                                <br></br>
                                <button className="btn" type="submit" onClick={handleSubmit}>Send</button>
                            </form>
                        </div> :
                        <button className="btn-bottom" type="button" onClick={() => setForm(true)}>Contact us</button>
                }
            </div>
        </div>
    );
}

