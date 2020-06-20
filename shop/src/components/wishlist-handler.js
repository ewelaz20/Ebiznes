export function addToWishlist(user, product) {
    let fav = {"user":user,"product":product};
    console.log("SENDING" +JSON.stringify(fav));
    fetch("http://localhost:9000/fav/"+user+"/"+product, {
        method: "POST",
        mode:"cors",
        body: JSON.stringify(fav)
    }).then(response => console.log("response"  + response));

}