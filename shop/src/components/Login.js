import React, {Component} from "react";
import '../css/newsletter.css';
import '../css/custom.css';

import {Redirect} from "react-router-dom";
import {UserContext} from "./User-context";

export default class Login extends Component {
    static contextType = UserContext;

    constructor(props) {
        super(props);
        this.state = {
            mail: "",
            password: "",
            authenticated: false
        };


        this.handleChange = this.handleChange.bind(this);
        this.handleLoginSubmit = this.handleLoginSubmit.bind(this);
    }

    handleLoginSubmit() {
        console.log({mail: this.state.mail, password: this.state.password});
        fetch('http://localhost:9000/login', {
            mode: 'cors',
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({mail: this.state.mail, password: this.state.password})
        }).catch(err => console.log("Error while authenticating " + err))
            .then(response => {
                    response.clone().json().then(value => this.context.setUser(value.id))

                }
            );


    }

    handleChange(event) {
        this.setState({[event.target.name]: event.target.value})
    }

    render() {
        if (this.context.user !== null) {
            console.log("USEEEEEEEER" + this.context.user);
            return <Redirect to='/main'/>
        }

        return (

            <div class="container orderContainer">
                <div id="order" class="ajax_reload">

                    <div class="order_form_wrap border_color form_bg">
                        <div class="order_form_gap">
                            <div class="order_form_header border_color">
                                <strong>Sign in</strong>
                                <span class="gray_color">Your account for everything</span>
                            </div>
                            <form>
                                <fieldset>
                                    <input type="hidden" name="log_in" value="order"/>
                                    <legend class="sr">Logowanie</legend>
                                    <div class="order_inputs_wrap">
                                        <div class="field_wrap full">
                                            <label>
                                                    <span class="text">E-mail<span
                                                        class="attention_color">*</span></span>
                                                <input class="order_textfield br" value={this.state.mail}
                                                       onChange={this.handleChange}
                                                       aria-label="E-mail lub&nbsp;login"
                                                       name="mail" type="text" required/>
                                            </label>
                                        </div>
                                        <div class="field_wrap full">
                                            <label>
                                                    <span class="text">Password <span
                                                        class="attention_color">*</span></span>
                                                <input class="order_textfield br" value={this.state.password}
                                                       onChange={this.handleChange} name="password" type="password"
                                                       required/>
                                            </label>
                                        </div>
                                    </div>
                                    <div class="submit_row_columns">
                                        <div class="submit_row_others">
                                            <strong class="attention_color">*</strong> Required<br/>
                                            <a href="/register" class="attention_color trans_color">Dont't have an
                                                account?
                                                Register here!</a><br/>
                                        </div>
                                        <div class="submit_row_submit submit_row_submit-fb">
                                            {/* <a id="facebook-button" className="btn  btn-social btn-facebook">
                                            <i class="fa fa-facebook-official fa-3x" aria-hidden="true"></i>
                                            </a>
                                            <a id="google-button" className="btn  btn-social ">
                                            <i className="fa fa-google fa-3x" aria-hidden="true"></i>
                                            </a> */}
                                           

                                            <input class="order_button br next trans_bg"
                                                   onClick={() => this.handleLoginSubmit()}
                                                   value="Sign in "/>
                                        </div>
                                    </div>

                                </fieldset>
                            </form>
                        </div>
                    </div>
                </div>
            </div>


        );
    }

}


