import java.util.Scanner;

public class Application {
    private Scanner scanner;
    private Scanner users;
    public Application() {
        users = new Scanner(System.in);
        scanner = new Scanner(System.in);
    }

    public void start() {

        while (true) {
            System.out.println("Hello, user! You have the following available functions:");

            System.out.println("1. Log in;\n2. Exit");

            int selected = scanner.nextInt();

            switch (selected) {
                case 1:
                    logIn();
                    break;
                case 2:
                    return;
            }
        }
    }

    public void logIn() {
        User login = new User("admin","12345","A669");
    System.out.println("write your login");
        String writeName = users.nextLine();
        System.out.println("write your password");
        String writePWord = users.nextLine();
        System.out.println("write your card number:");
        String writeCard = users.nextLine();

        if(writeName.equals(login.getUsername()) && writePWord.equals(login.getPassword()) && writeCard.equals(login.getCardNumber()))
            while (true) {
                System.out.println("1. Show all available cars\n2.return a car\n3. Log out.");

                int selected = scanner.nextInt();

                switch (selected) {
                    case 1:
                        showAllAvailableCars();
                        break;
                    case 2:
                        System.out.println("write car model:");
                        String modelCar = users.nextLine();
                        if(modelCar.equals("Camry") || modelCar.equals("skyline R34") || modelCar.equals("RX7")) {
                            System.out.println("everything is correct, thank you for choosing our company");
                            System.exit(0);
                        }
                        break;
                    case 3:
                        return;
                }
            }

    }
    businessCars toyota = new businessCars(2017,20000,"sedan","camry","1day","D-Large car");
    businessCars mercedes = new businessCars(2022,40000,"sedan","S-klasse","1day","F-Luxury car");
    sportCars nissan = new sportCars(1998,30000,"sedan","skyline R34","1day","300km");
    sportCars mazda = new sportCars(2002,25000,"coupe","RX7","1day","250km");
    int toyotaPrice = toyota.getPrice();
    int mercedesPrice = mercedes.getPrice();
    int nissanPrice = nissan.getPrice();
    int mazdaPrice = mazda.getPrice();
    int chooseCar;

        public void showAllAvailableCars () {

            System.out.println("Сhoose a car for rent");

            System.out.println("Сomfortable car classes:");

            System.out.println("1.");
            System.out.println("Toyota\t" + toyota.getInfo());
            System.out.println("Price :" + toyotaPrice + "-" + toyota.getRentPeriod());

            System.out.println("2.");
            System.out.println("Mercedes\t" + mercedes.getInfo());
            System.out.println("Price :" + mercedesPrice + "-" + mercedes.getRentPeriod());

            System.out.println("Sport cars:");

            System.out.println("3.\nNissan\t" + nissan.getInfo());
            System.out.println("Price :" + nissanPrice + "-" + nissan.getRentPeriod());

            System.out.println("4.\nMazda\t" + mazda.getInfo());
            System.out.println("Price :" + mazdaPrice + "-" + mazda.getRentPeriod());

            System.out.println("5.log out");

            chooseCar = scanner.nextInt();
            switch (chooseCar) {
                case 1:
                    rentPeriodDays();break;
                case 2:
                    rentPeriodDays();break;
                case 3:
                    rentPeriodDays();break;
                case 4:
                    rentPeriodDays();break;
                case 5: System.exit(0);
            }
        }
        public void rentPeriodDays () {
            System.out.println("select rental period:");
            System.out.println("1.rent period - 1day\n2.rent period - 5day\n3.rent period - 10day\n4.rent period - 20day\n5.rent period - 30day");
            System.out.println("6.log out");
            int chooseDays = scanner.nextInt();
            switch (chooseDays) {
                case 1: switch (chooseCar) {
                    case 1:
                        System.out.println(toyotaPrice);break;
                    case 2:
                        System.out.println(mercedesPrice);break;
                    case 3:
                        System.out.println("starting price=" + nissanPrice);break;
                    case 4:
                        System.out.println("starting price=" + mazdaPrice);break;
                }break;
                case 2: switch (chooseCar) {
                    case 1:
                        System.out.println(toyotaPrice * 5);break;
                    case 2:
                        System.out.println(mercedesPrice * 5);break;
                    case 3: nissanPrice = nissanPrice * 5;
                        System.out.println("starting price=" + nissanPrice );break;
                    case 4: mazdaPrice = mazdaPrice * 5;
                        System.out.println("starting price=" + mazdaPrice );break;
                }break;
                case 3: switch (chooseCar) {
                    case 1:
                        System.out.println(toyotaPrice * 10);break;
                    case 2:
                        System.out.println(mercedesPrice * 10);break;
                    case 3: nissanPrice = nissanPrice * 10;
                        System.out.println("starting price=" + nissanPrice );break;
                    case 4: mazdaPrice = mazdaPrice * 10;
                        System.out.println("starting price=" + mazdaPrice );break;
                }break;
                case 4: switch (chooseCar) {
                    case 1:
                        System.out.println(toyotaPrice * 20);break;
                    case 2:
                        System.out.println(mercedesPrice * 20);break;
                    case 3: nissanPrice = nissanPrice * 20;
                        System.out.println("starting price=" + nissanPrice );break;
                    case 4: mazdaPrice = mazdaPrice * 20;
                        System.out.println("starting price=" + mazdaPrice );break;
                }break;
                case 5: switch (chooseCar) {
                    case 1:
                        System.out.println(toyotaPrice * 30);break;
                    case 2:
                        System.out.println(mercedesPrice * 30);break;
                    case 3: nissanPrice = nissanPrice * 30;
                        System.out.println("starting price=" + nissanPrice );break;
                    case 4: mazdaPrice = mazdaPrice * 30;
                        System.out.println("starting price=" + mazdaPrice );break;
                }break;
                case 6: return;
            }
            if (chooseCar == 3 || chooseCar == 4) {
                sportCarsLock();
            }
            else {
                System.out.println("if you agree,  write yes");
                String agree = users.nextLine();
                if (agree.equals("yes")) {
                    System.exit(0);
                } else {
                    System.out.println("you didn't rent a car.");
                }
            }
        }
        public void sportCarsLock() {
            System.out.println("speed block is active in sports cars\nremove block costs 10000\n1.turn off block\n2.don't turn off block");
            int offLock = scanner.nextInt();
            switch (offLock) {
                case 1 :
                    if(chooseCar == 3)
                        System.out.println(nissanPrice + 10000);
                    else
                        System.out.println(mazdaPrice + 10000);break;
                case 2 :
                    if (chooseCar == 3)
                        System.out.println(nissanPrice);
                    else
                        System.out.println(mazdaPrice);break;
            }
                if(offLock == 1 && chooseCar == 3) {
                    nissan.speedLock(false);
                } else if (offLock == 1) {
                    mazda.speedLock(false);
                }
                else {
                    nissan.speedLock(true);
                    mazda.speedLock(true);
                    System.out.println("max speed =" + nissan.getMaximumSpeed());
                }
            System.out.println("if you agree,  write yes");
            String agree = users.nextLine();
            if(agree.equals("yes")) 
                System.exit(0);
             else
                System.out.println("you didn't rent a car.");

        }
    }








