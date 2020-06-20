import React, { Component } from "react";
import '../css/bootstrap.min.css';
import '../css/style.css';
import '../css/responsive.css';

import { UserContext } from "./user-context";
import { addToWishlist } from "./wishlist-handler"
import Notify from "./NotifyModal"

export default class Wishlist extends Component {
    static contextType = UserContext;

    constructor(props) {
        super(props);
        this.state = {
            favourites: []

        };
        this.singleWishlistProduct = this.singleWishlistProduct.bind(this);
        this.removeFromWishList = this.removeFromWishList.bind(this);
        this.stock = this.stock.bind(this);

    }

    componentDidMount() {
        console.log("USER   " + this.context.user);
        fetch("http://localhost:9000/fav/" + this.context.user, { mode: "cors", method: "GET" })
            .then(response => response.json())
            .then(json =>
                this.setState({ favourites: json })
            )


    }

    removeFromWishList(id) {
        console.log("removing");
        let fav = [...this.state.favourites];
        this.setState({ favourites: fav.filter(item => item.id !== id) })
        fetch("http://localhost:9000/fav/" + this.context.user + "/" + id, {
            method: "DELETE"
        }).catch(err => console.log(err))

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

    stock(product) {
        if (product.quantity > 0) {
            return (
                <td className="quantity-box">In stock</td>
            )
        } else {
            return (

                <td className="quantity-box">Out of stock</td>
            )
        }
    }

    addToCart(product) {
        if (product.quantity > 0) {
            return (<td className="add-pr" onClick={() => this.context.pushToCart(product)}>
                <a href="" className="btn hvr-hover" >Add to Cart</a>
            </td>)
        } else {
            return (
                
                    <td className="add-pr" onClick={e => this.modalOpen(e)}>
                        <a href=""className="btn hvr-hover" > &nbsp;&nbsp;&nbsp;&nbsp; Notify &nbsp;&nbsp;&nbsp;&nbsp;</a>
                    </td>
                   
                )
        }
    }


    singleWishlistProduct(product) {
        console.log(product);
        return (
            <tr>
                <td className="thumbnail-img">
                    <a href={"/product/" + product.id}>
                    <img className="img-fluid" src={product.image} alt="" />
                    </a>
                </td>
                <td className="name-pr">
                    <a href={"/product/" + product.id}>
                    &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; {product.name}
                    </a>
                </td>
                <td className="price-pr">
                    <p>&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; {product.price}</p>
                </td>
                {this.stock(product)}
                {this.addToCart(product)}
                <Notify show={this.state.modal} handleClose={e => this.modalClose(e)} id={product.id} name={product.name}></Notify>
                <td className="remove-pr" >
                    <a onClick={() => this.removeFromWishList(product.id)}>
                        <i className="fas fa-times"></i>
                    </a>
                </td>
            </tr>
        )
    }

    render() {
        return (
            <div class="wishlist-box-main">
                <div class="container">
                    <div class="row">


                        <div class="col-lg-12">
                            <div class="title-all text-center">
                                <hr />
                                <h1>Favourites</h1>
                                <hr />

                            </div>
                            <div class="table-main table-responsive">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>Product</th>
                                            <th></th>
                                            <th>Price</th>
                                            <th>Stock</th>
                                            <th>Add Item</th>
                                            <th>Remove</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        {this.state.favourites.map(this.singleWishlistProduct)}
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        );
    }
}
