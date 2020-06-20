
import React, { Component } from "react";

import '../css/bootstrap.min.css';
import '../css/style.css';
import '../css/responsive.css';
import '../css/custom.css';
import '../css/newsletter.css';

import Notify from './CheckoutModal'
import { UserContext } from "./user-context";

export default class Checkout extends Component {

    static contextType = UserContext;
    constructor(props) {
        super(props);
        this.state = {
            modal:false,
            products:[],
            userdetails:{
                user: 1,
                fName: "",
                lName: "",
                email:"",
                address: "",
                country:"",
                zip:"",
                amount:23.05
            }
        };
        this.handleChange = this.handleChange.bind(this);
        this.singleItem = this.singleItem.bind(this);
        this.calculateProductTotal = this.calculateProductTotal.bind(this);
    }

    componentDidMount(){
        this.setState({products:this.context.cart})
    }


 

    handleChange(event) {
        let userdetails = {...this.state.userdetails};
        userdetails[event.target.name] = event.target.value;

        this.setState({

            fName: event.target.fName,
            lName: event.target.lName,
            address: event.target.address,
            zip: event.target.zip,
            country: event.target.country,
            email: event.target.email,
            amount: event.target.amount,
            userdetails: userdetails
            
        });
    }

    calculateOverallTotal(){
        let products = [...this.state.products];
        let productTotals = products.map(product => parseFloat(this.calculateProductTotal(product)));
        let sum = productTotals.reduce((a, b)=> a+b,0);
        return sum.toFixed(2)
    }
    
    calculateProductTotal(product){
        let multiplier = product.selectedAmount === undefined ? 1 :product.selectedAmount;
        return parseFloat(multiplier * product.price).toFixed(2)
    }

    singleItem(product){
        return(<div className="media mb-2 border-bottom">
            <div className="media-body"><a > {product.name}</a>
                <div className="small text-muted">Price: ${product.price} <span className="mx-2">|</span> Subtotal: ${this.calculateProductTotal(product)}
                </div>
            </div>
        </div>)

    }

    modalOpen(e) {
        this.setState({ modal: true });
        e.preventDefault();
    }

    modalClose() {
        this.setState({
            modalInputName: "",
            modal: false
        });
    }

