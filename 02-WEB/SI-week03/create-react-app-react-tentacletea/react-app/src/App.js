import logo from './logo.svg';
import './App.css';



function App() {

  function handleClick() {
    alert("You Clicked me!");
  }
  
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Welcome to React
        </p>

        <button onClick={handleClick}> 
          Click Me!
        </button>
      </header>
    </div>
  );
}

export default App;
