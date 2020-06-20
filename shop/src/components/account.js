import React, {Component} from "react";

import '../css/bootstrap.min.css';
import '../css/style.css';
import '../css/responsive.css';
import '../css/newsletter.css';
import '../css/custom.css';
import {UserContext} from "./user-context";
import Redirect from "react-router-dom/es/Redirect";


export default class Account extends Component {
    static contextType = UserContext;

    constructor(props) {
        super(props);
        this.state = {
            edit: false,
            user: {
                user: "",
                firstName: "",
                lastName: "",
                address: "",
                zip: "",
                phone: "",
                email: "",
            }
        };
        this.handleChange = this.handleChange.bind(this);
        this.submitUserData = this.submitUserData.bind(this);
        this.switchEditMode = this.switchEditMode.bind(this);
        this.isDisabled = this.isDisabled.bind(this);
        this.actionButton = this.actionButton.bind(this);
    }

 


    submitUserData() {
        console.log(this.state.user)
        fetch('http://localhost:9000/user', {
            mode: 'cors',
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(this.state.user)
        }).catch(err => console.log("Error while user page " + err))
    }

    handleChange(event) {
        let user = {...this.state.user};
        user[event.target.name] = event.target.value;

        this.setState({

            firstName: event.target.firstName,
            lastName: event.target.lastName,
            address: event.target.address,
            zip: event.target.zip,
            phone: event.target.phone,
            email: event.target.email,
            user: user
        });
    }

    switchEditMode(e) {
        this.setState({
            edit: !this.state.edit

        })
        e.preventDefault();
    }

    isDisabled() {
        return this.state.edit ? "" : "disabled"
    }

    actionButton() {
        if (this.state.edit === false) {
            return (
                <div class="submit_row_columns">
                    <div class="submit_row_submit">
                    </div>
                    <div class="submit_row_submit">
                        <label class="order_button br trans_bg next">
                            <input name="save" class="-hide"/>
                            <span class="order_button_content_wrap" onClick={(e) => this.switchEditMode(e)}>Edit</span>
                        </label>
                    </div>
                </div>
            )
        } else {
            return (
                <div class="submit_row_columns">
                    <div class="submit_row_submit">
                    </div>
                    <div class="submit_row_submit">
                        <label class="order_button br trans_bg next">
                            <input name="save" class="-hide"/>
                            <span class="order_button_content_wrap" onClick={e => {
                                this.switchEditMode(e);
                                this.submitUserData()
                            }}>Save</span>
                        </label>
                    </div>
                </div>
            )
        }
    }


    render() {


        if (this.context.user == null) {
            return <Redirect to={"/login"}/>
        }
        return (
            <div class="container orderContainer">
                <div id="order" class="ajax_reload">
                    <div class="order_wrap order_dashboard_wrap flex justify_bettwen">
                        <div class="order_dashboard_left">
                            <div class="dashboard_menu br border_color">
                                <div class="menu_head"><strong>My account</strong></div>
                                <div class="menu_body -textLeft">
                                    <ul>
                                        <li class="active"><a href="#" class="iconset"><span>My data</span></a></li>
                                        <li><a href="#" class="iconset"><span>Logout</span></a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>

                        <div class="order_dashboard_right">
                            <div class="order_form_wrap border_color form_bg">
                                <div class="order_form_gap">
                                    <div class="order_form_header border_color"><strong>My data</strong>
                                    </div>
                                    <form>
                                        <div class="order_inputs_wrap">
                                            <div class="field_wrap ">
                                                <label>
                                                    <span class="text">First Name <span class="attention_color">*</span></span>
                                                    <input disabled={this.isDisabled()} type="text" name="firstName"
                                                           class=" order_textfield br" value={this.state.user.firstName}
                                                           onChange={this.handleChange} required/>
                                                </label>
                                            </div>
                                            <div class="field_wrap "><label><span class="text">Last Name <span
                                                class="attention_color">*</span></span>
                                                <input disabled={this.isDisabled()} type="text" name="lastName"
                                                       class=" order_textfield br" value={this.state.user.lastName}
                                                       onChange={this.handleChange} required/>
                                            </label></div>
                                            <div class="field_wrap ">
                                                <label><span class="text">Address<span class="attention_color">*</span></span><input
                                                    disabled={this.isDisabled()} type="text" name="address"
                                                    class=" order_textfield br" value={this.state.user.address}
                                                    onChange={this.handleChange}/>
                                                </label>
                                            </div>

                                            <div class="field_wrap ">
                                                <label><span class="text">ZIP <span
                                                    class="attention_color">*</span></span>
                                                    <input disabled={this.isDisabled()} type="text" name="zip"
                                                           class=" order_textfield br" value={this.state.user.zip}
                                                           onChange={this.handleChange} required=""/></label>
                                            </div>

                                            <div class="field_wrap ">
                                                <label><span class="text">Phone <span
                                                    class="attention_color">*</span></span>
                                                    <input disabled={this.isDisabled()} type="tel" name="phone"
                                                           class=" order_textfield br" value={this.state.user.phone}
                                                           onChange={this.handleChange} autocomplete="tel" required=""/></label>
                                            </div>
                                            <div class="field_wrap ">
                                                <label><span class="text">Email <span
                                                    class="attention_color">*</span></span>
                                                    <input disabled={this.isDisabled()} type="email" name="email"
                                                           class=" order_textfield br" value={this.state.user.email}
                                                           onChange={this.handleChange} autocomplete="email"
                                                           required=""/></label>
                                            </div>
                                        </div>


                                        {this.actionButton()}

                                    </form>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </div>


        );
    }
}

