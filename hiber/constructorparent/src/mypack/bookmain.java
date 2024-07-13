package mypack;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class bookmain {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
			
		
		bookdao x=(bookdao)ctx.getBean("ob");
			
		
	     /*	Book b1=new Book(112,"C++",300);
				int status=x.save(b1);
				System.out.println("inserted,"+status); 
			
			/*	int status=x.update1(new Book(112,"C",200));
				System.out.println("updated,"+status); */
				
		/*	int status=x.delete1(new Book(112,"C",200));
				System.out.println("deleted,"+status); */
				
				x.show();

			}
	

}
