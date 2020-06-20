import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import './css/search.css';


import Newsletter from "./components/newsletter";
import Footer from "./components/Footer"
import {useParams} from "react-router-dom"
import Header from "./components/Header"
import ProductPage from "./components/DetailPage"

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