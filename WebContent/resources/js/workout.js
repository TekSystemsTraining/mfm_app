console.log("workout js5 loaded")

function total_exercise(section) {
	var set_total = [];
	var exercise_total;

	for (i = 1; i <= 4; i++) {
		var section_prefix = section + "-" + i;
		if (
			document.getElementById(section_prefix + "-1") == null ||
			document.getElementById(section_prefix + "-2") == null
		) {
			document.getElementById(section_prefix + "-3").value = parseInt(0);
			set_total.push(0);
			continue;
		}
		var input_one = document.getElementById(section_prefix + "-1").value;
		var input_two = document.getElementById(section_prefix + "-2").value;
		if (input_one == 0 || input_two == 0) {
			document.getElementById(section_prefix + "-3").value = parseInt(0);
			set_total.push(0);
			continue;
		} else {
			set_total.push(input_one * input_two);
			document.getElementById(section_prefix + "-3").value = parseInt(
				set_total[i - 1]
			);
		}
	}
	exercise_total = set_total.reduce(function(a, b) {
		return a + b;
	}, 0);
	document.getElementById("ex-total-" + section).innerHTML = parseInt(exercise_total);
}