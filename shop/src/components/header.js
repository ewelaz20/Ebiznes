import React, {Component} from "react";

import '../css/bootstrap.min.css';
import '../css/style.css';

import '../css/responsive.css';
import '../css/custom.css';


import Notify from "./SearchModal";
import {UserContext} from "./User-context";
import {withRouter} from "react-router-dom";

class Header extends Component {


    static contextType = UserContext;

    constructor(props) {
        super(props);

        this.state = {
            modal: false,
            searchExpanded: false
        };
        this.getNumberInCart = this.getNumberInCart.bind(this)
        this.switchState = this.switchState.bind(this);
        this.userHandle = this.userHandle.bind(this);
        this.isLogged = this.isLogged.bind(this);
        this.userLogged = this.userLogged.bind(this);
        this.logoutButton = this.logoutButton.bind(this);
    }


    getNumberInCart() {
        return this.context.cart.length > 0 ? this.context.cart.length : ''
    }

    switchState() {
        this.setState({searchExpanded: !this.state.searchExpanded})
    }


    modalOpen(e) {
        this.setState({modal: true});
        e.preventDefault();
    }

    modalClose() {
        this.setState({
            modalInputName: "",
            modal: false
        });
    }


    userHandle() {
        if (this.context.user !== null) {
            this.context.logout()
        } else {
            console.log("in else");
            this.props.history.push("/main");
        }
    }

    isLogged() {
        return this.context.user !== null
    }

    userLogged() {
        if (this.isLogged()) {
            return (
                <li className="search"><a href="/user"><i className="fa fa-user-circle "></i></a></li>
            )
        }
        else {
            return (
                <li className="search"><a href="/login"><i className="fa fa-user-circle "></i></a></li>
            )
        }
    }

    logoutButton() {

        if (this.isLogged()) {
            return (
                <li className="search"><a href="" onClick={() => this.userHandle()}><i className="fa fa-power-off "></i></a>
                </li>

            )
        }


    }


    render() {
        return (
            <div>
                <header className="main-header">
                    <nav className="navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav">
                        <div className="container">
                            <div className="navbar-header">
                                <a className="navbar-brand" href="/main">EZ SHOP</a>
                            </div>

                            <div className="collapse navbar-collapse" id="navbar-menu">
                                <ul className="nav navbar-nav ml-auto" data-in="fadeInDown" data-out="fadeOutUp">
                                    <li className="nav-item"><a className="nav-link"
                                                                href="/categories/blazers">Blazers</a></li>
                                    <li className="nav-item"><a className="nav-link"
                                                                href="/categories/dresses">Dresses</a></li>
                                    <li className="nav-item"><a className="nav-link"
                                                                href="/categories/trousers">Trousers</a></li>
                                    <li className="nav-item"><a className="nav-link"
                                                                href="/categories/skirts">Skirts</a></li>
                                    <li className="nav-item"><a className="nav-link" href="/categories/coats">Coats</a>
                                    </li>
                                    <li className="nav-item"><a className="nav-link" href="/categories/blouses">Blouses
                                        & Skirts</a></li>
                                    <li className="nav-item"><a className="nav-link"
                                                                href="/categories/accessories">Accessories</a></li>
                                    <li className="nav-item"><a className="nav-link" href="/categories/shoes">Shoes</a>
                                    </li>
                                </ul>
                            </div>

                            <div className="attr-nav">

                                <ul>

                                    <li class="search">
                                        <a href=""><i onClick={e => this.modalOpen(e)} class="fa fa-search"
                                                      aria-hidden="true"></i></a>
                                    </li>
                                    <Notify show={this.state.modal} handleClose={e => this.modalClose(e)}>
                                    </Notify>

                                    {this.userLogged()}

                                    <li className="fav"><a href="/wishlist"><i className="fa fa-heart"></i></a></li>
                                    <li className="side-menu">
                                        <a href="/cart">
                                            <i className="fa fa-shopping-bag"></i>
                                            <span className="badge">{this.getNumberInCart()}</span> </a>
                                    </li>
                                    {this.logoutButton()}

                                </ul>
                            </div>
                        </div>
                    </nav>
                </header>


            </div>


        );
    }
}

export default withRouter(Header);