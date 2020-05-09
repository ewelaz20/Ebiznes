import React, { Component } from "react";
import '../css/newsletter.css';
import '../css/custom.css';

import Newsletter from "./newsletter";
import Footer from "./footer"
import Header from "./header"


import img1 from '../images/marynarki/marynarka1.jpg';
import img2 from '../images/marynarki/marynarka2.jpg';
import img3 from '../images/spodnie/spodnie1.jpg';
import img4 from '../images/sukienki/sukienka2.jpg';

export default class ProductList extends Component {
    render() {
        return (
<div class="products-box">
        <div class="container">
          
          <div class="row special-list">
            <div class="col-lg-3 col-md-6 special-grid best-seller">
              <div class="products-single fix">
                <div class="box-img-hover">
                  <div class="type-lb">
                    <p class="new">NEW</p>
                  </div>
                  <img src={img1} class="img-fluid" alt="Image1" />
                  <div class="mask-icon">
                    <ul>
                      <li><a href="#" data-toggle="tooltip" data-placement="right" title="View"><i class="fas fa-eye"></i></a></li>

                      <li><a href="#" data-toggle="tooltip" data-placement="right" title="Add to Wishlist"><i class="far fa-heart"></i></a></li>
                    </ul>
                    <a class="cart" href="#">Add to Cart</a>
                  </div>
                </div>
                <div class="why-text">
                  <h4>Luźna niebieska marynarka</h4>
                  <h5> 239.90 zł</h5>
                </div>
              </div>
            </div>

            <div class="col-lg-3 col-md-6 special-grid top-featured">
              <div class="products-single fix">
                <div class="box-img-hover">
                  <div class="type-lb">
                    <p class="new">New</p>
                  </div>
                  <img src={img2} class="img-fluid" alt="Image2" />
                  <div class="mask-icon">
                    <ul>
                      <li><a href="#" data-toggle="tooltip" data-placement="right" title="View"><i class="fas fa-eye"></i></a></li>

                      <li><a href="#" data-toggle="tooltip" data-placement="right" title="Add to Wishlist"><i class="far fa-heart"></i></a></li>
                    </ul>
                    <a class="cart" href="#">Add to Cart</a>
                  </div>
                </div>
                <div class="why-text">
                  <h4>Marynarka w kratke</h4>
                  <h5> 199.90 zł</h5>
                </div>
              </div>
            </div>

            <div class="col-lg-3 col-md-6 special-grid top-featured">
              <div class="products-single fix">
                <div class="box-img-hover">
                  <div class="type-lb">
                    <p class="new">New</p>
                  </div>
                  <img src={img3} class="img-fluid" alt="Image" />
                  <div class="mask-icon">
                    <ul>
                      <li><a href="#" data-toggle="tooltip" data-placement="right" title="View"><i class="fas fa-eye"></i></a></li>

                      <li><a href="#" data-toggle="tooltip" data-placement="right" title="Add to Wishlist"><i class="far fa-heart"></i></a></li>
                    </ul>
                    <a class="cart" href="#">Add to Cart</a>
                  </div>
                </div>
                <div class="why-text">
                  <h4>Białe spodnie</h4>
                  <h5> 109.90 zł</h5>
                </div>
              </div>
            </div>

            <div class="col-lg-3 col-md-6 special-grid best-seller">
              <div class="products-single fix">
                <div class="box-img-hover">
                  <div class="type-lb">
                    <p class="new">New</p>
                  </div>
                  <img src={img4} class="img-fluid" alt="Image" />
                  <div class="mask-icon">
                    <ul>
                      <li><a href="#" data-toggle="tooltip" data-placement="right" title="View"><i class="fas fa-eye"></i></a></li>

                      <li><a href="#" data-toggle="tooltip" data-placement="right" title="Add to Wishlist"><i class="far fa-heart"></i></a></li>
                    </ul>
                    <a class="cart" href="#">Add to Cart</a>
                  </div>
                </div>
                <div class="why-text">
                  <h4>Jeansowa sukienka</h4>
                  <h5> 139.90 zł</h5>
                </div>
              </div>
            </div>
          </div>


          <div class="row special-list">
            <div class="col-lg-3 col-md-6 special-grid best-seller">
              <div class="products-single fix">
                <div class="box-img-hover">
                  <div class="type-lb">
                    <p class="new">NEW</p>
                  </div>
                  <img src={img1} class="img-fluid" alt="Image1" />
                  <div class="mask-icon">
                    <ul>
                      <li><a href="#" data-toggle="tooltip" data-placement="right" title="View"><i class="fas fa-eye"></i></a></li>

                      <li><a href="#" data-toggle="tooltip" data-placement="right" title="Add to Wishlist"><i class="far fa-heart"></i></a></li>
                    </ul>
                    <a class="cart" href="#">Add to Cart</a>
                  </div>
                </div>
                <div class="why-text">
                  <h4>Luźna niebieska marynarka</h4>
                  <h5> 239.90 zł</h5>
                </div>
              </div>
            </div>

            <div class="col-lg-3 col-md-6 special-grid top-featured">
              <div class="products-single fix">
                <div class="box-img-hover">
                  <div class="type-lb">
                    <p class="new">New</p>
                  </div>
                  <img src={img2} class="img-fluid" alt="Image2" />
                  <div class="mask-icon">
                    <ul>
                      <li><a href="#" data-toggle="tooltip" data-placement="right" title="View"><i class="fas fa-eye"></i></a></li>

                      <li><a href="#" data-toggle="tooltip" data-placement="right" title="Add to Wishlist"><i class="far fa-heart"></i></a></li>
                    </ul>
                    <a class="cart" href="#">Add to Cart</a>
                  </div>
                </div>
                <div class="why-text">
                  <h4>Marynarka w kratke</h4>
                  <h5> 199.90 zł</h5>
                </div>
              </div>
            </div>

            <div class="col-lg-3 col-md-6 special-grid top-featured">
              <div class="products-single fix">
                <div class="box-img-hover">
                  <div class="type-lb">
                    <p class="new">New</p>
                  </div>
                  <img src={img3} class="img-fluid" alt="Image" />
                  <div class="mask-icon">
                    <ul>
                      <li><a href="#" data-toggle="tooltip" data-placement="right" title="View"><i class="fas fa-eye"></i></a></li>

                      <li><a href="#" data-toggle="tooltip" data-placement="right" title="Add to Wishlist"><i class="far fa-heart"></i></a></li>
                    </ul>
                    <a class="cart" href="#">Add to Cart</a>
                  </div>
                </div>
                <div class="why-text">
                  <h4>Białe spodnie</h4>
                  <h5> 109.90 zł</h5>
                </div>
              </div>
            </div>

            
          </div>



        </div>
      </div>

    );
    }
}

