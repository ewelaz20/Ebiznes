import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import './css/search.css';



import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";


import Newsletter from "./components/newsletter";
import Footer from "./components/footer"
import Header from "./components/header"
import CreateAccount from "./components/create-account"

function CreateAccountPage() {
    return (
        <div className="App">
            <Header></Header>
            <CreateAccount />

            <Newsletter></Newsletter>
            <Footer></Footer>

        </div>
    );
}

export default CreateAccountPage;