import "./Slideshow.css"
import { useState } from "react"

export default function Slideshow(props) {
    const images = [
        "/images/cat2.jpeg",
        "/images/newDog.jpg",
        "/images/Hase.jpeg",
        "/images/tier5.jpg"
    ];

    const [currentImageIndex, setCurrentImageIndex] = useState(0);

    setTimeout(() => {
        setCurrentImageIndex((currentImageIndex + 1) % 4);
    }, 3000);

  return (
        <img className="slideshow" src={images[currentImageIndex]} alt={images[currentImageIndex]} />
    );
}
