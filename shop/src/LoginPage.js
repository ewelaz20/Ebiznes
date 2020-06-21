import React from 'react';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import './css/search.css';


import Newsletter from "./components/Newsletter";
import Footer from "./components/Footer"
import Login from "./components/Login"
import Header from "./components/Header"


class LoginPage extends React.Component {
    constructor(props) {
        super(props);
    }
    render() {
        return (
            <div className="App">
                <Header></Header>
                <Login />

                <Newsletter></Newsletter>
                <Footer></Footer>

            </div>
        )
    }
}

export default LoginPage;