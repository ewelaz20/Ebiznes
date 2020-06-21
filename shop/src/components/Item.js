import React, { Component } from "react";
import '../css/bootstrap.min.css';
import '../css/style.css';
import '../css/responsive.css';
import '../css/custom.css';
import '../css/newsletter.css';


import { addToWishlist } from "./Wishlist-handler";
import Notify from "./WishlistModal";
import { UserContext } from "./User-context";

class Item extends Component {

    static contextType = UserContext;
    constructor(props) {
        super(props);
        this.singleProductDisplay = this.singleProductDisplay.bind(this);
        this.state = {
            modal: false,
        }

    }

    addToWishListHandler() {
        addToWishlist(this.context.user, this.props.item.id)
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

    singleProductDisplay() {
        return (

            <div className="col-lg-3 col-md-6 special-grid best-seller">
                <a href={"/product/" + this.props.item.id}>
                    <div className="products-single fix">
                        <div className="box-img-hover">
                            <div className="type-lb">
                                <p className={this.props.item.status}>{this.props.item.status}</p>
                            </div>
                            <img src={this.props.item.image} className="img-fluid" alt="Image" />

                            <div className="mask-icon">
                                <ul>
                                    <li><a href={"/product/" + this.props.item.id} data-toggle="tooltip" data-placement="right" title="View"><i className="fas fa-eye"></i></a></li>

                                    <li><a href="" onClick={e => { this.modalOpen(e); this.addToWishListHandler(); }} data-placement="right"
                                        title="Add to Wishlist"><i className="far fa-heart"></i></a>  <Notify show={this.state.modal} handleClose={e => this.modalClose(e)} name={this.props.item.name}>
                                        </Notify>

                                    </li>

                                </ul>
                                <a className="cart" onClick={() => this.context.pushToCart(this.props.item)}>Add to Cart</a>
                            </div>


                        </div>
                        <div className="why-text">
                            <h4>{this.props.item.name}</h4>
                            <h5>{this.props.item.price} $</h5>
                        </div>
                    </div>
                </a>
            </div>

        )
    }

    render() {
        return (
            this.singleProductDisplay()
        );
    }
}


export default Item;