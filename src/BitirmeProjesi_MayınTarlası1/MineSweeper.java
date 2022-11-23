package BitirmeProjesi_MayınTarlası1;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    private int satirNo;
    private int sütunNo;
    private String[][] mayınHarita;
    private String[][] oyunHarita;
    private int mayınSayısı;

    public MineSweeper(int satirNo, int sütunNo) {
        this.satirNo = satirNo;
        this.sütunNo = sütunNo;
        this.mayınHarita = new String[satirNo][sütunNo];
        this.oyunHarita = new String[satirNo][sütunNo];
        this.mayınSayısı = (satirNo * sütunNo) / 4;
    }

    void printMap() {
        for (int i = 0; i < satirNo; i++) {
            for (int j = 0; j < sütunNo; j++) {
                System.out.print(this.oyunHarita[i][j] + " ");
            }
            System.out.println();
        }
    }

    void gameMap() {
        for (int i = 0; i < satirNo; i++) {
            for (int j = 0; j < sütunNo; j++) {
                this.oyunHarita[i][j] = "-";
            }
        }
    }

    void plantedMine() {
        Random rand = new Random();
        for (int i = 0; i < mayınSayısı; i++) {
            int randRow = rand.nextInt(satirNo);
            int randColumn = rand.nextInt(sütunNo);

            if (this.mayınHarita[randRow][randColumn] != "*") {
                this.mayınHarita[randRow][randColumn] = "*";
            } else {
                i--;
            }

        }

        for (int i = 0; i < satirNo; i++) {
            for (int j = 0; j < sütunNo; j++) {
                if (this.mayınHarita[i][j] != "*") {
                    this.mayınHarita[i][j] = "-";
                }
                System.out.print(this.mayınHarita[i][j] + " ");
            }
            System.out.println();
        }
    }

    void printMineMap() {
        for (int i = 0; i < satirNo; i++) {
            for (int j = 0; j < sütunNo; j++) {
                System.out.print(this.mayınHarita[i][j] + " ");
            }
            System.out.println();
        }
    }

    void run() {
        int hamleHakkı = (satirNo * sütunNo) - mayınSayısı;
        Scanner scanner = new Scanner(System.in);

        gameMap();
        System.out.println("Mayınların Konumu");
        plantedMine();

         
        
        while (hamleHakkı > 0) {
            

            int mayınSayac = 0;

            System.out.println("=========================");
            System.out.println("Kalan hamle hakkınız : " + hamleHakkı);
            printMap();

            System.out.print("satır giriniz : ");
            int row = scanner.nextInt();

            System.out.print("sütun giriniz : ");
            int col = scanner.nextInt();

            if ((row < 0 || row > satirNo) || (col < 0 || col > sütunNo)) {
                System.out.println("Lütfen doğru index numarası giriniz !");
                continue;
            } else {
                if (this.mayınHarita[row][col] == "*") {
                    System.out.println("Mayına Bastınız Oyunu Kaybettiniz !!");
                    printMineMap();
                    break;
                }

                if (!this.oyunHarita[row][col].equals("-")) {
                    System.out.println("Bu hamle daha önce yapıldı !");
                    continue;
                } else {

                    int minusRow = (row - 1), plusRow = (row + 1);
                    int minusCol = (col - 1), plusCol = (col + 1);

                    if ((minusRow < 0) || (minusCol < 0)) {
                        minusRow = 0;
                        minusCol = 0;
                    }
                    if ((plusRow >= satirNo) || (plusCol >= sütunNo)) {
                        plusRow = row;
                        plusCol = col;
                    }
                    for (int i = minusRow; i <= plusRow; i++) {
                        for (int j = minusCol; j <= plusCol; j++) {
                            if (this.mayınHarita[i][j] == "*") {
                                mayınSayac++;
                            }
                        }
                    }

                    String convertMayınSayac = String.valueOf(mayınSayac);
                    this.oyunHarita[row][col] = convertMayınSayac;
                    hamleHakkı--;
                }

            }

        }
        
        if (hamleHakkı == 0) {
                System.out.println("Oyunu Kazandınız Tebrikler !");
                printMap();
            }
        
       

    }

}
