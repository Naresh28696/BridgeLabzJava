
/******************************************************************************
	 * Purpose:  helper class containinf important methods used in other classes
     *
	 * @author chiragkatare
	 * @version 2.0   
	 * @since 03-10-2018
	 *
	 ******************************************************************************/
import java.util.ArrayList;

public class Utility {

	/**
	 * Function to count the characters in a string alphabaticlally and return array
	 * of the count of each alphabet
	 * 
	 * @param s the string given to count
	 * @return the array for counted characters
	 */
	public static int[] count(String s) {
		s = s.toLowerCase();
		int[] c = new int[25];
		for (int i = 0; i < s.length(); i++) {
			c[s.charAt(i) - 97]++;
		}
		return c;
	}

	/**
	 * Function to count the value in given integer be place
	 * 
	 * @param n the integer value to count
	 * @return the integer array for the count value
	 */
	public static int[] count(int n) {
		int[] count = new int[10];
		int temp = n;
		while (temp != 0) {
			int r = temp % 10;
			count[r]++;
			temp = temp / 10;
		}
		return count;
	}

	/**
	 * Function to check the two strings are anagrams or not
	 * 
	 * @param s1 the first string to check
	 * @param s2 the second string to check
	 * @return true if its string and vice-versa
	 */
	public static boolean anagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		int[] s1count = count(s1);
		int[] s2count = count(s2);
		for (int i = 0; i < s2count.length; i++) {
			if (s2count[i] != s1count[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * to check the values are anagrams or not
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public static boolean anagram(int n1, int n2) {
		int[] n1count = count(n1);
		int[] n2count = count(n2);
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Function to print the prime no between to 1 to 1000
	 */
	public static void prime() {
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b)
				System.out.print(j + " ");
		}
	}

	/**
	 * function to chekc if given no is prime or not
	 * 
	 * @param n thenumber which to check for prime
	 * @return true if prime false if not
	 */
	public static boolean isPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (i % n == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Function helping prime() to check if prime is pallindrome and print it
	 */
	public static void primePallindrome() {
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b && isPallindrome(j))
				System.out.print(j + " ");
		}
	}

	/**
	 * Function to check if no is anagram or not
	 */
	public static void primeAnagrams() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b)
				ar.add(j);
		}
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				if (anagram(ar.get(i), ar.get(j))) {
					System.out.println(ar.get(i) + "  " + ar.get(j));
				}
			}
		}
	}

	/**
	 * Function to sort implementing bubble sort algorithm
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] bubbleSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}
		return arr;
	}

	/**
	 * Function to sort string array using bubble sort algorithm
	 * 
	 * @param arr the array which needs to be sorted
	 */
	public static void bubbleSort(String[] arr) {
		String temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
	}

	/**
	 * Function to search a number in a array using binary search algorithm
	 * 
	 * @param arr the array in which the no to be searched
	 * @param n   the integer which needs to be searched
	 * @return the index of the number if found or -1 if not found
	 */
	public static int binary(int[] arr, int n) {
		int high = arr.length - 1, low = 0, mid;
		arr = bubbleSort(arr);

		while (low <= high) {
			mid = (low + high) / 2;
			if (n == arr[mid]) {
				return mid;
			} else if (arr[mid] < n) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * Function to search a string in string array using binary search
	 * 
	 * @param arr the array in which element to be searched
	 * @param s   the string element which needs to be searched
	 * @return -1 if not found or the index of element if found
	 */
	public static int binary(String[] arr, String s) {
		int high = arr.length - 1, low = 0, mid;
		bubbleSort(arr);

		while (low <= high) {
			mid = (low + high) / 2;
			if (s.equalsIgnoreCase(arr[mid])) {
				return mid;
			} else if (arr[mid].compareToIgnoreCase(s) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	/*
	 * public static int i(String[] arr, String s) { int high = arr.length - 1, low
	 * = 0, mid; bubbleSort(arr);
	 * 
	 * while (low <= high) { mid = (low + high) / 2; if
	 * (s.equalsIgnoreCase(arr[mid])) { return mid; } else if
	 * (arr[mid].compareToIgnoreCase(s) < 0) { low = mid + 1; } else { high = mid -
	 * 1; } } return -1; }
	 */

	/**
	 * Function to sort array using insertion sort
	 * 
	 * @param arr the array which needs to be sorted
	 * 
	 */
	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[i] = arr[j];
				j -= 1;
			}
			arr[j + 1] = temp;
		}
	}

	/**
	 * Function to sort array using insertion sort
	 * 
	 * @param arr the array which needs to be sorted
	 * 
	 */
	public static String[] insertionSort(String[] arr) {
		for (int i = 1; i < arr.length; i++) {
			String temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareToIgnoreCase(temp) < 0) {
				arr[i] = arr[j];
				j -= 1;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}

	/**
	 * Function to find the is pallindrome or not
	 * 
	 * @param n the integer which to check for pallindrome
	 * @return true if its pallindrome or false if its not
	 */
	public static boolean isPallindrome(int n) {
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		if (sum == n) {
			return true;
		}
		return false;
	}
}
