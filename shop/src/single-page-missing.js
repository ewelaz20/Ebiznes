import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import './css/search.css';



import { BrowserRouter as Router, Switch, Route, Link } from "react-router-dom";


import Newsletter from "./components/newsletter";
import Footer from "./components/footer"
import {useParams} from "react-router-dom"
import Login from "./components/login"
import Header from "./components/header"
import CreateAccount from "./components/create-account"
import ProductPage from "./components/product-detail-missing"
import Notify from "./components/notify"

function SinglePage() {
    let  {id} = useParams();
    return (

    <div className="App">
      <Header></Header>
   
    <ProductPage id={id}/>

      <Newsletter></Newsletter>
      <Footer></Footer>

    </div>
  );
}

export default SinglePage;