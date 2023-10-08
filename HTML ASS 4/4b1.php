


<?php
$a=$_GET["n1"];
$el=$_GET["n2"];
$pos=$_GET["n3"];
$b=explode(",",$a);
echo " Array elements are : ";
echo "<br>";
$cn=count($b);
//dusplay array elements
foreach($b as $c)
echo $c."\t";
// insert elements in array
$arr=array_splice($b,$pos,1,$el);
echo "<br>";
echo " Removed elements is :";
foreach($arr as $c)
echo $c."\t";
echo"<br>";
echo "Array with inserted elements is :";
foreach($b as $c)
echo $c."\t";
?>