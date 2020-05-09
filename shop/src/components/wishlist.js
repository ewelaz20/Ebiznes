import React, {Component} from "react";
import '../css/bootstrap.min.css';
import '../css/style.css';
import '../css/responsive.css';


import img1 from '../images/marynarki/marynarka1.jpg';
import img2 from '../images/marynarki/marynarka2.jpg';
import img3 from '../images/spodnie/spodnie1.jpg';
import {UserContext} from "./user-context";
import {addToWishlist} from "./wishlist-handler"

export default class Wishlist extends Component {
    static contextType = UserContext;

    constructor(props) {
        super(props);
        this.state = {
            favourites: [
                {name: "niebieski żakiet", price: 100, image: img1},
                {
                    name: "różowy",
                    price: 130,
                    image: img2
                },
                {name: "spodnie", price: 89, image: img3}]

        };
        this.singleWishlistProduct = this.singleWishlistProduct.bind(this);
        this.removeFromWishList = this.removeFromWishList.bind(this);

    }

    componentDidMount() {
        console.log("USER   " + this.context.user);
        fetch("http://localhost:9000/fav/"+ this.context.user)
            .then(response => response.json())
            .then(response => {
                response.forEach(
                    product => {

                        if (product["id"] % 3 === 0) {
                            product["image"] = img2
                        } else {
                            product["image"] = img1
                        }
                    }
                )
                ;
                return response
            })
            .then(json =>
                this.setState({favourites: json})
            )


    }

    removeFromWishList(name) {
        console.log("removing");
        let fav = [...this.state.favourites];
        this.setState({favourites:fav.filter(item => item.name !== name)})
    }
    test(){
        addToWishlist()
    }



    singleWishlistProduct(product) {
        console.log(this.context.user);
        return (
            <tr>
                <td className="thumbnail-img">
                    <a href="#">
                        <img className="img-fluid" src={product.image} alt=""/>
                    </a>
                </td>
                <td className="name-pr">
                    <a href="#">
                        {product.name}
                    </a>
                </td>
                <td className="price-pr">
                    <p>{product.price}</p>
                </td>
                <td className="quantity-box">In Stock</td>
                <td className="add-pr">
                    <a className="btn hvr-hover" href="#">Add to Cart</a>
                </td>
                <td className="remove-pr" >
                    <a onClick={()=>this.removeFromWishList(product.name)}>
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
                                <hr/>
                                <h1>Favourites</h1>
                                <hr/>

                            </div>
                            <div class="table-main table-responsive">
                                <table class="table">
                                    <thead>
                                    <tr>
                                        <th>Preview</th>
                                        <th>Product Name</th>
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
