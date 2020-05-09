import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import './css/search.css';


import {BrowserRouter as Router, Switch, Route, Link} from "react-router-dom";


import Newsletter from "./components/newsletter";
import Footer from "./components/footer"
import Login from "./components/login"
import Header from "./components/header"
import CreateAccount from "./components/create-account"
import Wishlist from "./components/wishlist"

class LoginPage extends React.Component {
    constructor(props) {
        super(props);
    }
    render() {
        return (
            <div className="App">
                <Header></Header>
                <Login />

                <Newsletter></Newsletter>
                <Footer></Footer>

            </div>
        )
    }
}

export default LoginPage;