import React from "react";
import '../css/bootstrap.min.css';
import '../css/style.css';
import '../css/responsive.css';
import '../css/custom.css';
import '../css/newsletter.css';




const WishlistModal = ({ handleClose, show, children, name  }) => {
    const showHideClassName = show ? "modal d-block" : "modal d-none";

    return (


        <div className={showHideClassName}>
            <div className="modal-container">
               
                <div class="module product_notification">
                    <div class="module_body" >
                        <div class="productNotification"><div class="productNotification__header">
                            <h2 class="title-left">Add to wishlist</h2>
                        </div>
                            <div className=" newsletterBar__heading--small">
                                <div className="foot__block foot__block--newsletter footNewsletter">
                                    <div className="container">
                                        <div className="newsletterBar col">
                                            <div class="productNotification__sub ">Product added to wishlist</div>
                                            <div class="product__name">{name}
                                            <br /><br />
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="clear">
                        </div>
                    </div>
                    <a class="popupContainer__close" onClick={handleClose}>
                        <i class="fa fa-window-close" aria-hidden="true"></i>
                    </a>
                </div>


            </div>
        </div>

    );
};

export default WishlistModal;