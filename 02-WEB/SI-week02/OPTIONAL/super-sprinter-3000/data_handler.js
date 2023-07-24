const csv = require("csvtojson"); //parsing csv into json
const createCsvWriter = require("csv-writer").createObjectCsvWriter;

const getUserStories = async function () {
	return await csv().fromFile("data.csv");
};

module.exports = {
	getUserStories,
};
