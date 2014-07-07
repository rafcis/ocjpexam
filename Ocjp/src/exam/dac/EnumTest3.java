/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam.dac;

/**
 *
 * @author Rafał
 * Prints "Clerk" followed by "Secretary"
 */
public class EnumTest3 {

    enum Employee {

        MANAGER,
        CLERK,
        SECRETARY
    }

    public static void main(String[] args) {
        new EnumTest3(Employee.CLERK);
    }

    EnumTest3(Employee emp) {
        switch (emp) {
            case MANAGER:
                System.out.println("Manager");
            case CLERK:
                System.out.println("Clerk");
            case SECRETARY:
                System.out.println("Secretary");
        }
    }
}
