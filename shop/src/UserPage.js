import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import './css/search.css';



import Newsletter from "./components/Newsletter";
import Footer from "./components/Footer"
import Header from "./components/Header"
import User from "./components/Account"

function UserPage() {
  return (
    <div className="App">
      <Header></Header>
      <User></User>

      <Newsletter></Newsletter>
      <Footer></Footer>

    </div>
  );
}

export default UserPage;