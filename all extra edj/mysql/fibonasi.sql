declare
a int ;
b int ;
c int ;
d int ;
begin
a := 1;
b := 1;
c := &c;
d := 1;
dbms_output.put_line('0');
dbms_output.put_line('1');
for d in 1 .. c loop
b := a-b;
a := a+b;

dbms_output.put_line(a);

end loop;
end;
/
