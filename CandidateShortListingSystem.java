package logicalstatements;

import java.util.Scanner;

//Nested if else POC
public class CandidateShortListingSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to V-Square Software Solutions!!");
		System.out.println();
		System.out.println("*****Candidate details*****");
		System.out.println("---------------------------");
		System.out.println("Enter Your Name :");
		String name = sc.nextLine();
		System.out.println("Enter Your Age :");
		int age = sc.nextInt();
		System.out.println("Enter Highest Qualification :");
		sc.nextLine();
		String qualification = sc.nextLine().toLowerCase();
		System.out.println("Enter Your Specialization:");
		String spec = sc.nextLine().toLowerCase();
		System.out.println("Enter Passed out Year :");
		int passOutYear = sc.nextInt();
		System.out.println("Enter Your Percentage :");
		double percentage = sc.nextDouble();
		System.out.println("Do You have any backlogs?(yes/no)");
		String backlogs = sc.next().toLowerCase();
		System.out.println("Enter your skills :");
		sc.nextLine();
		String skills = sc.nextLine().toLowerCase();
		System.out.println("Expected salary(LPA) :");
		double expectedSalary = sc.nextDouble();
		if (age >= 18 && age <= 30) {
			if (qualification.contains("btech") || qualification.contains("b.tech") || qualification.contains("degree")
					|| qualification.contains("pg") || qualification.contains("mtech")) {
				if (spec.contains("cse") || spec.contains("it") || spec.contains("computers") || spec.contains("bcom")
						|| spec.contains("b.com")) {
					if (passOutYear >= 2023 && passOutYear <= 2026) {
						if (percentage >= 65) {
							if (backlogs.equals("no")) {
								if (expectedSalary <= 450000) {
									if (skills.contains("java") || skills.contains("springboot")) {
										System.out.println("------------------------");
										System.out.println("You are Shortlisted !!");
										System.out.println("V-Square welcomes You mann!!!!");
										System.out.println("Thank you for choosing V-Square!!");
									} else {
										System.out.println("------------------------");
										System.out.println("We are looking for Java & Spring Boot developers");
										System.out.println("Better luck next Time!! \nThanks for your time and Efforts!!");
									}
								} else {
									System.out.println("------------------------");
									System.out.println("We are looking for candidates with Less Compensation");
									System.out.println("Better luck next Time!! \nThanks for your time and Efforts!!");
								}
							} else {
								System.out.println("------------------------");
								System.out.println("We need Candidates without any backlogs");
								System.out.println("Better luck next Time!! \nThanks for your time and Efforts!!");
							}

						} else {
							System.out.println("------------------------");
							System.out.println("Percentage must be greater than 65");
							System.out.println("Better luck next Time!! \nThanks for your time and Efforts!!");
						}
					} else {
						System.out.println("------------------------");
						System.out.println("Only 2023,2024,2025,2026 Candidates are required");
						System.out.println("Better luck next Time!! \nThanks for your time and Efforts!!");
					}

				} else {
					System.out.println("------------------------");
					System.out.println("You must be specialized in computers field");
					System.out.println("Better luck next Time!! \nThanks for your time and Efforts!!");
				}
			} else {
				System.out.println("------------------------");
				System.out.println("You must have a degree to get shortlisted");
				System.out.println("Better luck next Time!! \nThanks for your time and Efforts!!");
			}
		} else {
			System.out.println("------------------------");
			System.out.println("Age must be between 18-30");
			System.out.println("Better luck next Time!! \nThanks for your time and Efforts!!");
		}
		System.out.println("Thank You, you will receive your status soon!!!");

	}

}
