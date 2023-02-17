const fruits = ["æbler", "pærer", "bannaner", 'juice']

function myFunc1(item) {
    const ptag = document.getElementById("demo")
    console.log(ptag)
    ptag.innerHTML += item + "<br>";
}

function myFunc2(item, index) {
    const ptag = document.getElementById("demo")
    ptag.innerHTML += "<br>" + index + ":" + item

}

fruits.forEach(myFunc2)

