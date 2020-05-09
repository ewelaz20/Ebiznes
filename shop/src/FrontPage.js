import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import './css/search.css';


import img1 from './images/marynarki/marynarka1.jpg';
import img2 from './images/marynarki/marynarka2.jpg';
import img3 from './images/spodnie/spodnie1.jpg';
import img4 from './images/sukienki/sukienka2.jpg';



//import Login from "./components/login.component";
//import Wishlist from "./components/signup.component";
import Carousel from "./components/carousel";
import Newsletter from "./components/newsletter";
import Footer from "./components/footer"
import Login from "./components/login"
import Header from "./components/header"
import CreateAccount from "./components/create-account"
import Wishlist from "./components/wishlist"
import Cart from "./components/cart";
import Checkout from "./components/checkout";




function FrontPage() {
  return (
    <div className="App">
      <Header></Header>


      <Carousel />
      <div class="products-box">
        <div class="container">
          <div class="row">
            <div class="col-lg-12">
              <div class="title-all text-center ">
                <h1>New Arrivals</h1>

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
        </div>
      </div>

      <Newsletter></Newsletter>
      <Footer></Footer>

    </div>
  );
}

export default FrontPage;