package com.app.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.core.Customer;
import com.app.utils.CMSValidations;

public class CMSApplication {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase
			boolean exit = false;
			// init D.S
			List<Customer> customerList = new ArrayList<>(); // size:0 cap:10
			
				while (!exit) {
					System.out.println(
							"\nEnter 1.Sign up \n2.Sign in \n3.Change password \n4.Un subscribe customer \n5.Display all customers \n0.Exit ");
					System.out.println("Choose");
					try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println(
								"Enter :- firstname, lastname, email, password, registrationAmount, birth date, ServicePlan ");
						Customer customer = CMSValidations.validateCustomerInputs(sc.next(), sc.next(), sc.next(),
								sc.next(), sc.nextDouble(), sc.next(), sc.next(), customerList);
						customerList.add(customer);
						System.out.println("Account created ...");
						break;

					case 2:
						System.out.println("Enter Your email & password");
						CMSValidations.checkEmailAndPasswdToSignin(sc.next(),sc.next(),customerList);
						

						break;

					case 3:

						break;

					case 4:

						break;

					case 5:

						break;

					default:
						exit = true;
						break;
					}
					} catch (Exception e) {
						sc.nextLine();
						e.printStackTrace();
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
