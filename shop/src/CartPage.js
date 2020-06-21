import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import './css/search.css';
import './css/custom.css';



import Footer from "./components/Footer"
import Header from "./components/Header"
import Cart from "./components/Cart"

function CartPage() {
    return (
        <div className="App">
            <Header></Header>
            <Cart horizontal/>
            <Footer></Footer>

        </div>
    );
}

export default CartPage;