    render() {
        return (
            <div>
                <div class="cart-box-main">
                    <div class="container">

                                   
      <ul class="progressbar">
          <a href= "login"><li class="active">Login</li></a>
          <a href= "cart"><li class="active">Cart</li></a>
          <a href= "checkout"> <li class="active">Customer details</li></a>
          <a href= "checkout"><li>Payments</li></a>
          <br/> <br/>
  </ul> 
 
                        <div class="row new-account-login">
                            <br/> <br/>
                            <div class="row">
                                <div class="col-sm-6 col-lg-6 mb-3">
                                    <div class="checkout-address">
                                        <div class="title-left">
                                            <h3>Shipping address</h3>
                                        </div>
                                        <form class="needs-validation" novalidate>
                                            <div class="row">
                                                <div class="col-md-6 mb-3">
                                                    <label for="firstName">First name *</label>
                                                    <input type="text" onChange={this.handleChange} name="fName" class="form-control" id="firstName" placeholder="" value={this.state.fname} required />
                                                    <div class="invalid-feedback"> Valid first name is required. </div>
                                                </div>
                                                <div class="col-md-6 mb-3">
                                                    <label for="lastName">Last name *</label>
                                                    <input type="text" onChange={this.handleChange} name="lName" class="form-control" id="lastName" placeholder="" value={this.state.lname} required />
                                                    <div class="invalid-feedback"> Valid last name is required. </div>
                                                </div>
                                            </div>

                                            <div class="mb-3">
                                                <label for="email">Email Address *</label>
                                                <input type="email" onChange={this.handleChange} name="email" class="form-control" id="email" placeholder=""  value={this.state.email} required/>
                                                <div class="invalid-feedback"> Please enter a valid email address for shipping updates. </div>
                                            </div>
                                            <div class="mb-3">
                                                <label for="address">Address *</label>
                                                <input type="text" onChange={this.handleChange} name="address" class="form-control" id="address" placeholder="" value={this.state.address} required />
                                                <div class="invalid-feedback"> Please enter your shipping address. </div>
                                            </div>
                                            
                                            {/* <div class="mb-3">
                                                <label for="address2">Phone *</label>
                                                <input type="text" class="form-control" id="address2" placeholder="" value="" required /> </div> */}
                                            <div class="row">
                                                <div class="col-md-5 mb-3">
                                                    <label for="country">Country *</label>
                                                    <select class="wide w-100" id="country" onChange={this.handleChange} name="country" value={this.state.country}>
                                                        <option value="Choose..." data-display="Select">Choose...</option>
                                                        <option value="United States">United States</option>
                                                        <option value="Poland">Poland</option>
                                                    </select>
                                                    <div class="invalid-feedback"> Please select a valid country. </div>
                                                </div>

                                                <div class="col-md-3 mb-3">
                                                    <label for="zip">Zip *</label>
                                                    <input type="text" onChange={this.handleChange} name="zip" class="form-control" id="zip" placeholder="" value={this.state.zip} required />
                                                    <div class="invalid-feedback"> Zip code required. </div>
                                                </div>
                                            </div>
                                            <hr class="mb-4" />


                                            <div class="title-left">
                                                <h3>Payment</h3>
                                            </div>

                                            
                                            <div class="row">
                                                <div class="col-md-6 mb-3">
                                                    <label for="cc-name">Name on card</label>
                                                    <input type="text" class="form-control" id="cc-name" placeholder="" required />
                                                    <small class="text-muted">Full name as displayed on card
                                    </small>
                                                    <div class="invalid-feedback"> Name on card is required </div>
                                                </div>
                                                <div class="col-md-6 mb-3">
                                                    <label for="cc-number">Credit card number</label>
                                                    <input type="text" class="form-control" id="cc-number" placeholder="" required />
                                                    <div class="invalid-feedback"> Credit card number is required </div>
                                                </div>
                                            </div>
                                            <div class="row">
                                                <div class="col-md-3 mb-3">
                                                    <label for="cc-expiration">Expiration</label>
                                                    <input type="text" class="form-control" id="cc-expiration" placeholder="" required />
                                                    <div class="invalid-feedback"> Expiration date required </div>
                                                </div>
                                                <div class="col-md-3 mb-3">
                                                    <label for="cc-expiration">CVV</label>
                                                    <input type="text" class="form-control" id="cc-cvv" placeholder="" required />
                                                    <div class="invalid-feedback"> Security code required </div>
                                                </div>

                                            </div>
                                            <hr class="mb-1" /> </form>
                                            
                            

                                    </div>
                                    
                                </div>
                                <div class="col-sm-6 col-lg-6 mb-3">
                                    <div class="row">
                                        <div class="col-md-12 col-lg-12">
                                            <div class="shipping-method-box">
                                                <div class="title-left">
                                                    <h3>Shipping Method</h3>
                                                </div>
                                                <div class="mb-4">
                                                <div class="custom-control custom-radio">
                                                        <input id="shippingOption1" name="shipping-option"  checked="checked" type="radio" />
                                                        <label  for="shippingOption1">Standard Delivery</label> <span class="float-right font-weight-bold">FREE</span> </div>
                                                    <div class="ml-4 mb-2 small">(3-7 business days)</div>
                                                    <div class="custom-control custom-radio">
                                                        <input id="shippingOption2" name="shipping-option"  type="radio" />
                                                        <label  for="shippingOption2">Express Delivery</label> <span class="float-right font-weight-bold">$10.00</span> </div>
                                                    <div class="ml-4 mb-2 small">(2-4 business days)</div>
                                                    <div class="custom-control custom-radio">
                                                        <input id="shippingOption3" name="shipping-option" type="radio" />
                                                        <label  for="shippingOption3">Next Business day</label> <span class="float-right font-weight-bold">$20.00</span> </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-12 col-lg-12">
                                            <div class="odr-box">
                                                <div class="title-left">
                                                    <h3>Shopping cart</h3>
                                                </div>
                                                <div class="rounded p-2 bg-light">
                                                {this.state.products.map(product => this.singleItem(product))}
                                                
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-12 col-lg-12">
                                            <div class="order-box">
                                                <div class="title-left">
                                                    <h3>Your order</h3>
                                                </div>
                                                <div class="d-flex">
                                                    <div class="font-weight-bold">Product</div>
                                                    <div class="ml-auto font-weight-bold">Total</div>
                                                </div>
                                                <hr class="my-1" />
                                                <div class="d-flex">
                                                    <h4>Total</h4>
                                                    <div class="ml-auto font-weight-bold">  $ {this.calculateOverallTotal()} </div>
                                                </div>

                                                <hr class="my-1" />

                                                <div class="d-flex">
                                                    <h4>Shipping Cost</h4>
                                                    <div class="ml-auto font-weight-bold"> Free </div>
                                                </div>
                                                <hr />
                                                <div class="d-flex gr-total">
                                                    <h5>Grand Total</h5>
                                                    <div class="ml-auto h5" onChange={this.handleChange} name="amount" value={this.state.country} > $ {this.calculateOverallTotal()}  </div>
                                                </div>
                                                <hr />
                                            </div>
                                        </div>
                                        <div class="col-12 d-flex shopping-box"> <a href = "" class="ml-auto btn hvr-hover" onClick={e => this.modalOpen(e)}>Place Order</a> </div>

                                        <Notify show={this.state.modal} handleClose={e => this.modalClose(e)} ></Notify>
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


