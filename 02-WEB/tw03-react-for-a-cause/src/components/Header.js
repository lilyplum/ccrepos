import "./Header.css"

function Header(props) {
  const logo = props.logo;

  return (
    <>
      <div className="headerbar">
        <div className="logo">
          <h1>{logo}</h1>
        </div>
        <div className="flex justify-center text-5xl font-normal">
          <a className="header-a" href=".logo">Home</a>
          <a className="header-a" href="#introduction">Inroduction</a>
          <a className="header-a" href="#about">About</a>
          <a className="header-a" href="#contact">Contact</a>
        </div>
      </div>
    </>
  )
}
export default Header;