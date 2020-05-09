import React, { Component } from "react";
import '../css/newsletter.css';
import '../css/custom.css';





const Modal = ({ handleClose, show, children }) => {
    const showHideClassName = show ? "modal d-block" : "modal d-none";

    return (


        <div className={showHideClassName}>
            <div className="modal-container">
                {children}
                <div class="module product_notification">
                    <div class="module_body" >
                        <div class="productNotification"><div class="productNotification__header">
                            <h2 class="title-left">Notify me</h2>
                        </div>

                            <div className=" newsletterBar__heading--small">
                                <div className="foot__block foot__block--newsletter footNewsletter">
                                    <div className="container">
                                        <div className="newsletterBar col">


                                            <div class="productNotification__sub ">We currently do not have:</div>
                                            <div class="product__name">XXXXXXXX

                                        </div>
                                            <div class="product__desc">
                                                <div class="productNotification__sub">but soon it can be yours!</div>
                                                <br /> As soon as it goes on sale, we'll notify you. <br />Give us your email address!</div>
                                            <input type="hidden" name="product_notification_confirm" value="true" />
                                            <div class="productNotification__fields">
                                                <div class="productNotification__error product_notification_email_notification ">
                                                    <input type="text" placeholder="Enter e-mail address" name="email_notification" class="textfield clear_input form_field form_textfield" value="" title="Wpisz swój adres e-mail" required="" />
                                                </div>

                                                <div class="cart-and-bay-btn" >

                                                    <a class="btn hvr-hover" href="#"> Send email</a>
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

                    <a class="popupContainer__close"  onClick={handleClose}>
                    <i class="fa fa-window-close" aria-hidden="true"></i>
                    </a>
                </div>
            

            </div>
        </div>

    );
};

export default Modal;