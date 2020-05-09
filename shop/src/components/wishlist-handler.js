export function addToWishlist(user, product) {
    var myHeaders = new Headers();
    myHeaders.append('Content-Type', 'application/json');
    myHeaders.append('Access-Control-Allow-Origin','*');
    myHeaders.append('Access-Control-Allow-Headers','*');

    let fav = {"user":user,"product":product};
    console.log("SENDING" +JSON.stringify(fav));
    fetch("http://localhost:9000/wishlist", {
        method: "POST",
        headers:myHeaders,
        mode:"cors",
        body: JSON.stringify(fav)
    }).then(response => console.log("response"  + response));

}