import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import './css/search.css';



import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";


import Newsletter from "./components/newsletter";
import Footer from "./components/footer"
import Header from "./components/header"
import Wishlist from "./components/wishlist"

function WishlistPage() {
  return (
    <div className="App">
      <Header></Header>
    <Wishlist/>

      <Newsletter></Newsletter>
      <Footer></Footer>

    </div>
  );
}

export default WishlistPage;