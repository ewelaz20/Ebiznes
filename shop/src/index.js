import React from "react";
import ReactDOM from "react-dom";
import {
    BrowserRouter as Router,
    Switch,
    Route,
    Link
} from "react-router-dom";
import "./index.css";
import LoginPage from "./login-page";
import WishlistPage from "./wishlist-page";
import Checkout from "./checkout-page"
import CreateAccount from "./create-account"
import CartP from "./cart-page"
import SinglePage from "./single-page-missing"
import ProductList from "./category"
import CreateAccountPage from "./create-account"
import CategoryPage from "./category"
import {UserContext, user} from "./components/user-context";
import FrontPage from "./FrontPage.js"

import * as serviceWorker from "./serviceWorker";

class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            user: localStorage.getItem("user"),
            setUser:this.setUser
        };


    }

    setUser = (usr) => {
        console.log("set function launched");
        localStorage.setItem("user",usr);
        this.setState(({
            user: usr
        }));
    };

    render() {
        return (
            <UserContext.Provider value={this.state}>
            <Router>
                <Switch>
                    <Route exact path="/main" component={FrontPage}/>

                    <Route path="/categories/:id" component={CategoryPage}/>
                    <Route path="/product/:id" component={SinglePage}/>
                    <Route path="/register" component={CreateAccountPage}/>
                    <Route path="/cart" component={CartP}/>
                    <Route path="/wishList">
                        <WishlistPage/>
                    </Route>
                    <Route path="/">

                        <LoginPage />

                    </Route>
                </Switch>
            </Router>
            </UserContext.Provider>
        );
    }

}

ReactDOM.render(
    <App/>
    ,
    document.getElementById("root")
);

serviceWorker.unregister();
