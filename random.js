const randomButton = document.getElementById('randombutton');

async function getRandom()
{
	const response = await fetch('randfetch.php');
	const htmlrandom = Math.floor(Math.random()*6);
	const phprandom = await response.text();

	document.getElementById('htmlresult').textContent = htmlrandom;
	document.getElementById('phpresult').textContent = phprandom;
}

randomButton.addEventListener('click', getRandom)
window.addEventListener('load', getRandom)

