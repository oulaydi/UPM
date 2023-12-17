const express = require("express");
const port = 3001;
let db = require('./db');

console.log(db);

// Express app
const app = express();

// Port
app.listen(port);

// MiddleWare, static file
app.use(express.static("public"));

app.get("/", (req, res) => {
    res.sendFile("./views/index.html", { root: __dirname });
});

app.get("/index.html", (req, res) => {
    res.sendFile("./views/index.html", { root: __dirname });
});

app.get("/about", (req, res) => {
    res.sendFile("./views/about.html", { root: __dirname });
});

// Redirects
app.get("/about-us", (req, res) => {
    res.redirect("/about");
});

app.use((req, res) => {
    res.sendFile("./views/404.html", { root: __dirname });
});
