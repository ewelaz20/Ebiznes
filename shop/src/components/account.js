
import React, { Component } from "react";

import '../css/bootstrap.min.css';
import '../css/style.css';
import '../css/responsive.css';
import '../css/newsletter.css';
import '../css/custom.css';


import img1 from '../images/marynarki/marynarka1.jpg';
import img2 from '../images/marynarki/marynarka2.jpg';
import img3 from '../images/spodnie/spodnie1.jpg';

export default class Cart extends Component {
    render() {
        return (


            <div class="container orderContainer">
                <div id="order" class="ajax_reload">

                    <div class="order_wrap order_dashboard_wrap flex justify_bettwen">

                        <div class="order_dashboard_left">
                            <div class="dashboard_menu br border_color">
                                <div class="menu_head"><strong>My account</strong></div>
                                <div class="menu_body -textLeft"><ul>
                                    <li class="active"><a href="#" class="iconset"><span>My data</span></a></li>
                                    <li><a href="#" class="iconset"><span>Delete account</span></a></li>
                                    <li><a href="#" class="iconset"><span>Logout</span></a></li>
                                </ul>
                                </div>
                            </div>
                        </div>

                        <div class="order_dashboard_right">
                            <div class="order_form_wrap border_color form_bg">
                                <div class="order_form_gap"><div class="order_form_header border_color"><strong>My data</strong>
                                </div>
                                    <form method="post" id="no-register-form" class="order-form" action="#">
                                        <input type="hidden" name="no-register" value="" />

                                        <div class="order_inputs_wrap">
                                            <div class="field_wrap ">
                                                <label><span class="text">First Name <span class="attention_color">*</span></span>
                                                    <input type="text" name="name" autofocus="true" class=" order_textfield br" value="Ewelina" autocomplete="given-name" required="" />
                                                </label>
                                            </div>
                                            <div class="field_wrap "><label><span class="text">Last Name <span class="attention_color">*</span></span>
                                                <input type="text" name="surname" class=" order_textfield br" value="Zięblińska" autocomplete="family-name" required="" />
                                            </label></div>
                                            <div class="field_wrap ">
                                                <label><span class="text">Address<span class="attention_color">*</span></span><input type="text" name="address" class=" order_textfield br" value="" />
                                                </label>
                                            </div>
                                            <div class="field_wrap ">
                                                <label><span class="text">Address 2<span class="attention_color">*</span></span>
                                                    <input type="text" name="adress" class=" order_textfield br" value="Gołcza 27" autocomplete="street-address" required="" /></label>
                                            </div>
                                            <div class="field_wrap ">
                                                <label><span class="text">ZIP <span class="attention_color">*</span></span>
                                                    <input type="text" name="post_code" class=" order_textfield br" value="32-075" autocomplete="postal-code" required="" /></label>
                                            </div>
                                            
                                            <div class="field_wrap ">
                                                <label><span class="text">Phone <span class="attention_color">*</span></span>
                                                    <input type="tel" name="phone" class=" order_textfield br" value="518745236" autocomplete="tel" required="" /></label>
                                            </div>
                                            <div class="field_wrap ">
                                                <label><span class="text">Email <span class="attention_color">*</span></span>
                                                    <input type="email" name="email" class=" order_textfield br" value="ewelzieblinska@interia.eu" autocomplete="email" required="" /></label>
                                            </div>
                                            <br/>
                                            <hr/>
                                            
                                            
                                        </div>

                                        <div class="order_inputs_wrap">
                                        <div class="order_form_header border_color"><strong>Shipping Address</strong>
                                            </div>
                                            <div class="field_wrap ">
                                            <label><span class="text">First Name <span class="attention_color">*</span></span>
                                                <input type="text" name="name" autofocus="true" class=" order_textfield br" value="Ewelina" autocomplete="given-name" required="" />
                                            </label>
                                        </div>
                                        <div class="field_wrap "><label><span class="text">Last Name <span class="attention_color">*</span></span>
                                            <input type="text" name="surname" class=" order_textfield br" value="Zięblińska" autocomplete="family-name" required="" />
                                        </label></div>
                                        <div class="field_wrap ">
                                            <label><span class="text">Address<span class="attention_color">*</span></span><input type="text" name="address" class=" order_textfield br" value="" />
                                            </label>
                                        </div>
                                        <div class="field_wrap ">
                                            <label><span class="text">Address 2<span class="attention_color">*</span></span>
                                                <input type="text" name="adress" class=" order_textfield br" value="Gołcza 27" autocomplete="street-address" required="" /></label>
                                        </div>
                                        <div class="field_wrap ">
                                            <label><span class="text">ZIP <span class="attention_color">*</span></span>
                                                <input type="text" name="post_code" class=" order_textfield br" value="32-075" autocomplete="postal-code" required="" /></label>
                                        </div>
                                        
                                        <div class="field_wrap ">
                                            <label><span class="text">Phone <span class="attention_color">*</span></span>
                                                <input type="tel" name="phone" class=" order_textfield br" value="518745236" autocomplete="tel" required="" /></label>
                                        </div>
                                        <div class="field_wrap ">
                                            <label><span class="text">Email <span class="attention_color">*</span></span>
                                                <input type="email" name="email" class=" order_textfield br" value="ewelzieblinska@interia.eu" autocomplete="email" required="" /></label>
                                        </div>
                                        </div>
                                        <div class="order_inputs_wrap">
                                        <div class="order_form_header border_color"><strong>Dane do faktury</strong></div>
                                            <div class="field_wrap full"><label><span class="text">Nazwa firmy lub&nbsp;imię i&nbsp;nazwisko
                                                            <span class="attention_color">*</span></span>
                                                <input type="text" name="invoice_name" class="invoice invold  required_invoice  order_textfield br" value="" /></label>
                                            </div>
                                            <div class="field_wrap "><label><span class="text">Ulica, numer <span class="attention_color">*</span></span>
                                                <input type="text" name="invoice_adress" class="invoice invold  required_invoice  order_textfield br" value="" /></label>
                                            </div>
                                            <div class="field_wrap "><label><span class="text">Kod pocztowy <span class="attention_color">*</span></span>
                                                <input type="text" name="invoice_post_code" class="invoice invold  required_invoice  order_textfield br" value="" /></label>
                                            </div>
                                            <div class="field_wrap "><label><span class="text">Miejscowość <span class="attention_color">*</span></span>
                                                <input type="text" name="invoice_city" class="invoice invold  required_invoice  order_textfield br" value="" /></label>
                                            </div>
                                            <div class="field_wrap "><label><span class="text">NIP <span class="attention_color">*</span></span>
                                                <input type="tel" name="invoice_nip" id="invoice_nip" class="invoice invold  required_invoice  order_textfield br" value="" /></label>
                                            </div>
                                            <div class="field_wrap full"><label>
                                                <span class="text">Imię i&nbsp;nazwisko <span class="attention_color">*</span></span>
                                                <input type="text" name="invpri_name" class="invoice invpri  required_invoice  order_textfield br" value="" /></label>
                                            </div>
                                            <div class="field_wrap "><label><span class="text">Ulica, numer <span class="attention_color">*</span></span>
                                                <input type="text" name="invpri_adress" class="invoice invpri  required_invoice  order_textfield br" value="" /></label>
                                            </div>
                                            <div class="field_wrap "><label><span class="text">Kod pocztowy <span class="attention_color">*</span></span>
                                                <input type="text" name="invpri_post_code" class="invoice invpri  required_invoice  order_textfield br" value="" /></label>
                                            </div>
                                            <div class="field_wrap "><label><span class="text">Miejscowość <span class="attention_color">*</span></span>
                                                <input type="text" name="invpri_city" class="invoice invpri  required_invoice  order_textfield br" value="" /></label>
                                            </div>
                                        </div>
                                        <div class="submit_row_columns">
                                            <div class="submit_row_submit">
                                            </div>
                                            <div class="submit_row_submit">
                                                <label class="order_button br trans_bg next">
                                                    <input type="submit" name="save" class="-hide" />
                                                    <span class="order_button_content_wrap">Zapisz</span>
                                                </label>
                                            </div></div></form>
                                </div></div>	</div>

                    </div>
                </div>
            </div>



        );
    }
}

