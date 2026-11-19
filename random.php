<! DOCTYPE html>
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" href="style.css">
<title>PHP Test</title>
</head>
<body>
<p>PHPの乱数: <span id="phpresult">
<?php
$min = 0;
$max = 5;
echo rand($min, $max);
?>
</span></p>
ボタンを押してください
<button id ="randombutton" type="button">Click!</button>
<p>HTMLの乱数: <span id = "htmlresult"></span></p>
<script src="random.js">
</script>
</body>
</html>
