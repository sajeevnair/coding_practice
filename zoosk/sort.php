<?php

#Input charecter array
$A = str_split("charecters");


/**
*prints the index of a charecter's occurence 
*@param $A the charecter array
*@param $char the charecter to be searched
*
*/
function print_index(array $A,$char){
	for ($i=0; $i <sizeof($A) ; $i++) { 
		if ($A[$i] == $char) {

			echo "$i\n";
		}
	}


}

/**
*Sort a charecter array by counting
*@param $A the array to be sorted
*@return the sorted array 
*/
function sort_char(array $A){
	$B=array();
	foreach (range(0, sizeof($A)-1) as $x) {
		$B[$x]=0;
		
	}

	# initialize the finite set array
	foreach (range('a', 'z') as $k) {
	 $C[$k]=0;

	}
	# count the occurences of each charecters
	for ($i=0; $i <sizeof($A) ; $i++) { 
		$C[$A[$i]] = $C[$A[$i]]+1;
		
	}


	for ($i='b'; $i !='aa'; $i++) { 
		
		$C[$i]=$C[$i]+$C[chr(ord($i)-1)];
		
	}

	for ($j=sizeof($A)-1; $j >=0 ; $j--) { 
		
		$B[$C[$A[$j]]-1] = $A[$j];
		$C[$A[$j]]--;

	}
return $B;

}

print_index($A,'e');
#initialize result array

echo "<pre>";
print_r($A);
echo "</pre>";

echo "<pre>";
print_r(sort_char($A));
echo "</pre>";


