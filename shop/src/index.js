import React from "react";
import ReactDOM from "react-dom";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
// import "./index.css";
import LoginPage from "./LoginPage";
import WishlistPage from "./WishlistPage";
import Checkout from "./CheckoutPage"
import CartP from "./CartPage"
import SinglePage from "./SinglePage"
import CreateAccountPage from "./CreateAccountPage"
import CategoryPage from "./CategoryPage"
import { UserContext } from "./components/User-context";
import FrontPage from "./FrontPage.js"
import User from "./UserPage"

import * as serviceWorker from "./serviceWorker";
import Redirect from "react-router-dom/Redirect";
import 'font-awesome/css/font-awesome.css';
import AuthRoute from "./components/AuthRoute"
import Authenticator from "./Authenticator";

class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            user: localStorage.getItem("user"),
            setUser: this.setUser,
            cart: this.cart(),
            pushToCart: this.pushToCart,
            removeFromCart: this.removeFromCart,
            logout: this.logout
        };


    }

    setUser = (usr) => {
        localStorage.setItem("user", usr);
        this.setState(({
            user: usr
        }));
    };

    logout = () => {
        localStorage.clear();
        return (<Redirect to='/main' />)

    };

    cart() {
        let cart = JSON.parse(localStorage.getItem("cart"));
        return cart !== null ? cart : []
    }

   

    pushToCart = (product) => {
        let index = this.state.cart.findIndex(val => val.id === product.id);
        if (index === -1) {
            this.setState(({
                cart: [...this.state.cart, product]
            }), () => {
                let cart = [...this.state.cart];
                cart[index] = product;
                localStorage.setItem("cart", JSON.stringify(this.state.cart))

            });
        }

    };
    removeFromCart = (product) => {
        this.setState(({
            cart: [...this.state.cart].filter(val => val.id !== product.id)
        }), () =>
                localStorage.setItem("cart", JSON.stringify(this.state.cart)));
    };

    render() {
        return (
            <UserContext.Provider value={this.state}>
                <Router>
                    <Switch>
                        <Route exact path="/main" component={FrontPage} />
                        <Route path="/categories/:id" component={CategoryPage} />
                        <Route path="/product/:id" component={SinglePage} />
                        <Route path="/register" component={CreateAccountPage} />
                        <Route path="/cart" component={CartP} />
                        <Route path={"/auth/successful/:token"} component={Authenticator}/>
                        <AuthRoute component={() => <Checkout />} path="/checkout" />
                        <AuthRoute component={() => <User />} path="/user" />
                        <AuthRoute component={() => <WishlistPage />} path="/wishList" />
                        <Route path="/login" component={LoginPage} />
                        <Route path="/" component={FrontPage}>
                        </Route>
                    </Switch>
                </Router>
            </UserContext.Provider>
        );
    }

}

ReactDOM.render(
    <App />
    ,
    document.getElementById("root")
);

serviceWorker.unregister();
