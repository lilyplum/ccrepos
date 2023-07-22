import React, { useState, useEffect } from "react";
import "./App.css";
import Jokes from "./components/Jokes";
import { routes } from "./data/apiRoutes";
import useFetch from "./useFetch";

function App() {
  const [categories] = useFetch(routes.categories);
  const [url, setUrl] = useState(routes.randomJokes);

  const dropDownChangeHandler = ({ target }) => {
    setUrl(routes.categoryJokes(target.value));
  };

  function randomNumberInRange(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
  }

  const buttonClickHandler = () => {
    setUrl(`${routes.randomJokes}"?random="${randomNumberInRange(1,100)}`);
  };

  useEffect(() => {
    url === "" && setUrl(routes.randomJokes);
  }, [url]);

  return (
    <div className="App">
      <div className="jokes-input">
        <button onClick={buttonClickHandler}>Random Jokes</button>
        Category:
        <select onChange={dropDownChangeHandler}>
          {categories.value
            ? categories.value.map((category, index) => (
                <option key={index}>{category}</option>
              ))
            : "Loading..."}
        </select>
      </div>
      <Jokes url={url} />
    </div>
  );
}

export default App;
