import React, {Component} from "react";
import '../css/newsletter.css';
import '../css/custom.css';
import {Redirect} from "react-router-dom";
import {UserContext} from "./user-context";

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

        this.context.setUser(1);
    }

    handleChange(event) {
        this.setState({mail: event.target.mail, password: event.target.password})
    }

    render() {
        if (this.context.user!=1) {
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
                                                       name="login" type="text" required/>
                                            </label>
                                        </div>
                                        <div class="field_wrap full">
                                            <label>
                                                    <span class="text">Hasło <span
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
                                            <a href="/register" class="attention_color trans_color">Dont't have an account?
                                                Register here!</a><br/>
                                        </div>
                                        <div class="submit_row_submit submit_row_submit-fb">


                                            <input class="order_button br next trans_bg"
                                                   onClick={() => this.handleLoginSubmit()}
                                                   type="submit" value="Sign in "/>
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


