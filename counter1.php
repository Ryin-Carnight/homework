<?php 
$counter_file = "counter.txt";
$counter_lenght = 8;
$fp = fopen($counter_file, 'r+')

if($fp){
	if(flock($fp, LOCK_EX)){
	
	$counter = fgets($fp, $counter_lenght);

	$counter = $counter + 1;

	rewind($fp);

	if(fwrite($fp, $counter) === FALSE){
		print('ファイル書き込み、失敗！');
	}

	flock($fp, LOCK_UN);
		
	}
}

fclose($fp);

print('count: ' .$counter);

?>

function lock(){
	while(1){
		if(@mkdir ("lock", 0777)){
		break;
		}else{
		sleep(1);
		}
	}
}

function unlock(){
	@rmdir ("lock");
}