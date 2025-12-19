package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collactions {

	/**
	 * Topics
• List, Set, Map
• ArrayList vs LinkedList
• HashSet vs TreeSet
• HashMap vs TreeMap
• Comparable vs Comparator
• Sorting lists

Resources
• Oracle – Collections Framework Overview
• Programiz – Java Collections
• GeeksForGeeks (beginner-friendly examples)

Assessment (Major Milestone)

✔ Write a program that:
• Stores employees in an ArrayList
• Sorts them by name (Comparable)
• Sorts them by salary (Comparator)
• Checks duplicates using HashSet
• Stores (id → employee) in a HashMap
	 * @param args
	 */
	public static void main(String []args) {
		List<Employees> employes= new ArrayList<>();
		System.out.println();
		employes.add(new Employees(1, "aba", 3000));
		employes.add(new Employees(2, "bbb", 4000));
		employes.add(new Employees(3, "ccc", 5000));
		employes.add(new Employees(4, "ddd", 6000));
		
		System.out.print("Originla list");
		System.out.println();
		
		employes.forEach(System.out::println);
		System.out.println();
		
		Collections.sort(employes);
		employes.forEach(System.out::println);
		System.out.println();
		
		employes.sort(new SalaryComp());
		employes.forEach(System.out::println);
		System.out.println();
		
		Set<Employees> employset= new HashSet<>(employes);
		employes.forEach(System.out::println);
		System.out.println();
		
		Map<Integer, Employees>employmap= new HashMap<>();
		for(Employees e : employes) {
			employmap.put(e.getId(), e);
		}
		System.out.println();
	}
}
