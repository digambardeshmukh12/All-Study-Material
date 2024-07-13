declare
a int;
b int;
c int;
begin
a:=&a;
b:=1;
for c in 1 .. a loop
b:=b*c;
end loop;
dbms_output.put_line('Factorial of a ' || a || ' is ' || b); 
end;
/