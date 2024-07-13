declare
a int ;
b int ;
begin
a := &a ;
b := &b ;
if a > b then
dbms_output.put_line(a || ' is a greter then ' || b);
else
dbms_output.put_line(b	 || ' is a greter then ' || a);
end if ;
end;
/
