import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import './css/search.css';



import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";


import Footer from "./components/footer"
import Header from "./components/header"
import Checkout from "./components/checkout"

function CreateAccountPage() {
    return (
        <div className="App">
            <Header></Header>
            <Checkout />
            <Footer></Footer>

        </div>
    );
}

export default CreateAccountPage;