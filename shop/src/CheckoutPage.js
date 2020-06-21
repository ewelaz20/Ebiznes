import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import './css/search.css';


import Footer from "./components/Footer"
import Header from "./components/Header"
import Checkout from "./components/Checkout"

function CheckoutPage() {
    return (
        <div className="App">
            <Header></Header>
            <Checkout />
            <Footer></Footer>

        </div>
    );
}

export default CheckoutPage;