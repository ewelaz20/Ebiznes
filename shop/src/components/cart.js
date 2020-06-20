import React, {Component} from "react";

import '../css/bootstrap.min.css';
import '../css/style.css';
//import '../css/order.css';
import '../css/responsive.css';

import {UserContext} from "./user-context";

export default class Cart extends Component {

    static contextType = UserContext;

    constructor(props) {
        super(props);
        this.state = {
            products: []
        };

        this.removeProduct = this.removeProduct.bind(this)
    }

    componentDidMount() {
        let products = this.context.cart;
        products.map(product => {
            console.log("inside");
            console.log(product);
            if (product["selectedAmount"] === undefined) {
                product["selectedAmount"] = 1;
            }

            return product;
        });
        this.setState({products: products})
    }


    changeAmount(event, product) {
        let productscpy = [...this.state.products];
        let index = productscpy.findIndex(value => value.id === product.id);
        let prod = {...productscpy[index]};
        prod["selectedAmount"] = event.target.value;
        productscpy[index] = prod;
        this.setState({products: productscpy});
        this.context.pushToCart(productscpy)
    }


    calculateProductTotal(product) {
        return parseFloat(product.selectedAmount * product.price).toFixed(2)
    }

    calculateOverallTotal() {
        let products = [...this.state.products];
        let productTotals = products.map(product => parseFloat(this.calculateProductTotal(product)));
        let sum = productTotals.reduce((a, b) => a + b, 0);
        return sum.toFixed(2)
    }

    removeProduct(product) {
        this.context.removeFromCart(product);
        let products = [...this.state.products];
        products.filter(prod => prod.id !== product.id);
        this.setState({products: products});
        window.location.reload();
    }

    productRow(product) {
        return (
            <tbody>
            <tr/>
            <td className="thumbnail-img">
                <a href="#">
                    <img className="img-fluid" src={product.image} alt="" width="400"/>
                </a>
            </td>
            <td className="name-pr">
                <a href={"/product/" + product.id}>
                    &nbsp;&nbsp; &nbsp;&nbsp; {product.name}
                </a>

            </td>
            <td className="price-pr">
                <p>&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; $ {product.price}</p>
            </td>
            <td className="quantity-box"><input type="number" size="4" min="1"
                                                step="1"
                                                defaultValue={product.selectedAmount}
                                                onChange={(e) => this.changeAmount(e, product)}
                                                max={product.quantity}
                                                className="c-input-text qty text"/></td>
            <td className="total-pr">
                <p>&nbsp;&nbsp;&nbsp;&nbsp;$ {this.calculateProductTotal(product)}</p>
            </td>
            <td className="remove-pr">
                <a onClick={() => this.removeProduct(product)}>
                    <i className="fas fa-times"></i>
                </a>
            </td>
            <tr/>
            <tr/>
            </tbody>
        )
    }

    productTable() {
        return (<table className="table">
            <thead>
            <tr>
                <th>Product</th>
                <th></th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Total</th>
                <th>Remove</th>
            </tr>
            </thead>
            {this.state.products.map(product => this.productRow(product))}


        </table>)
    }

    render() {
        return (

            <div class="cart-box-main">


                <div class="container">

                    <ul class="progressbar">
                        <a href="login">
                            <li class="active">Login</li>
                        </a>
                        <a href="cart">
                            <li class="active">Cart</li>
                        </a>
                        <a href="checkout">
                            <li>Customer details</li>
                        </a>
                        <a href="checkout">
                            <li>Payments</li>
                        </a>
                        <br/> <br/>
                    </ul>

                    <div class="row">
                        <div class="col-lg-12">
                            <div class="table-main table-responsive">
                                <br/> <br/>

                                {this.productTable()}

                            </div>
                        </div>
                    </div>

                    <div class="row my-5">
                        <div class="col-lg-6 col-sm-6">
                            <div class="coupon-box">
                                <div class="input-group input-group-sm">
                                    <input class="form-control" placeholder="Enter your coupon code"
                                           aria-label="Coupon code" type="text"/>
                                    <div class="input-group-append">
                                        <button class="btn btn-theme" type="button">Apply Coupon</button>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>

                    <div class="row my-5">
                        <div class="col-lg-8 col-sm-12"></div>
                        <div class="col-lg-4 col-sm-12">
                            <div class="order-box ">
                                <h3 class="title-left">Order summary</h3>
                                <div class="d-flex">
                                    <h4>Sub Total</h4>
                                    <div class="ml-auto font-weight-bold"> $ {this.calculateOverallTotal()}</div>
                                </div>

                                <hr class="my-1"/>


                                <div class="d-flex">
                                    <h4>Shipping Cost</h4>
                                    <div class="ml-auto font-weight-bold"> Free</div>
                                </div>
                                <hr/>
                                <div class="d-flex gr-total">
                                    <h5>Total</h5>
                                    <div class="ml-auto h5"> $ {this.calculateOverallTotal()}</div>
                                </div>
                                <hr/>
                            </div>
                        </div>
                        <div class="col-12 d-flex shopping-box"><a href="/checkout"
                                                                   class="ml-auto btn hvr-hover">Checkout</a></div>
                    </div>

                </div>
            </div>


        );
    }
}

