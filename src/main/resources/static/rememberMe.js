
var paragraaf = document.getElementbyId("paragraaf");


var f = document.getElementById("formulier");
f.addEventListener("submit", function (event) {
    event.preventDefault();

    var bezoeker= f.firstname.value + " " + f.lastname.value;
    localStorage.setItem("bezoeker", bezoeker);
    var name = localStorage.getItem("bezoeker", bezoeker);


    paragraaf.innerHTML = "Thank for letting us know your" + name;
    localStorage.bezoeker = JSON.stringify(bezoeker);



});












