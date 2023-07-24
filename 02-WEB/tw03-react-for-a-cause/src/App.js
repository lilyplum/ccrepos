import './App.css';
import Header from './components/Header';
import Introduction from './components/Introduction';
import About from './components/About';
import Contact from './components/Contact';
import ContactForm from './components/ContactForm';
import Slideshow from './components/Slideshow';
import CallToAction from './components/CallToAction';
import ContactMessage from './components/ContactMessage';
import { useState } from 'react';

function App() {
  const logoName = "S&C";

  const [show, setShow] = useState(false);
  const [showMessage, setMessage] = useState(false);

  const send = () => {
    setMessage(true);
    setTimeout(() => {
      setMessage(false);
    }, 10000)
  };

  return (
    <div className="text-center text-black bg-gradient-to-b from-amber-500 to-green-700">
      <Header logo={logoName} />
      <Slideshow />
      <Introduction />
      <button className="btn" type="button" onClick={() => setShow(true)} id="btndonate">Donate NOW !</button>
      <CallToAction onClose={() => setShow(false)} show={show} />
      <About />
      
      <ContactForm onSend={send} />
      <ContactMessage showMessage={showMessage} />
      <Contact />
      <br></br>
    </div>
  );
}
export default App;