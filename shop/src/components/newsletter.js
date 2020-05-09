import React, { Component } from "react";
import '../css/newsletter.css';

export default class Newsletter extends Component {
    render() {
        return (
            
            <div className=" newsletterBar__heading--small">
                <div className="foot__block foot__block--newsletter footNewsletter">
                    <div className="container">
                        <div className="newsletterBar col">


                            <div className="module newsletter">
                                <div className="module_body module_tpl_newsletter-section"  >
                                    <div className="newsletterBar__side newsletterBar__side--right grow" >
                                        <form className="newsletterBar__form col module_refresh" >
                                            <input type="hidden" name="newsletter" />

                                            <h3 className="newsletterBar__heading--big heading" >Subscribe our newsletter now</h3>
                                            <hr />
                                            <div className="newsletterBar__heading--big heading">Get the
                                        <span className="pink"> 5% discount</span> for your purchases!
                                    </div>
                                            <form class="newsletter-box">
                                                <div class="form-group">
                                                    <input class="" type="email" name="Email" placeholder="Email Address*" />
                                                    <i class="fa fa-envelope"></i>
                                                </div>
                                                <button class="btn hvr-hover" type="submit">Submit</button>
                                                <br/>
                                            </form>
                                            <hr />
                                            <br/>
                                            <div className="newsletterBar__accept -textCenter js__accordion">

                                                <input type="checkbox" name="accept" id="NewsletterAgreement" />
                                                <label for="NewsletterAgreement">
                                                    Yes, I would like to subscribe to the Fashion Newsletter. I agree to let EZ Shop process my personal data in order to send me personalised marketing material, in accordance with EZ Shop's
                                                </label>

                                            </div>
                                        </form>
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




