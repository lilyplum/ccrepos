import "./ContactForm.css";


export default function ContactMessage(props) {

    if (!props.showMessage) {
        return null;
    };

    return (
        <div className="thanksPopUp component"> We appreciate you contacting us. One of our colleagues will get back in touch with you soon! Have a great day!</div>
    );
}
