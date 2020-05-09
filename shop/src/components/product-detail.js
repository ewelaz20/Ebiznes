import React, { Component } from "react";
import '../css/bootstrap.min.css';
import '../css/style.css';
import '../css/responsive.css';
import '../css/custom.css';
import '../css/newsletter.css';

import Newsletter from "./newsletter";
import Footer from "./footer"
import Header from "./header"



import img1 from '../images/marynarki/marynarka1.jpg';
import img2 from '../images/marynarki/marynarka2.jpg';
import img3 from '../images/spodnie/spodnie1.jpg';

export default class DetailPage extends Component {
    render() {
        return (


            <div class="shop-detail-box-main">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-5 col-lg-5 col-md-6">
                            <div id="carousel-example-1" class="single-product-slider carousel slide" >
                                <div class="carousel-inner" role="listbox">
                                    <div class="carousel-item active"> <img class="d-block w-100" src={img1} alt="First slide" /> </div>

                                </div>


                            </div>
                        </div>




                        <div class="col-xl-7 col-lg-7 col-md-6">
                            <div class="single-product-details ">
                                <h2>Nazwa produktu - z bazy </h2>
                                <h5> Cena - XXX zł </h5>
                                <h4>Short description</h4>
                                <p>Nam sagittis a augue eget scelerisque. Nullam lacinia consectetur sagittis. Nam sed neque id eros fermentum dignissim quis at tortor. Nullam ultricies urna quis sem sagittis pharetra. Nam erat turpis, cursus in ipsum at,
                    tempor imperdiet metus. In interdum id nulla tristique accumsan. Ut semper in quam nec pretium. Donec egestas finibus suscipit. Curabitur tincidunt convallis arcu. </p>



                                <div class="price-box-bar">
                                    <div >
                                        <label class="control-label">Quantity</label>
                                        <input type="number" class="form-control" />
                                    </div>
                                    <hr />

                                    <div class="cart-and-bay-btn">

                                        <a class="btn hvr-hover" href="#">Buy New</a>
                                        <br/><br/>
                                        
                                        <a class="btn hvr-hover" href="#"><i class="fas fa-heart"></i> Add to wishlist</a>
                                    </div>
                                </div>


                            </div>
                        </div>
                    </div>




                </div>
            </div>


        );
    }
}

