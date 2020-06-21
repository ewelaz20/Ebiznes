import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import './css/search.css';


import Newsletter from "./components/Newsletter";
import Footer from "./components/Footer"
import Header from "./components/Header"
import CreateAccount from "./components/SignUp"

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