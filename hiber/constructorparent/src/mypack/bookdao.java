package mypack;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.*;
import java.sql.*;

public class bookdao {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int save(Book b)
	{
		String q="insert into book values("+b.getBid1()+",'"+b.getBname1()+"',"+b.getBprice1()+")";
		return jdbcTemplate.update(q);
	}
	public int update1(Book b)
	{
		String q="update book set Bname='"+b.getBname1()+"',Bprice="+b.getBprice1()+" where Bid="+b.getBid1()+"";
		return jdbcTemplate.update(q);
	}

	public int delete1(Book b)
	{
		String q="delete from book where Bid="+b.getBid1()+"";
		return jdbcTemplate.update(q);
	}
	
	public void show()
	{
		List <Book>li=new ArrayList<Book>();
		
			jdbcTemplate.query("select * from book",new RowMapper() {
					@Override
					public Object mapRow(ResultSet rs, int count) throws SQLException 
					{
						Book e=new Book();
						e.setBid1(rs.getInt(1));
						e.setBname1(rs.getString(2));
						e.setBprice1(rs.getInt(3));
						li.add(e);
						return e;
					}
				});
		
		
				for(Book ob:li)
				{
					System.out.println(ob);
				}
		
	}

}
