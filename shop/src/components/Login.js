import React, {Component} from "react";
import '../css/newsletter.css';
import '../css/custom.css';
import '../css/social.css'
import {Redirect, withRouter} from "react-router-dom";
import {UserContext} from "./User-context";

 class Login extends Component {
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
        this.provider = this.provider.bind(this);

    }

    handleLoginSubmit() {
        fetch("http://localhost:9000/auth/login",
            {
                mode: 'cors',
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify({
                    email: this.state.mail,
                    password: this.state.password
                })
            })
            .then(result => result.json())
            .then(data => {
                this.context.setUser(data.token);
                this.props.history.push("/")
            })


    }

    handleChange(event) {
        this.setState({[event.target.name]: event.target.value})
    }

    provider(providerName) {
        window.location = 'http://localhost:9000/auth/provider/' + providerName;
    }

    render() {
        if (this.context.user !== null) {
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


                                            <input class="order_button br next trans_bg"
                                                   onClick={() => this.handleLoginSubmit()}
                                                   value="Sign in "/>
                                            <div className="content">
                                                <a onClick={() => this.provider("facebook")}> <i
                                                    className="fa fa-facebook-official fa-3x"
                                                    aria-hidden="true"></i></a>
                                                <a onClick={() => this.provider("google")}><i
                                                    className="fa fa-google-plus-square fa-3x"
                                                    aria-hidden="true"></i></a>
                                            </div>
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
export default withRouter(Login)


