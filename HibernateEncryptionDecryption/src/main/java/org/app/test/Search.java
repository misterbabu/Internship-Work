package org.app.test;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.*;

import org.app.model.Student;
import org.app.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Search {

public static void main(String[] args) throws UnsupportedEncodingException {
		
		Transaction tx=null;
		
		try(Session ses=HibernateUtil.getSf().openSession()){
			tx=ses.beginTransaction();
			System.out.println("Enter the Student Id");
			Scanner sc = new Scanner(System.in);
			int student_id = sc.nextInt();
			
			Student stid=ses.load(Student.class, student_id);
				
				String id = stid.getStudPanId();
				byte[] decodeArr = Base64.getDecoder().decode(id);
				String decode = new String(decodeArr,"UTF-8");
				System.out.println("Decrypted Pan Number : "+decode);
			
				
			
		}catch (Exception ex) {
			System.out.println("Id not found");
			ex.printStackTrace();
		}
	}
}
