Formula

Given n = 19

Part 1)
Find the largest power of 2 <= n, it is 16
You can use a while loop 

Part 2) 
power is a value that we need to show 
in the form of base 2 at the place of its exponent 
for 16 its the 5th from right to left.

n represent whats left to cover
power represent what we can still use to cover the n 

1. once the power is already shown we can
subtract it from the n and divide it by 2
because next available power to show is power/2 like 8 = 2^3

while(power>0){
if(n<power){
print 0
}
else{
print 1
n-=power;	
}
power/=2;
}