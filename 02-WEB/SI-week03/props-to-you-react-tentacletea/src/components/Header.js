function Header(props) {
  const logo = props.logo;

  let content = 
    <div className="header">
      <div className="logo">
        <h1>{ logo }</h1>
      </div>
      <div className="navbar">
        <a href="/">Home</a>
        <a href="/">About</a>
        <a href="/">Contact</a>
      </div>
    </div>;

  return content;
}

export default Header;