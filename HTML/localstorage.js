function webstore()
{
if (sessionStorage.clickcount) {
  sessionStorage.clickcount = Number(sessionStorage.clickcount) + 1;
}
 else {
  sessionStorage.clickcount = 1;
}
document.getElementById("result").innerHTML = "You have clicked the button " +
sessionStorage.clickcount + " time(s) in this session.";
}

function local {

if(typeof(storage) != "undefined")
{
localStorage.setItem("uname", "kiran");  

  document.getElementById("result").innerHTML =  localStorage.getItem("uname");  
}
else {
document.getElementById("result").innerHTML = "Sorry, your browser does not support Web Storage.";  

}

}


