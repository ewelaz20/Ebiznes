export function addToWishlist(user, product) {
    fetch("http://localhost:9000/fav/"+product, {
        method: "POST",
        mode:"cors",
        headers: {
            'Content-Type': 'application/json',
            'X-Auth-Token' : user
        }
    }).then(response => console.log("response"  + response));

}