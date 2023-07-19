const http = require('http');
const fs = require('fs');

const ip = "127.0.0.1";
const port = 9000;

const packagesString = fs.readFileSync("pkgs.json");
const packagesJSON = JSON.parse(packagesString);
const packages = packagesJSON["packages"];
// console.log(packages);

const dates = checkForNewerDate();
console.log(dates);

const server = http.createServer((request, response) => {

	if (request.url === "/") {
		response.write(
		`<html>
			<body style="text-align:center;">
				<h1 style="color:green;">NPM Package Maintenance Portal</h1>
				<h2>2022-06-01</h2>
			</body>
		</html>`
		)
		response.end();
	} else if (request.url === "/api/packages") {
		response.write(JSON.stringify(packages));
		response.end();
	} else if (request.url === "/api/status/maintained") {
		response.write(JSON.stringify(dates[0]));
		response.end();
	} else if (request.url === "/api/status/abandoned") {
		response.write(JSON.stringify(dates[1]));
		response.end();
	}
	
	//request parameter contains the incoming (request) data from the client side to the server side as an object 
	// console.log(request);
	// console.log(request.method);
	console.log("hello: ",request.url);

	
	//response parameter contains the outgoing (response) data from the server side to the client side as an object 
	// console.log(response);
	
	
	//Write your code here
	//you can read the file with the help of the fs package's readFileSync method and parse the JSON with JSON.parse method

	//Don't forget to close your response
	response.end();
});

server.listen(port, ip, () => {
	const addr = server.address();
	console.log(`http://${addr.address}:${addr.port}`);
});

function checkForNewerDate () {
    let newerDate = [];
    let olderDate = [];

    for (let i = 0; i < packages.length; i++) {
        let JSONdateData = packages[i].releases[0].date;
        let convertedDate = parseFloat(JSONdateData.split("-").join(""));
        let dependenciesToCheck = packages[i].dependencies;

        for(let j = 0; j < dependenciesToCheck.length; j ++) {
            let checkerData = packages[dependenciesToCheck[j] - 1].releases[0].date;
            let convertedCheckerData = parseFloat(checkerData.split("-").join(""));

            if(convertedDate > convertedCheckerData) {
                newerDate.push(packages[i].name);
            } else if (convertedDate < convertedCheckerData) {
                olderDate.push(packages[i].name);
            }
        }
    }

    let filterdNew = new Set(newerDate);
    let filteredOld = new Set(olderDate);
    let finalNewResult = Array.from(filterdNew);
    let finalOldResult = Array.from(filteredOld);
    return [finalNewResult, finalOldResult];
}