import React, {Component} from "react";
import '../css/newsletter.css';
import '../css/custom.css';

import Newsletter from "./newsletter";
import Footer from "./footer"
import Header from "./header"


import img1 from '../images/marynarki/marynarka1.jpg';
import img2 from '../images/marynarki/marynarka2.jpg';
import img3 from '../images/spodnie/spodnie1.jpg';
import img4 from '../images/sukienki/sukienka2.jpg';
// import {addToWishlist} from "./wishlist-handler"

class Item extends Component {

    constructor(props) {
        super(props);
        this.singleProductDisplay = this.singleProductDisplay.bind(this);
    }


    singleProductDisplay() {
        return (

            <div className="col-lg-3 col-md-6 special-grid best-seller">
                <a href={"/product/"+this.props.item.id}>
            <div className="products-single fix">
                <div className="box-img-hover">

                    <div className="type-lb">
                        <p className={this.props.item.status}>{this.props.item.status}</p>
                    </div>
                    <img src={this.props.item.image} className="img-fluid" alt="Image1"/>


                    <div className="mask-icon">
                        <ul>
                            <li><a href={"/product/"+this.props.item.id} data-toggle="tooltip" data-placement="right" title="View"><i className="fas fa-eye"></i></a></li>

                            <li><a href={"#"} data-toggle="tooltip" data-placement="right"
                                   title="Add to Wishlist"><i className="far fa-heart"></i></a></li>
                        </ul>
                        <a className="cart" href="#">Add to Cart</a>
                    </div>


                </div>
                <div className="why-text">
                    <h4>{this.props.item.name}</h4>
                    <h5>{this.props.item.price}</h5>
                </div>
            </div>
                </a>
        </div>

        )
    };

    render() {
        return (
            this.singleProductDisplay()
        );
    }
}


export default Item;