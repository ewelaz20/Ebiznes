
import React, { Component } from "react";

import faq from "../images/faq.png";
import delivery from "../images/delivery.png";
import search from "../images/search.png";

export default class Footer extends Component {

    constructor(props) {
        super(props);

        this.state = {
            contact: {
                address: "",
                phone: "",
                email: ""
            },
            about:{
                id:"",
                about:""
            }

        };
    }
    componentDidMount() {
      
        fetch("http://localhost:9000/contact")
            .then(response => response.json())
            .then(json => {
                console.log("state  " + json.name);

                this.setState({ contact: json })
            }
            );

            fetch("http://localhost:9000/about")
            .then(response => response.json())
            .then(json => {
                console.log("state  " + json.name);

                this.setState({ about: json })
            }
            );

    }


    render() {
        return (
            <div>
                <br />
                <div class="PictogramFooter">
                    <div class="row container h_around PictogramFooter--container">
                        <a class="row h_start v_center PictogramFooter--item ">
                            <div class="PictogramFooter--picture">
                                <img alt="" src={faq} width="48" height="40" />
                            </div>
                            <h3 class="PictogramFooter--name"> FAQ</h3>
                        </a>
                        <a  class="row h_start v_center PictogramFooter--item ">
                            <div class="PictogramFooter--picture">
                                <img alt="" src={delivery} width="48" height="40" />
                            </div>
                            <h3 class="PictogramFooter--name">Delivery</h3>

                        </a><a  class="row h_start v_center PictogramFooter--item ">
                            <div class="PictogramFooter--picture">
                                <img alt="" src={search} width="44" height="40" />
                            </div>
                            <h3 class="PictogramFooter--name">Search</h3></a>
                    </div>
                </div>
                <br/>

                <div class="footer-main">
                    <div class="container">

                        <hr />
                        <div class="row">
                            <div class="col-lg-4 col-md-12 col-sm-12">
                                <div class="footer-widget">
                                    <h4>About </h4>
                                    <p> {this.state.about.about}</p>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-12 col-sm-12">
                                <div class="footer-link">
                                    <h4>Information</h4>
                                    <ul>
                                        <li><a href="">About Us</a></li>
                                        <li><a href="">Customer Service</a></li>
                                        <li><a href="">Our Sitemap</a></li>
                                        <li><a href="">Terms &amp; Conditions</a></li>
                                        <li><a href="">Privacy Policy</a></li>
                                        <li><a href="">Delivery Information</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col-lg-4 col-md-12 col-sm-12">
                                <div class="footer-link-contact">
                                    <h4>Contact Us</h4>
                                    <ul>
                                        <li>
                                            <p><i class="fas fa-map-marker-alt"></i>Address: {this.state.contact.address} </p>
                                        </li>
                                        <li>
                                            <p><i class="fas fa-phone-square"></i>Phone: <a > {this.state.contact.phone}</a></p>
                                        </li>
                                        <li>
                                            <p><i class="fas fa-envelope"></i>Email: <a > {this.state.contact.email}</a></p>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

        );
    }
}

