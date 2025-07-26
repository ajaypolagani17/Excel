function addPlayer() {
  let player = {
    name: document.getElementById("name").value,
    fatherName: document.getElementById("fatherName").value,
    aadhaar: document.getElementById("aadhaar").value,
    email: document.getElementById("email").value,
    mobile1: document.getElementById("mobile1").value,
    mobile2: document.getElementById("mobile2").value,
    address: document.getElementById("address").value,
    state: document.getElementById("state").value,
    pin: document.getElementById("pin").value,
    bloodGroup: document.getElementById("bloodGroup").value,
    dob: document.getElementById("dob").value
  };

  fetch("http://localhost:8080/submit", {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify(player)
  })
  .then(res => res.text())
  .then(msg => {
    alert(msg);
    document.getElementById("playerForm").reset();
  })
  .catch(err => {
    alert("Error: " + err);
    console.error(err);
  });
}
