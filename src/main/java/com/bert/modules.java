package com.bert;

import java.util.Scanner;

public class modules {
    public static Scanner sc = new Scanner(System.in);
    
    public static void printTitle(){
        AnsiE.clearScreen();
        System.out.println(AnsiE.BOLD_CYAN
                + "============================================" + AnsiE.RESET);
        System.out.println(AnsiE.BOLD_YELLOW + "  ____  _____ ____ _____ " + AnsiE.RESET);
        System.out.println(AnsiE.BOLD_YELLOW + " | __ )| ____|  _ \\_   _|" + AnsiE.RESET);
        System.out.println(AnsiE.BOLD_YELLOW + " |  _ \\|  _| | |_) || |  " + AnsiE.RESET);
        System.out.println(AnsiE.BOLD_YELLOW + " | |_) | |___|  _ < | |  " + AnsiE.RESET);
        System.out.println(AnsiE.BOLD_YELLOW + " |____/|_____|_| \\_\\|_|  " + AnsiE.RESET);
        
        System.out.println(" "+AnsiE.BG_GREEN+"Version 1 Snapshot 2"+AnsiE.RESET);
        System.out.println(AnsiE.BOLD_CYAN
                + "============================================" + AnsiE.RESET);

        

    }
    public static void printOptions(){
        System.out.println(AnsiE.GREEN
                + "Welcome to Bedrock Edition Redstone Toolkit! \n\nSelect an option below by entering the number in the braces ([]). \n\nExample- for [1] Tick to Seconds , type 1 ."
                + AnsiE.RESET);
        
        System.out.println(" ");

        System.out.println(AnsiE.WHITE + "  [1] Tick ↔ Seconds Converter" + AnsiE.RESET);
        System.out.println(AnsiE.WHITE + "  [2] Repeater Chain Calculator" + AnsiE.RESET);
        System.out.println(AnsiE.WHITE + "  [3] Clock Period Calculator" + AnsiE.RESET);
        System.out.println(AnsiE.WHITE + "  [4] Hopper Clock Calculator" + AnsiE.RESET);
        System.out.println(AnsiE.WHITE + "  [5] Duty Cycle Calculator" + AnsiE.RESET);
        System.out
                .println(AnsiE.WHITE + "  [6] Signal Strength (Normal container)" + AnsiE.RESET);
        System.out.println(AnsiE.WHITE + "  [7] Signal Strength(Jukebox,Beehive)" + AnsiE.RESET);
        System.out.println(AnsiE.WHITE + "  [8] Signal Strength(Brewing Stand,Cauldron)" + AnsiE.RESET);

        System.out.println(AnsiE.WHITE + "  [9] Circuit Delay Calculator" + AnsiE.RESET);

    }
    
