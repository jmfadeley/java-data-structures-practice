const randomOrder = total => {
	let tests = [];
	for (let count = 0; count < total; count++) {
		tests.push(count+1);
	}

	let order = [];
	while (tests.length > 0) {
		order.push(tests.splice(Math.random() * tests.length, 1)[0]);
	}
	return order;
}
