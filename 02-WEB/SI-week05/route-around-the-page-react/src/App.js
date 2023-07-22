import { Link, Route, Routes } from 'react-router-dom';
import Home from "./pages/Home"
import About from "./pages/About"
import Contact from "./pages/Contact"

import './App.css';

function App() {
  return (
    <div className='App'>
      <header>
        <nav>
          <Link to="/">Home</Link>
          <Link to="/about">About</Link>
          <Link to="/contact">Contact</Link>
        </nav>
      </header>
      
      <main>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/about" element={<About />} />
          <Route path="/contact" element={<Contact />} />
        </Routes>
      </main>

      <footer>
        <div>
          This is an example project
        </div>
      </footer>
    </div>
  );
}

export default App;