    public static void m1(){
        System.out.println(AnsiE.YELLOW + "What type of conversion do you want?" + AnsiE.RESET + AnsiE.BOLD_PURPLE
                    + "\n\n[1] Tick -> Seconds \n[2] Seconds -> Tick");
            System.out.print(AnsiE.BLUE + "\nEnter your choice: " + AnsiE.RESET);

            int Choice2 = sc.nextInt();

            AnsiE.clearScreen();

            if (Choice2 == 1) {
                System.out.print("Enter no. of Ticks: ");

                double ticks = sc.nextDouble();

                double time = ticks * 1 / 20;

                System.out.println(AnsiE.BG_GREEN + "Seconds => " + time + "s" + AnsiE.RESET);
            }
            if (Choice2 == 2) {
                System.out.print("Enter no. of Seconds: ");

                double time = sc.nextDouble();

                double ticks = time * 20;

                System.out.println(AnsiE.BG_GREEN + "Ticks => " + ticks + " ticks" + AnsiE.RESET);
            }
    }
    public static void m2(){
        System.out.print(AnsiE.YELLOW + "How many tick delays do you want? : " + AnsiE.RESET);

            int tdelay = sc.nextInt();

            int fulltr = tdelay / 4;
            int extratr = tdelay % 4;

            System.out.println(AnsiE.BG_GREEN + "" + fulltr + " 4 tick repeaters, " + extratr + " ticks on 1 more.");
    }
    public static void m3(){
        AnsiE.clearScreen();
            System.out.println(AnsiE.CYAN + "Enter total game ticks (gt) for one full loop cycle: " + AnsiE.RESET);

            // Read using 'sc'
            double totalGameTicks = sc.nextDouble();

            if (totalGameTicks > 0) {
                double redstoneTicks = totalGameTicks / 2.0;
                double seconds = totalGameTicks / 20.0;
                double milliseconds = seconds * 1000.0;
                double frequencyHz = 1.0 / seconds;

                AnsiE.clearScreen();
                System.out.println(
                        AnsiE.WHITE + "Game Ticks (gt): " + AnsiE.BOLD_CYAN + totalGameTicks + " gt" + AnsiE.RESET);
                System.out.println(
                        AnsiE.WHITE + "Redstone Ticks (rt): " + AnsiE.BOLD_CYAN + redstoneTicks + " rt" + AnsiE.RESET);
                System.out.println(AnsiE.WHITE + "Period (Seconds): " + AnsiE.BOLD_CYAN + seconds + " s" + AnsiE.RESET);
                System.out.println(
                        AnsiE.WHITE + "Period (Milliseconds): " + AnsiE.BOLD_CYAN + milliseconds + " ms" + AnsiE.RESET);
                System.out.println(
                        AnsiE.WHITE + "Frequency: " + AnsiE.BOLD_CYAN + frequencyHz + " Hz (cycles/sec)" + AnsiE.RESET);
            }
    }
    public static void m4(){
        AnsiE.clearScreen();
            System.out.println(AnsiE.CYAN + "Enter total number of items in the hopper clock loop: " + AnsiE.RESET);

            int items = sc.nextInt();

            if (items > 0) {
                double totalGameTicks = (double) items * 8.0;
                double redstoneTicks = totalGameTicks / 2.0;
                double seconds = totalGameTicks / 20.0;
                double minutes = seconds / 60.0;

                System.out.println(AnsiE.GREEN + "\n--- Hopper Clock Cycle ---" + AnsiE.RESET);
                System.out.println(AnsiE.WHITE + "Total Items: " + AnsiE.BOLD_CYAN + items + AnsiE.RESET);
                System.out.println(AnsiE.WHITE + "Cycle Time (Game Ticks): " + AnsiE.BOLD_CYAN + totalGameTicks + " gt"
                        + AnsiE.RESET);
                System.out.println(AnsiE.WHITE + "Cycle Time (Redstone Ticks): " + AnsiE.BOLD_CYAN + redstoneTicks
                        + " rt" + AnsiE.RESET);
                System.out.println(
                        AnsiE.WHITE + "Cycle Time (Seconds): " + AnsiE.BOLD_CYAN + seconds + " s" + AnsiE.RESET);
                System.out.println(
                        AnsiE.WHITE + "Cycle Time (Minutes): " + AnsiE.BOLD_CYAN + minutes + " m" + AnsiE.RESET);
            }

    }
    public static void m5(){
        AnsiE.clearScreen();
            System.out.println(AnsiE.CYAN + "Enter On-time (in game ticks): " + AnsiE.RESET);
            double ticksOn = sc.nextDouble();

            System.out.println(AnsiE.CYAN + "Enter Off-time (in game ticks): " + AnsiE.RESET);
            double ticksOff = sc.nextDouble();

            double totalPeriod = ticksOn + ticksOff;
            if (totalPeriod > 0) {
                double dutyCyclePct = (ticksOn / totalPeriod) * 100.0;
                double frequencyHz = 20.0 / totalPeriod;

                System.out.println(AnsiE.GREEN + "\n--- Duty Cycle Results ---" + AnsiE.RESET);
                System.out.println(AnsiE.WHITE + "Total Period: " + AnsiE.BOLD_CYAN + totalPeriod + " gt ("
                        + (totalPeriod / 20.0) + " s)" + AnsiE.RESET);
                System.out
                        .println(AnsiE.WHITE + "Duty Cycle: " + AnsiE.BOLD_CYAN + dutyCyclePct + "% ON" + AnsiE.RESET);
                System.out.println(AnsiE.WHITE + "Frequency: " + AnsiE.BOLD_CYAN + frequencyHz + " Hz" + AnsiE.RESET);
            }

    }
    public static void m6(){
         AnsiE.clearScreen();
            System.out.println(AnsiE.BOLD_YELLOW + "=== Standard Container Calculator ===" + AnsiE.RESET);
            System.out.println(AnsiE.CYAN + "Enter total items currently in the container: " + AnsiE.RESET);
            int items = sc.nextInt();

            System.out.println(AnsiE.CYAN
                    + "Enter total max capacity (e.g., 320 for Hopper, 1728 for Chest, 3456 for Double Chest): "
                    + AnsiE.RESET);
            int maxCapacity = sc.nextInt();

            if (maxCapacity > 0) {
                int signalStrength = 0;
                if (items > 0) {
                    signalStrength = 1 + (int) Math.floor((14.0 * items) / maxCapacity);
                    if (signalStrength > 15) {
                        signalStrength = 15;
                    }
                }

                System.out.println(AnsiE.GREEN + "\n--- Container Output ---" + AnsiE.RESET);
                System.out
                        .println(AnsiE.WHITE + "Items: " + AnsiE.BOLD_CYAN + items + " / " + maxCapacity + AnsiE.RESET);
                System.out.println(AnsiE.WHITE + "Comparator Signal Strength: " + AnsiE.BOLD_YELLOW + signalStrength
                        + " / 15" + AnsiE.RESET);
            }

    }
    public static void m7(){
        AnsiE.clearScreen();
            System.out.println(AnsiE.BOLD_YELLOW + "=== Special Block Calculator ===" + AnsiE.RESET);
            System.out.println(AnsiE.WHITE + "  [1] Jukebox" + AnsiE.RESET);
            System.out.println(AnsiE.WHITE + "  [2] Lectern" + AnsiE.RESET);
            System.out.println(AnsiE.WHITE + "  [3] Beehive / Bee Nest" + AnsiE.RESET);
            System.out.print(AnsiE.BOLD_CYAN + "\n[BERT/Special]> " + AnsiE.RESET);

            int specialChoice = sc.nextInt();

            if (specialChoice == 1) {
                System.out.println(AnsiE.CYAN + "Enter Music Disc Signal Value (1 to 15): " + AnsiE.RESET);
                int discSignal = sc.nextInt();
                System.out.println(AnsiE.GREEN + "\n--- Jukebox Output ---" + AnsiE.RESET);
                System.out.println(AnsiE.WHITE + "Comparator Signal Strength: " + AnsiE.BOLD_YELLOW + discSignal
                        + " / 15" + AnsiE.RESET);
            } else if (specialChoice == 2) {
                System.out.println(AnsiE.CYAN + "Enter current page number: " + AnsiE.RESET);
                int currentPage = sc.nextInt();
                System.out.println(AnsiE.CYAN + "Enter total pages in book: " + AnsiE.RESET);
                int totalPages = sc.nextInt();

                if (totalPages > 1) {
                    int signal = 1 + (int) Math.floor(((double) (currentPage - 1) / (totalPages - 1)) * 14.0);
                    System.out.println(AnsiE.GREEN + "\n--- Lectern Output ---" + AnsiE.RESET);
                    System.out.println(AnsiE.WHITE + "Comparator Signal Strength: " + AnsiE.BOLD_YELLOW + signal
                            + " / 15" + AnsiE.RESET);
                } else {
                    System.out.println(AnsiE.RED + "Total pages must be greater than 1." + AnsiE.RESET);
                }
            } else if (specialChoice == 3) {
                System.out.println(AnsiE.CYAN + "Enter honey level (0 to 5): " + AnsiE.RESET);
                int honeyLevel = sc.nextInt();
                int signal = 0;
                if (honeyLevel > 0) {
                    signal = honeyLevel * 3;
                    if (signal > 15) {
                        signal = 15;
                    }
                }
                System.out.println(AnsiE.GREEN + "\n--- Beehive Output ---" + AnsiE.RESET);
                System.out.println(AnsiE.WHITE + "Comparator Signal Strength: " + AnsiE.BOLD_YELLOW + signal + " / 15"
                        + AnsiE.RESET);
            }

    }
    public static void m8(){
        AnsiE.clearScreen();
            System.out.println(AnsiE.BOLD_YELLOW + "=== Brewing Stand & Cauldron Calculator ===" + AnsiE.RESET);
            System.out.println(AnsiE.WHITE + "  [1] Brewing Stand" + AnsiE.RESET);
            System.out.println(AnsiE.WHITE + "  [2] Cauldron (Water / Powder Snow)" + AnsiE.RESET);
            System.out.println(AnsiE.WHITE + "  [3] Lava Cauldron" + AnsiE.RESET);
            System.out.print(AnsiE.BOLD_CYAN + "\n[BERT/BrewCauldron]> " + AnsiE.RESET);

            int bcChoice = sc.nextInt();

            if (bcChoice == 1) {
                System.out.println(AnsiE.CYAN + "Enter number of bottles present (0 to 3): " + AnsiE.RESET);
                int bottles = sc.nextInt();
                System.out.println(
                        AnsiE.CYAN + "Is an ingredient currently brewing? (1 for Yes, 0 for No): " + AnsiE.RESET);
                int brewing = sc.nextInt();

                int signal = bottles;
                if (brewing > 0 && bottles > 0) {
                    signal = 3; // Simplified active state indicator or max bottle state
                }
                if (signal > 3)
                    signal = 3;

                System.out.println(AnsiE.GREEN + "\n--- Brewing Stand Output ---" + AnsiE.RESET);
                System.out.println(AnsiE.WHITE + "Comparator Signal Strength: " + AnsiE.BOLD_YELLOW + signal + " / 15"
                        + AnsiE.RESET);

            } else if (bcChoice == 2) {
                System.out.println(AnsiE.CYAN + "Enter liquid/snow level (0 = Empty, 1, 2, 3 = Full): " + AnsiE.RESET);
                int level = sc.nextInt();

                int signal = 0;
                if (level == 1)
                    signal = 3;
                else if (level == 2)
                    signal = 7;
                else if (level >= 3)
                    signal = 11;

                System.out.println(AnsiE.GREEN + "\n--- Cauldron Output ---" + AnsiE.RESET);
                System.out.println(AnsiE.WHITE + "Comparator Signal Strength: " + AnsiE.BOLD_YELLOW + signal + " / 15"
                        + AnsiE.RESET);

            } else if (bcChoice == 3) {
                int signal = 3;
                System.out.println(AnsiE.GREEN + "\n--- Lava Cauldron Output ---" + AnsiE.RESET);
                System.out.println(AnsiE.WHITE + "Comparator Signal Strength: " + AnsiE.BOLD_YELLOW + signal + " / 15"
                        + AnsiE.RESET);
            }

    }
    public static void m9(){
        System.out.println(AnsiE.BOLD_YELLOW + "=== Circuit Delay Calculator ===" + AnsiE.RESET);
        System.out.println(AnsiE.WHITE + "Add components to your redstone chain to sum total delay.\n" + AnsiE.RESET);

        int totalGameTicks = 0;
        boolean addingComponents = true;

        while (addingComponents) {
            System.out.println(AnsiE.CYAN + "Current Total Delay: " + AnsiE.BOLD_GREEN + (totalGameTicks / 2.0) + " RT"
                    + AnsiE.RESET + " (" + totalGameTicks + " GT)");
            System.out.println(AnsiE.WHITE + "  [1] Redstone Dust (0 GT)" + AnsiE.RESET);
            System.out.println(AnsiE.WHITE + "  [2] Repeater (1-4 RT / 2-8 GT)" + AnsiE.RESET);
            System.out.println(AnsiE.WHITE + "  [3] Comparator (1 RT / 2 GT)" + AnsiE.RESET);
            System.out.println(AnsiE.WHITE + "  [4] Redstone Torch (1 RT / 2 GT)" + AnsiE.RESET);
            System.out.println(AnsiE.WHITE + "  [5] Observer (1 RT / 2 GT)" + AnsiE.RESET);
            System.out.println(AnsiE.WHITE + "  [6] Piston Extension (1.5 RT / 3 GT)" + AnsiE.RESET);
            System.out.println(AnsiE.WHITE + "  [0] Finish & Calculate Total" + AnsiE.RESET);
            System.out.print(AnsiE.BOLD_CYAN + "\nAdd component > " + AnsiE.RESET);

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println(AnsiE.GREEN + "-> Added Redstone Dust (+0 GT)\n" + AnsiE.RESET);
            } else if (choice == 2) {
                System.out.println(AnsiE.CYAN + "Enter Repeater Delay Setting (1, 2, 3, or 4 ticks): " + AnsiE.RESET);
                int setting = sc.nextInt();
                if (setting >= 1 && setting <= 4) {
                    totalGameTicks += setting * 2;
                    System.out.println(AnsiE.GREEN + "-> Added " + setting + " RT Repeater (+" + (setting * 2)
                            + " GT)\n" + AnsiE.RESET);
                } else {
                    System.out.println(
                            AnsiE.RED + "Invalid setting! Repeater delay must be between 1 and 4.\n" + AnsiE.RESET);
                }
            } else if (choice == 3) {
                totalGameTicks += 2;
                System.out.println(AnsiE.GREEN + "-> Added Comparator (+1 RT / +2 GT)\n" + AnsiE.RESET);
            } else if (choice == 4) {
                totalGameTicks += 2;
                System.out.println(AnsiE.GREEN + "-> Added Redstone Torch (+1 RT / +2 GT)\n" + AnsiE.RESET);
            } else if (choice == 5) {
                totalGameTicks += 2;
                System.out.println(AnsiE.GREEN + "-> Added Observer (+1 RT / +2 GT)\n" + AnsiE.RESET);
            } else if (choice == 6) {
                totalGameTicks += 3;
                System.out.println(AnsiE.GREEN + "-> Added Piston (+1.5 RT / +3 GT)\n" + AnsiE.RESET);
            } else if (choice == 0) {
                addingComponents = false;
            }
        }

        double totalRedstoneTicks = totalGameTicks / 2.0;
        double totalSeconds = totalGameTicks / 20.0;

        System.out.println(AnsiE.GREEN + "\n--- Total Circuit Delay Summary ---" + AnsiE.RESET);
        System.out.println(AnsiE.WHITE + "Game Ticks (GT): " + AnsiE.BOLD_CYAN + totalGameTicks + " gt" + AnsiE.RESET);
        System.out.println(
                AnsiE.WHITE + "Redstone Ticks (RT): " + AnsiE.BOLD_YELLOW + totalRedstoneTicks + " rt" + AnsiE.RESET);
        System.out.println(AnsiE.WHITE + "Real Time (Seconds): " + AnsiE.BOLD_CYAN + totalSeconds + " s" + AnsiE.RESET);
    }

 
}