function dayComponent(day) {
	let monthDays = [];
	let days = "";

	for ( let i = 0; i < day; i++) {
		monthDays.push(i+1);
	}

	for (const day of monthDays) {
		days +=
		`
		<div class="day">
			${day}
		</div>
		`;
	}
	return days;
}
function monthComponent(monthName, monthShort, monthLength) {
	return `
	<section class="month ${monthShort}">
		<h2>${monthName}</h2>
		<div class="days">
			${dayComponent(monthLength)}
		</div>
	</section>
	`;
}

function loadEvent() {

	//console.log(months);

	const rootElement = document.getElementById("root");

	for (let i = 0; i < months.length; i++) {
		let monthName = months[i].month;
		let monthShort = months[i].id;
		let monthdays = months[i].days;
		rootElement.insertAdjacentHTML("beforeend", monthComponent(monthName, monthShort, monthdays));
	}
}

window.addEventListener("load", loadEvent);