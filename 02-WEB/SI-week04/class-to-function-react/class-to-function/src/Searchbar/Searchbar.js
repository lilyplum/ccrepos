import React, { Component } from "react";
import styled from "styled-components";

class Searchbar extends Component {
  constructor(props) {
    super(props);
    this.state = {
      search: "",
    };
  }

  Input = styled.input`
    margin: 10px auto;
    background: linear-gradient(
      90deg,
      rgba(3, 4, 147, 1) 0%,
      rgba(9, 9, 121, 1) 35%,
      rgba(0, 212, 255, 1) 100%
    );
    color: yellow;
  `;

  componentDidUpdate(preProps, prevState) {
    if (prevState.search !== this.state.search)
      this.props.search({ search: this.state.search });
  }

  onChangeHandler = (event) => {
    this.setState({ search: event.target.value });
  };

  render() {
    return (
      <div>
        <this.Input onChange={this.onChangeHandler} autoFocus />
      </div>
    );
  }
}

export default Searchbar;
