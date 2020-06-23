import React, {useContext, useEffect} from "react";
import Redirect from "react-router-dom/es/Redirect";
import { UserContext } from "./components/User-context";
import {useParams} from "react-router-dom";
export default function Authenticator() {

    let {token} = useParams();
    const context = useContext(UserContext);
    useEffect(() => {
            context.setUser(token)
        }
    );
    return (
        <Redirect to={"/"}/>
    )
}