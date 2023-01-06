//Написать приложение реализующее игру камень-ножницы-бумага.
// (Пользователь вводит из консоли вариант, а программа рандомно генерирует ответное действие,
// обработать условия выигрыша, ничьи, победы. Программа должна продолжать работать
// пока пользователь не введет команду остановки программы.)

import java.util.Scanner;

public class GameApp {
    int countPlayer = 0;
    int countComputer = 0;

    public void runGameApp() {
        Scanner scanner = new Scanner(System.in);

        boolean exit = true;
        while (exit) {
            System.out.println("Let's play, make your choice: stone - press 1, scissors - press 2, paper - press 3, to exit press 4.");
            int input = scanner.nextInt();
            int choiceComputer = randomChoice();
            if (input == choiceComputer) {
                System.out.println("Draw between players!");
                System.out.println();
                printScore();
                System.out.println();
            }
            switch (input) {
                case 1:
                    if (choiceComputer == 2) {
                        System.out.println("Computer choice: scissors");
                        System.out.println("You win!");
                        System.out.println();
                        countPlayer++;
                        printScore();
                        System.out.println();
                    } else if (choiceComputer == 3) {
                        System.out.println("Computer choice: paper");
                        System.out.println("You lost!");
                        System.out.println();
                        countComputer++;
                        printScore();
                        System.out.println();
                    }
                    restartGame();
                    break;
                case 2:
                    if (choiceComputer == 1) {
                        System.out.println("Computer choice: stone");
                        System.out.println("You lost!");
                        System.out.println();
                        countComputer++;
                        printScore();
                        System.out.println();
                    } else if (choiceComputer == 3) {
                        System.out.println("Computer choice: paper");
                        System.out.println("You win!");
                        System.out.println();
                        countPlayer++;
                        printScore();
                        System.out.println();
                    }
                    restartGame();
                    break;
                case 3:
                    if (choiceComputer == 1) {
                        System.out.println("Computer choice: stone");
                        System.out.println("You win!");
                        System.out.println();
                        countPlayer++;
                        printScore();
                        System.out.println();
                    } else if (choiceComputer == 2) {
                        System.out.println("Computer choice: scissors");
                        System.out.println("You lost!");
                        System.out.println();
                        countComputer++;
                        printScore();
                        System.out.println();
                    }
                    restartGame();
                    break;
                case 4:
                    exit = false;
                    System.out.println("Thanks for the game!");
                    break;
                default:
                    System.out.println("Wrong action, choose correct one (1, 2, 3, 4)");
                    System.out.println();
                    break;
            }
        }
    }

    public int randomChoice() {
        int random = (int) (1 + Math.random() * 3);
        return random;
    }

    private void restartGame() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println("Can we play some more? Yes - press 1, No - press 2.");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println();
                    exit = false;
                    break;
                case 2:
                    System.out.println("Thanks for the game!");
                    System.out.println();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong action, choose correct one (1, 2)");
                    System.out.println();
                    break;
            }
        }
    }

    private void printScore() {
        System.out.println("Player Points: " + countPlayer + "\n" + "Computer Points: " + countComputer);
    }

}
