import React from "react";
import '../css/newsletter.css';
import '../css/custom.css';
import '../css/search.css';


class SearchModal extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            searchtext: ""
        };


        this.handleChange = this.handleChange.bind(this)
        this.addNotify = this.addNotify.bind(this);
    }
    handleChange(e) {
        console.log(e.target.value);
        this.setState({ searchtext: e.target.value })
        e.preventDefault();
    }

    addNotify() {
        console.log(this.state.searchtext)
        this.props.handleClose()

    }

    render() {
        let showHideClassName = this.props.show ? "modal d-block" : "modal d-none";

        return (

            <div className={showHideClassName}>
                <div className="modal-container">
                    {this.props.children}
                    <div class="module product_notification">
                        <div class="module_body">
                            <div class="productNotification">
                                <div className=" newsletterBar__heading--small">
                                    <div className="foot__block foot__block--newsletter footNewsletter">
                                        <div className="container">
                                            <div className="newsletterBar col">
                                                <div class="productNotification__sub ">Search products</div>
                                                <input type="hidden" name="product_notification_confirm" value="true" />
                                                <div class="productNotification__fields">
                                                    <div
                                                        class="productNotification__error product_notification_email_notification ">
                                                        <input type="text" placeholder="Search..."
                                                            value={this.state.searchtext}
                                                            onChange={this.handleChange}
                                                            name="email_notification"
                                                            class="textfield clear_input form_field form_textfield"
                                                            title="Search" required="" />
                                                    </div>
                                                    <div class="cart-and-bay-btn">
                                                        <a href= "" class="btn hvr-hover" href={"/search/" + this.state.searchtext} onClick={() => this.addNotify()} > Search</a>
                                                    </div>
                                                    <br />
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="clear">
                            </div>
                        </div>
                        <a class="popupContainer__close" onClick={() => this.props.handleClose()}>
                            <i class="fa fa-window-close" aria-hidden="true"></i>
                        </a>
                    </div>
                </div>
            </div>
        );
    }
}

export default SearchModal;