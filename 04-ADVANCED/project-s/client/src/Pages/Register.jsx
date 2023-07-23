import React, {useContext} from 'react';
import RegisterForm from "../components/RegisterForm/RegisterForm.jsx";
import {useNavigate} from "react-router-dom";
import {AuthContext} from "../components/AuthContext/AuthContextProvider.jsx";

const Register = () => {
    const navigate = new useNavigate();
    const {setIsLoggedIn} = useContext(AuthContext);

    const handleRegister = (registerData) => {
        return fetch("http://localhost:8080/api/v1/auth/register", {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(registerData)
        })
            .then(res => res.json())
            .then(login => {
                localStorage.setItem("jwt", login.token);
            }).then(() => {
                setIsLoggedIn(true);
                navigate("/")
            })
    }

    return (
        <RegisterForm
            onRegister={handleRegister}
            onCancel={() => navigate("/")}
        />
    )
}

export default Register;