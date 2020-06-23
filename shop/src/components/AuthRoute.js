import React, { useContext } from "react";
import { Route, Redirect } from "react-router-dom";

import { UserContext } from "./User-context";

const AuthRoute = ({ component: Component, ...rest }) => {
    const { user } = useContext(UserContext);

    return (
        <Route
            {...rest}
            render={(props) =>
                user!==null  ? (
                    <Component {...props} />
                ) : (
                    <Redirect to="/login" />
                )
            }
        />
    );
};

export default AuthRoute;