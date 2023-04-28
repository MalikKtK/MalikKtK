const urlPostProduct = "http://localhost:8080/product";
console.log(urlPostProduct);
document.addEventListener("DOMContentLoaded", createFormListener);
let formProduct;

function createFormListener() {
    formProduct = document.getElementById("product-form");
    formProduct.addEventListener("submit", handleFormSubmit);
}

async function handleFormSubmit(event) {
    //vi handler submit eventet, så vi kan stoppe default browser behaviour
    event.preventDefault();
    const formData = new FormData(formProduct);
    console.log(formData);
    const jsonData = convertFormDataToJson(formData);
    console.log(jsonData);
    try {
        await postProduct(urlPostProduct, jsonData);
        alert("Produktet er oprettet");
        location.reload();

    } catch (error) {
        alert(error.message);
        console.log(error);
    }
}

function convertFormDataToJson(formData) {
    const plainFormData = Object.fromEntries(formData.entries());
    return JSON.stringify(plainFormData);
}

async function postProduct(url, jsonData) {
    const response = await fetch(urlPostProduct, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: jsonData
    });
    console.log(response);
    const data = await response.json();
    console.log(data);
}