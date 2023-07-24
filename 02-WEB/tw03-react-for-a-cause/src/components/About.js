import "./About.css"

export default function About() {
    return (
        <div className="component">
            <div className="about" id="about">
                <p className="text-8xl underline mb-10"> More about us</p>
                <p>
                    Celebrate The Life of a Beloved
                    Honor a person or pet's memory by creating
                    ASPCA advocates rallied to improve farm animal welfare, submitting over 27,000
                    comments to the USDA in support of a strong organic animal-welfare rule. The rule
                    offers a much-needed chance to improve the lives of more than 186 million farm animals
                    raised under the USDA Organic program each year.
                    a memorial campaign to share with your friends and family.
                </p>
                <br></br>
                <div>
                    <a href=".logo" id="section" className="mr-10">Go back home&#8593;</a>
                    <a href="#contact" id="section">Go to contact&#8595;</a>
                </div>
            </div>
        </div>
    );
}
