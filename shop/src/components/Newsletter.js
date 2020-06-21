import React, { Component } from "react";
import '../css/newsletter.css';

export default class Newsletter extends Component {
    constructor(props) {
        super(props);
        this.state = {
            mail: ""
        };
        this.handleChange = this.handleChange.bind(this);
        this.subscribeToNewsletter = this.subscribeToNewsletter.bind(this);
    }

    subscribeToNewsletter() {
        fetch("http://localhost:9000/addToNewsletter/" + this.state.mail, {
            method: "POST"
        }).catch(err => console.log(err))
    }

    handleChange(event) {
        console.log("EVEEEENT");
        console.log(event.target.value);

        this.setState({
            mail: event.target.value
        });
    }

    render() {
        return (

            <div className=" newsletterBar__heading--small">
                <div className="foot__block foot__block--newsletter footNewsletter">
                    <div className="container">
                        <div className="newsletterBar col">


                            <div className="module newsletter">
                                <div className="module_body module_tpl_newsletter-section">
                                    <div className="newsletterBar__side newsletterBar__side--right grow">
                                        <form className="newsletterBar__form col module_refresh">
                                            <input type="hidden" name="newsletter" />

                                            <h3 className="newsletterBar__heading--big heading">Subscribe our newsletter
                                                now</h3>
                                            <hr />
                                            <div className="newsletterBar__heading--big heading">Get the
                                                <span className="pink"> 5% discount</span> for your purchases!
                                            </div>
                                            <i class="newsletter-box">
                                                <div class="form-group">
                                                    <input class="order_textfield br" value={this.state.mail}
                                                        onChange={this.handleChange}
                                                        aria-label="E-mail lub&nbsp;login"
                                                        name="mail" type="text" required placeholder="Email Address*" />
                                                    <i class="fa fa-envelope"></i>
                                                </div>
                                                <button class="btn hvr-hover"
                                                    onClick={() => this.subscribeToNewsletter()}
                                                    type="submit">Submit

                                                </button>
                                                <br />
                                            </i>
                                            <br />
                                            <hr />
                                            <br />

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



