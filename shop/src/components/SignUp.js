import React, {Component} from "react";

export default class SignUp extends Component {
    constructor(props) {
        super(props);
        this.state = {
            username: "",
            mail: "",
            password: "",
            passwordRepeat: ""
        };
        this.handleChange = this.handleChange.bind(this);
        this.createAccountHandler = this.createAccountHandler.bind(this)
    }

    handleChange(event) {

        this.setState({
            [event.target.name]: event.target.value
        })
    }


    createAccountHandler() {
        console.log(JSON.stringify({username: this.state.username, mail: this.state.mail, password: this.state.password}));
        fetch("http://localhost:9000/signup/" + this.state.username, {
            method: "POST",
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({username: this.state.username, mail: this.state.mail, password: this.state.password})

        }).catch(err => console.log(err))


    }

    render() {
        return (


            <div class="container orderContainer">
                <div id="order" class="ajax_reload">
                    <div class="order_form_wrap border_color form_bg">
                        <div class="order_form_gap">
                            <div class="order_form_header border_color">
                                <strong>Create account</strong>
                            </div>
                            <form method="post" id="no-register-form" class="order-form">
                                <input type="hidden" name="no-register" value="1"/>
                                <fieldset>
                                    <div class="order_inputs_wrap">
                                        <div class="field_wrap "><label>
                                            <span class="text">Username <span
                                                class="attention_color">*</span></span><input type="text"
                                                                                              name="username"
                                                                                              autofocus="true"
                                                                                              class=" order_textfield br"
                                                                                              value={this.state.username}
                                                                                              onChange={this.handleChange}

                                                                                              required/></label></div>
                                        <div class="field_wrap "><label><span class="text">Email <span
                                            class="attention_color">*</span></span><input type="email" name="mail"
                                                                                          class=" order_textfield br"
                                                                                          value={this.state.mail}
                                                                                          onChange={this.handleChange}

                                                                                          required/></label></div>
                                        <div class="field_wrap "><label><span class="text">Password <span
                                            class="attention_color">*</span></span><input type="password"
                                                                                          name="password"
                                                                                          class=" order_textfield br"
                                                                                          value={this.state.password}
                                                                                          onChange={this.handleChange}
                                                                                          required/></label>
                                        </div>
                                        <div class="field_wrap "><label><span class="text">Repeat password <span
                                            class="attention_color">*</span></span><input type="password"
                                                                                          name="passwordRepeat"
                                                                                          class=" order_textfield br"
                                                                                          value={this.state.passwordRepeat}
                                                                                          onChange={this.handleChange}

                                                                                          required/></label></div>
                                    </div>
                                </fieldset>

                                <input type="hidden" name="register_account" value="on"/>


                                <fieldset>
                                    <div class="order_inputs_wrap">
                                        <div class="field_wrap  type_checkbox full">

                                            <label><span class="text"><span class="nice_link"> I declare that I have read the Regulations </span> <span
                                                class="attention_color">*</span></span><input type="checkbox"
                                                                                              name="rodo"
                                                                                              class="input_mask_checkbox checkbox"/><span
                                                class="label"><span
                                                class="attention_color">&#10003;</span></span></label></div>

                                    </div>
                                </fieldset>
                                <div class="submit_row_columns">
                                    <div class="submit_row_submit"></div>
                                    <div class="submit_row_submit"><label class="order_button br trans_bg next"><input
                                        value="Create account" class="-hide"/><span
                                        class="order_button_content_wrap" onClick={this.createAccountHandler}>Create account</span></label>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

        );
    }
}


