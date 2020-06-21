import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import './css/search.css';



import Newsletter from "./components/Newsletter";
import Footer from "./components/Footer"
import Header from "./components/Header"
import Wishlist from "./components/Wishlist"

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