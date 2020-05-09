import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import './css/search.css';
import './css/custom.css';



import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";


import Footer from "./components/footer"
import Header from "./components/header"
import Cart from "./components/cart"

function CartPage() {
    return (
        <div className="App">
            <Header></Header>
            <div class="flexbox-container">
            <Cart horizontal/>
            </div>
            <Footer></Footer>

        </div>
    );
}

export default CartPage;