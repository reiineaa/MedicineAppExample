package com.company;

        import com.company.controllers.UserController;
        import com.company.repositories.interfaces.IUserRepository;

        import java.util.InputMismatchException;
        import java.util.Scanner;
private final UserController controller;
private final Scanner scanner;

public MyApplication(IUserRepository userRepository) {
        controller = new UserController(userRepository);
public MyApplication(UserController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
        }
public void start() {
        while (true) {
        System.out.println();
        System.out.println("Welcome to My Application");
        System.out.println("Select option:");
        System.out.println("1. Get all medicines");
        System.out.println("2. Get medicine by name");
        System.out.println("3. Get medicine by id");
        System.out.println("4. Add medicine");
        System.out.println("5. Remove medicine");
        System.out.println("0. Exit");
        System.out.println();
        try {
        System.out.print("Enter option (1-5): ");
        int option = scanner.nextInt();
        if (option == 1) {
        getAllMedicineMenu();
        } else if (option == 2) {
        getMedicineByNameMenu();
        } else if (option == 3) {
        getMedicineByIdMenu();
        } else if (option == 4) {
        addMedicineMenu();
        } else if (option == 5) {
        removeMedicineMenu();
        }
        else {
        break;
        }
        } catch (InputMismatchException _) {
        System.out.println("Input must be integer");
        scanner.nextLine(); // to ignore incorrect input
        }
        catch (Exception e) {
        System.out.println(e.getMessage());
        }
        System.out.println("*************************");
        }
        }
public void getAllMedicineMenu() {
        String response = controller.getAllMedicine();
        System.out.println(response);
        }
public void getUserByIdMenu() {
        System.out.println("Please enter id");
        int id = scanner.nextInt();
        String response = controller.getUser(id);
        System.out.println(response);
        }
public void getUserByNmaeMenu() {
        System.out.println("Please enter name");
        String name = scanner.nextString();
        String response = controller.getUser(name);
        System.out.println(response);
        }
public void createMedicineMenu() {
        System.out.println("Please enter name");
        String name = scanner.next();
        System.out.println("Please enter id");
        inty id = scanner.next();
        System.out.println("Please enter price);
        String price = scanner.next();
        System.out.println("Please enter manufacturer);
        String manufacturer = scanner.next();
        String response = controller.createUser(name, id, price, manufacturer);
        System.out.println(response);
        }
        }