declare
a int;
b int;
c int;
begin
a:=&a;
b:=&b;
dbms_output.put_line('Before Swapping value of a '  ||a || ' and b '||b );

c:=a;
a:=b;
b:=c;
dbms_output.put_line('After Swapping value of a '  ||a || ' and b '||b );
end;
/