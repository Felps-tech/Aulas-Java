/*
 * // interface
 * interface Animal {
 * public void animalSound(); // interface method (does not have a body)
 * public void run(); // interface method (does not have a body)
 * }
 * 
 *
 * // Interface
 * interface Animal {
 * public void animalSound(); // interface method (does not have a body)
 * public void sleep(); // interface method (does not have a body)
 * }
 * 
 * // Pig "implements" the Animal interface
 * class Pig implements Animal {
 * public void animalSound() {
 * // The body of animalSound() is provided here
 * System.out.println("The pig says: wee wee");
 * }
 * public void sleep() {
 * // The body of sleep() is provided here
 * System.out.println("Zzz");
 * }
 * }
 * 
 * class Main {
 * public static void main(String[] args) {
 * Pig myPig = new Pig(); // Create a Pig object
 * myPig.animalSound();
 * myPig.sleep();
 * }
 * }
 * 
 * An enum is a special "class" that represents a group of constants
 * (unchangeable variables, like final variables).
 * 
 * enum Level {
 * LOW,
 * MEDIUM,
 * HIGH
 * }
 */