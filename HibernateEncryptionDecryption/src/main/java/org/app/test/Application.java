package org.app.test;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.app.model.Student;
import org.app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class Application {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		Transaction tx=null;
		Scanner sc = new Scanner(System.in);
		final int id1 = sc.nextInt();
		final String panId = sc.nextLine();
		String encode = Base64.getEncoder().encodeToString(panId.getBytes("UTF-8"));
		
		try(Session ses=HibernateUtil.getSf().openSession()){
			tx=ses.beginTransaction();
			
			Student st=new Student();
			st.setStudId(id1);
			st.setStudPanId(encode);
			
			ses.save(st);
			tx.commit();
			List listst = ses.createQuery("from Student s").list();
			Iterator it=listst.iterator();
			while(it.hasNext()) {
				Object obj=(Object)it.next();
				Student stid=(Student)obj;
				
				System.out.println("Encrypted Pan Number : "+stid.getStudPanId());
				String id = stid.getStudPanId();
				byte[] decodeArr = Base64.getDecoder().decode(id);
				String decode = new String(decodeArr,"UTF-8");
				System.out.println("Decrypted Pan Number : "+decode);
			}	
			
		}catch (Exception ex) {
			tx.rollback();
			ex.printStackTrace();
		}
		sc.close();
	}
}
