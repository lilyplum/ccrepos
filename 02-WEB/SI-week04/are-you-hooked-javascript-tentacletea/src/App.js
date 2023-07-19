import { useState } from "react";
import users from "./fake_data";

const App = () => {
    const [filteredEmployees, setFilteredEmployees] = useState("");


    const [salary, setNewSalary] = useState()
    const [password, setPassword] = useState()
    const [validPassword, setValidation] = useState()

    const handleInput = (e) => {
        setFilteredEmployees(e.target.value);
    }

    const filtered = !filteredEmployees 
    ? users 
    : users.filter((employee) => 
        employee.name.toLowerCase().includes(filteredEmployees.toLowerCase())
    )

    const handlePasswordInput = (e) => {
        setPassword(e.target.value);
    }

    const validatePasswordInput = (e) => {
        console.log(e.target.value);
    }
 
    const decrementSalary = () => {

    }

    const incrementSalary = () => {

    }



    return (
        <>
            <header>
                <div className="container">
                    <h1 className="logo">Are you Hooked?</h1>
                </div>
            </header>

            <section>
                <div className="container">
                    <p className="error">Passwords do not match</p>
                    <p className="error">Password needs to be more complex</p>
                    <input
                        type="password"
                        placeholder="Enter your password"
                        onChange={handlePasswordInput}
                    />
                    <input
                        type="password"
                        placeholder="Verify your password"
                        onSubmit={validatePasswordInput}
                    />
                </div>
            </section>

            <section>
                <div className="container">
                    <table>
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>
                                    <input
                                        type="text"
                                        placeholder="Name..."
                                        onChange={handleInput}
                                    />
                                </th>
                                <th>Age</th>
                                <th>Salary</th>
                            </tr>
                        </thead>
                        <tbody>
                            {filtered.map(
                                (employee) => (
                                    <tr key={employee.id}  >
                                        <th>{employee.id}</th>
                                        <td>{employee.name}</td>
                                        <td>{employee.age}</td>
                                        <td>**
                                            <button onClick={decrementSalary}>
                                                -
                                            </button>
                                            <span>{employee.salary}</span>
                                            <button onClick={incrementSalary}>
                                                +
                                            </button>
                                        </td>
                                    </tr>
                                )
                            )}
                        </tbody>
                    </table>
                </div>
            </section>

            <footer>
                <div className="container">
                    <p>
                        API provided by{" "}
                        <a href="http://www.dummy.restapiexample.com/">
                            Dummy sample REST API
                        </a>
                    </p>
                </div>
            </footer>
        </>
    );
};

export default App;
