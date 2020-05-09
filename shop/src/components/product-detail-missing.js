import React, {Component} from "react";
import '../css/bootstrap.min.css';
import '../css/style.css';
import '../css/responsive.css';
import '../css/custom.css';
import '../css/newsletter.css';

import Newsletter from "./newsletter";
import Footer from "./footer"
import Header from "./header"
import Notify from "./notify"


import img1 from '../images/marynarki/marynarka1.jpg';
import img2 from '../images/marynarki/marynarka2.jpg';
import img3 from '../images/spodnie/spodnie1.jpg';

export default class DetailPageM extends Component {

    constructor(props) {
        super(props);

        this.state = {
            modal: false,
            name: "",
            modalInputName: "",
            product:{
                name:"",
                description:"",
                price:"",
                image:""
            }
        };
    }
    componentDidMount() {
        console.log("USER   " + this.context.user);
        fetch("http://localhost:9000/product/" + this.props.id)
            .then(response => response.json())
            .then(response =>
                {

                        if (response["id"] % 3 === 0) {
                            response["image"] = img2
                        } else {
                            response["image"] = img1
                        }
                    return response;
                    }
            )
            .then(json =>{
                console.log("state  "+json.name);
                this.setState({product: json})}
            );



    }

    //
    // handleChange(e) {
    //     const target = e.target;
    //     const name = target.name;
    //     const value = target.value;
    //
    //     this.setState({
    //         [name]: value
    //     });
    // }
    //
    // handleSubmit(e) {
    //     this.setState({ name: this.state.modalInputName });
    //     this.modalClose();
    // }

    modalOpen() {
        this.setState({modal: true});
    }

    modalClose() {
        this.setState({
            modalInputName: "",
            modal: false
        });
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
                                                                           alt="First slide"/></div>

                                </div>


                            </div>
                        </div>


                        <div class="col-xl-7 col-lg-7 col-md-6">
                            <div class="single-product-details ">
                                <h2>{this.state.product.name} </h2>
                                <h5> Cena - {this.state.product.price} zł </h5>
                                <h4>Short description</h4>
                                <p> {this.state.product.description}</p>


                                <div class="price-box-bar">
                                    <div>
                                        <label class="control-label">Quantity</label>
                                        <input type="number" class="form-control"/>
                                    </div>
                                    <hr/>

                                    <div class="cart-and-bay-btn">

                                        <a class="btn hvr-hover" href="#" onClick={e => this.modalOpen(e)}>Notify
                                            availability</a>

                                        <Notify show={this.state.modal} handleClose={e => this.modalClose(e)}>
                                        </Notify>

                                        <br/><br/>

                                        <a class="btn hvr-hover" href="#"><i class="fas fa-heart"></i> Add to
                                            wishlist</a>
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

