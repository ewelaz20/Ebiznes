import React, { Component } from 'react';

import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import './css/search.css';


import Carousel from "./components/Carousel";
import Newsletter from "./components/Newsletter";
import Footer from "./components/Footer"
import Header from "./components/Header"
import Item from "./components/Item"
import { UserContext } from "./components/User-context";


class FrontPage extends Component {
    static contextType = UserContext;
    constructor(props) {
        super(props);
        let categoryMappings = {
            "blazers": 1,
            "dresses": 2,
            "trousers": 3,
            "skirts": 4,
            "coats": 5,
            "blouses": 6,
            "accessories": 7,
            "shoes": 8,
        };
        this.state = {
            categoryId: categoryMappings[this.props.match.params.id],
            products: []
        }
            ;

        this.getInChunks = this.getInChunks.bind(this);
        this.displayBlock = this.displayBlock.bind(this)

    }

    componentDidMount() {
        console.log("USER   " + this.context.user);
        fetch("http://localhost:9000/products/category/" + 1)
            .then(response => response.json())
            .then(json =>
                this.setState({ products: json })
            )


    }

    getInChunks() {
        let productList = this.state.products;
        let results = [];


        results.push(productList.splice(0, 4));

        console.log(results);
        return results;
    }

    displayBlock(sublist) {
        return (
            <div clas sName="products-box ">
                <div className="container flexbox-container">
                    {sublist.map(item => <Item item={item} />)}
                </div>
            </div>
        )
    }



    render() {
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
                        {this.getInChunks().map(sublist => this.displayBlock(sublist))}
                    </div>
                </div>
                <Newsletter></Newsletter>
                <Footer></Footer>
            </div>
        );
    }
}

export default FrontPage;