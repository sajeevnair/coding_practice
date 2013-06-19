<?php
/**
* This interface represents the ability to take 2 integers as input,
* perform some arithmetic operation on them, and return a resulting integer
*/
interface iBinaryOperator
{
/**
* This will take int $x and int $y and return an integer value or
* throw an exception
*
* @param int $x
* @param int $y
* @return int the value of the binary operation of $x and $y
* @throws MathException
*/
public function calc($x, $y);
}
class Addition implements iBinaryOperator{
   
    public function calc($x, $y) {
        return $x+$y;
    }
   
}

class Multiplication implements iBinaryOperator{
    
    public function calc($x, $y) {
        return $x*$y;
    }
    
}
class Division implements iBinaryOperator{
    
    public function calc($x, $y) {
        if($y==0)
            throw new Exception("Division by zero");
        return $x/$y;
    }
   
}
class Substraction implements iBinaryOperator{
    
    public function calc($x, $y) {
       
        return $x-$y;
    }
   
}
/**
* This function should go through the array of operands and run calc on each
* operand IN ORDER, then return the accumulated value.
*
* For example the code below would echo the value 10:
*
* $op = new Addition(); // class Addition implements iBinaryOperator
* $operands = array(5,2,3);
* echo accumulate($op, $operands); // outputs 10
*
* This function should work for ANY size array of operands, and ANY class
* that implements iBinaryOperator
*
* @param iBinaryOperator $op
* @param array $operands array of integers of size N, can be empty
*
* @return int|string returns an int on successful accumulation, or
* the string 'error' in error conditions
*/
$operands = array(5,2,3);
$op = new Addition();
$operands2 = array(5,2,3);
$op2 = new Multiplication();
$operands3 = array(100,25,2);
$op3 = new Division();
$operands4 = array(100,50,25);
$op4 = new Substraction();

function accumulate(iBinaryOperator $op, array $operands)
{
// Add PHP, Java, JavaScript, C++, or C code here
    $result = $operands[0];
    for($i=1; $i<sizeof($operands);$i++){
       $result = $op->calc($result, $operands[$i]);
       
       
    }
    return $result;
    
}
echo accumulate($op, $operands);
echo '<br />';
echo accumulate($op2, $operands2);
echo '<br />';
echo accumulate($op3, $operands3);
echo '<br />';
echo accumulate($op4, $operands4);
