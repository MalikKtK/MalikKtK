console.log("Hello")
function showtime() {
    var dt = new Date()
    console.log(dt)
}
showtime()
setInterval(showtime, 1000);