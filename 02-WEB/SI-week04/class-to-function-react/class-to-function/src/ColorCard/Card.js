import React, { Component } from "react";
import styled, { ThemeProvider } from "styled-components";

class Card extends Component {
  Div = styled.div`
    width: 100%;
    height: 150px;
    border: 1px solid black;
    box-shadow: 2px 2px 5px #000000;
    background-color: ${(props) => props.theme.backgroundColor};
    color: ${(props) =>
      props.theme.backgroundColor === "#000000" ? "white" : "black"};
  `;

  componentWillMount() {
    this.Div.defaultProps = {
      theme: { color: 0xffffff, backgroundColor: "#fff" },
    };
  }

  render() {
    const theme = {
      backgroundColor: this.props.color.hex,
    };
    return (
      <ThemeProvider theme={theme}>
        <this.Div>
          <h1>{this.props.color.name}</h1>
        </this.Div>
      </ThemeProvider>
    );
  }
}

export default Card;
