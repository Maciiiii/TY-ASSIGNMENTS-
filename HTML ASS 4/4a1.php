
<?php

$a=$_GET["n1"];
$b=explode(",",$a);
//print_r($b);
$cn=count($b);

foreach($b as $c)
    echo $c."\t";

$sum=0;
/*$wt=0;
$ct=0;
$cnt=0;
$cnt_1;

foreach($b as $c)
{
    $sum+=$c;
    if($c >=50 and $c<=60)
    {
        $wt+=$c;
        $cnt++;
    }
    
    if($c >=-5 and $c<=5 )
    {
        $ct+=$c;
        $cnt_1++;
    }
}
        
echo "<br>";
echo " Avg high temp is : ".$sum/$cn;
echo "<br>";
echo " Avg warmist temp is : ".$wt/$cnt;
echo "<br>";
echo " Avg collest temp is : ".$ct/$cnt_1;
*/
echo "<br>";

foreach($b as $c)
{
    $sum+=$c;
   
    if($c >=50 and $c<=60)
        $w[]=$c;
        
   // echo "ct";
   // echo "<br>";
    
    else if($c >=-5 and $c<=5 )
            $k[]=$c;
        
}

print_r($w);
echo"<br>";
print_r($k);



?>