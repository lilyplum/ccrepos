const express = require("express");
const app = express();
const port = 8000;
app.set("view engine", "ejs");

const { getUserStories } = require("./data_handler");

app.get("/", async (req, res) => {
	const stories = await getUserStories();
	res.render("list", { stories: stories });
});

app.listen(port, () => {
	console.log(`Example app listening on port ${port}`);
});
