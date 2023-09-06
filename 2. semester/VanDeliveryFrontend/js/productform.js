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
        await actionFetchProducts();
        formProduct.reset();
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

// Fill table with products

const urlGetProducts = "http://localhost:8080/products";
const tableBody = document.getElementById("product-list");

async function createProductTable(product) {
    console.log("Creating table row for product:", product);
    const row = document.createElement("tr");
    row.innerHTML = `
    <td>${product.productId}</td>
    <td>${product.name}</td>
    <td>${product.price}</td>
    <td>${product.weight}</td>
  `;
    cell = row.insertCell(4)
    let pbUpdate = document.createElement("button");
    pbUpdate.textContent = "Update";
    pbUpdate.className = "btn btn-primary";
    pbUpdate.addEventListener("click", function () {
        const prodid = product.productId;
        printProduct(prodid, product);
    });
    cell.appendChild(pbUpdate);
    tableBody.appendChild(row);
}


let lstProducts = [];
async function actionFetchProducts() {
    try {
        const response = await fetch(urlGetProducts);
        const data = await response.json();
        lstProducts = data;
        tableBody.innerHTML = "";
        lstProducts.forEach(createProductTable);
    } catch (error) {
        console.error(error);
    }

}

function printProduct(prodid, product) {
    console.log(prodid, product);
}
