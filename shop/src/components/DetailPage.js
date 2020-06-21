import React, { Component } from "react";
import '../css/bootstrap.min.css';
import '../css/style.css';
import '../css/responsive.css';
import '../css/custom.css';
import '../css/newsletter.css';

import Notify from "./NotifyModal"
import { addToWishlist } from "./Wishlist-handler"
import {UserContext} from "./User-context";


export default class DetailPage extends Component {

    static contextType = UserContext;
    constructor(props) {
        super(props);

        this.state = {
            modal: false,
            name: "",
            modalInputName: "",
            product: {
                name: "",
                quantity: "",
                description: "",
                price: "",
                image: ""
            },

            sizes: [],
        };
    }
    componentDidMount() {
        console.log("USER   " + this.context.user);
        fetch("http://localhost:9000/product/" + this.props.id)
            .then(response => response.json())
            .then(json => {
                console.log("state  " + json.name);

                this.setState({ product: json })
            }
            );

        fetch("http://localhost:9000/products/sizes/" + this.props.id)
            .then(response => response.json())
            .then(json => {
                console.log("state  " + json.name);

                this.setState({ sizes: json })
            }
            );



    }

    addToWishListHandler() {
        addToWishlist(this.context.user, this.state.product.id)
    }


    modalOpen() {
        this.setState({ modal: true });
    }

    modalClose() {
        this.setState({
            modalInputName: "",
            modal: false
        });
    }

    getNotifyButton() {
        return (
            <div>
                <a class="btn hvr-hover" href="#" onClick={e => this.modalOpen(e)}>Notify
            availability</a>

                <Notify show={this.state.modal} handleClose={e => this.modalClose(e)} id= {this.state.product.id} name={this.state.product.name}>
                </Notify>
            </div>
        )
    }
    getButton() {
        console.log(this.state.product.quantity);
        if (this.state.product.quantity > 0) {
            return (<div>
                <a href="" class="btn hvr-hover" onClick={()=>this.context.pushToCart(this.state.product)} >&nbsp;&nbsp;&nbsp;Add to cart now&nbsp;&nbsp;&nbsp;</a></div>)
        } else {
            return this.getNotifyButton()
        }

    }

    getSizes(){
        return (
        this.state.sizes.map(size =>  <option value={size}>{size}</option>)
        )

    }


    render() {
        return (


            <div class="shop-detail-box-main">
                <div class="container">
                    <div class="row">
                        <div class="col-xl-5 col-lg-5 col-md-6">
                            <div id="carousel-example-1" class="single-product-slider carousel slide">
                                <div class="carousel-inner" role="listbox">
                                    <div class="carousel-item active"><img class="d-block w-100" src={this.state.product.image}
                                        alt="First slide" /></div>

                                </div>


                            </div>
                        </div>


                        <div class="col-xl-7 col-lg-7 col-md-6">
                            <div class="single-product-details ">
                                <h2>{this.state.product.name} </h2>
                                <h5> Price - {this.state.product.price} $ </h5>



                                <div class="price-box-bar">
                                    <div class="row">

                                        <h4>
                                            <label class="label-product" for="sizes">Choose size:</label>

                                            <select id="size">
                                                {this.getSizes()}
                                            </select>
                                        </h4>

                                    </div>
                                    <div>
                                        <h4>
                                            <label >Quantity</label>
                                            <input type="number" min="1" max = {this.state.product.quantity} defaultValue={1} class="form-control label-qty" />
                                        </h4>
                                    </div>


                                    <h4>Short description</h4>
                                    <p> {this.state.product.description}</p>
                                    <hr />

                                    <div class="cart-and-bay-btn">


                                        {this.getButton()}

                                        <br /><br />

                                        <a href="" class="btn hvr-hover" onClick={()=>this.addToWishListHandler()}><i class="fas fa-heart"></i> &nbsp;&nbsp;Add to
                                            wishlist&nbsp;&nbsp;</a>
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

