import React, {Component} from "react";

import '../css/bootstrap.min.css';
import '../css/style.css';
import '../css/responsive.css';
import '../css/custom.css';

import {BrowserRouter as Router, Switch, Route, Link} from "react-router-dom";


import Login from "./login";


export default class Header extends Component {

    render() {
        return (
            <div>
                <header className="main-header">
                    <nav className="navbar navbar-expand-lg navbar-light bg-light navbar-default bootsnav">
                        <div className="container">
                            <div className="navbar-header">
                                <button className="navbar-toggler" type="button" data-toggle="collapse"
                                        data-target="#navbar-menu" aria-controls="navbars-rs-food" aria-expanded="false"
                                        aria-label="Toggle navigation">
                                    <i className="fa fa-bars"></i>
                                </button>
                                <a className="navbar-brand" href="/main">EZ SHOP</a>
                            </div>

                            <div className="collapse navbar-collapse" id="navbar-menu">
                                <ul className="nav navbar-nav ml-auto" data-in="fadeInDown" data-out="fadeOutUp">
                                    <li className="nav-item"><a className="nav-link" href="/categories/blazers">Blazers</a></li>
                                    <li className="nav-item"><a className="nav-link" href="/categories/dresses">Dresses</a></li>
                                    <li className="nav-item"><a className="nav-link" href="/categories/trousers">Trousers</a></li>
                                    <li className="nav-item"><a className="nav-link" href="/categories/skirts">Skirts</a></li>
                                    <li className="nav-item"><a className="nav-link" href="/categories/coats">Coats</a></li>
                                    <li className="nav-item"><a className="nav-link" href="/categories/blouses">Blouses & Skirts</a></li>
                                    <li className="nav-item"><a className="nav-link" href="/categories/accessories">Accessories</a></li>
                                    <li className="nav-item"><a className="nav-link" href="/categories/shoes">Shoes</a></li>
                                </ul>
                            </div>

                            <div className="attr-nav">
                                <ul>
                                    <li className="search"><a href="#"><i className="fa fa-search "></i></a>

                                        <div class="top-search">
                                            <div class="container">
                                                <div class="input-group">
                                                    <span class="input-group-addon"><i class="fa fa-search"></i></span>
                                                    <input type="text" class="form-control" placeholder="Search"/>
                                                    <span class="input-group-addon close-search"><i
                                                        class="fa fa-times"></i></span>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                    <li className="search"><a href="#"><i className="fa fa-user-circle "></i></a>
                                    </li>
                                    <li className="fav"><a href="/wishlist"><i className="fa fa-heart"></i></a></li>
                                    <li className="side-menu">
                                        <a href="#">
                                            <i className="fa fa-shopping-bag"></i>
                                            <span className="badge">X</span>
                                        </a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </nav>
                </header>


            </div>


        );
    }
}