import React from "react";
import '../css/newsletter.css';
import '../css/custom.css';


class NotifyModal extends React.Component {

    constructor(props) {
        super(props);
        this.state={
            mail:""
        };

        this.handleChange = this.handleChange.bind(this)
        this.addNotify = this.addNotify.bind(this); 
    }

    handleChange(e){
        console.log(e.target.value);
        this.setState({mail:e.target.value})
    }

    addNotify() {
        console.log(this.state.mail)
        fetch("http://localhost:9000/notify/" + this.state.mail + "/" + this.props.id, {
            method: "POST"
        }).catch(err => console.log(err))
        this.props.handleClose()
        this.setState({mail:""})
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
                                <div class="productNotification__header">
                                    <h2 class="title-left">Notify me</h2>
                                </div>

                                <div className=" newsletterBar__heading--small">
                                    <div className="foot__block foot__block--newsletter footNewsletter">
                                        <div className="container">
                                            <div className="newsletterBar col">


                                                <div class="productNotification__sub ">We currently do not have:</div>
                                                <div class="product__name">{this.props.name}

                                                </div>
                                                <div class="product__desc">
                                                    <div class="productNotification__sub">but soon it can be yours!
                                                    </div>
                                                    <br/> As soon as it goes on sale, we'll notify you. <br/>Give us
                                                    your email address!
                                                </div>
                                                <input type="hidden" name="product_notification_confirm" value="true"/>
                                                <div class="productNotification__fields">
                                                    <div
                                                        class="productNotification__error product_notification_email_notification ">
                                                        <input type="text" placeholder="Enter e-mail address"
                                                               value={this.state.mail}
                                                               onChange={this.handleChange}
                                                               name="email_notification"
                                                               class="textfield clear_input form_field form_textfield"
                                                                title="Wpisz swój adres e-mail" required=""/>
                                                    </div>

                                                    <div class="cart-and-bay-btn">

                                                        <a class="btn hvr-hover" href="#" onClick={()=>this.addNotify()}> Send email</a>
                                                    </div>
                                                </div>

                                            </div>


                                        </div>
                                    </div>
                                </div>


                            </div>
                            <div class="clear">
                            </div>
                        </div>

                        <a class="popupContainer__close" onClick={()=>this.props.handleClose()}>
                            <i class="fa fa-window-close" aria-hidden="true"></i>
                        </a>
                    </div>


                </div>
            </div>

        );
    }
}

export default NotifyModal;