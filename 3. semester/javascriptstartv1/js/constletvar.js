//Der er 3 JavaScript keywords der bruges til tildeling af variabel

const a = 5
let b = 6
b = "hej"
var c = 5.5

console.log(b)

function testScope() {
    let a1 = "xjeg er lokal"
    var v1 = "jeg var lokal"
    if (a1>v1) {
        let a2 = "a1 var større end v1"
        console.log(a2)
        if (3==3) {
            let a3 = 3
            var v3 = 3.3
            console.log("3=3")
        }
        //console.log(a3)  kan ikke ses her
        console.log(v3) //block scope virker ikke med var
    }
}

testScope()
//console.log(a2) function scope virker
//console.log(v1) function scope virker

