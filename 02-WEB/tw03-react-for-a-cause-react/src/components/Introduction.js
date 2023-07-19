import "./Introduction.css"

export default function Introduction() {
  return (
    <div className="component" id="introduction">
      <div className="introduction" >
        <p className="text-8xl underline mb-10">Introduction</p>
        <p>
          ASPCA advocates rallied to improve farm animal welfare, submitting over 27,000
          comments to the USDA in support of a strong organic animal-welfare rule. The rule
          offers a much-needed chance to improve the lives of more than 186 million farm animals
          raised under the USDA Organic program each year.
        </p>
        <br></br>
        <div>
          <a href=".logo" className="btnintroduction mr-10">Go back home&#8593;</a>
          <a href="#about" className="btnintroduction">Go to about&#8595;</a>
        </div>
      </div>
    </div>
  );
}
