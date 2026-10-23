package com.bert;

public enum AnsiE {
    // Text Reset
    RESET("\u001B[0m"),

    // Text Colors
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m"),

    // Bold Colors
    BOLD("\u001B[1m"),
    BOLD_RED("\u001B[1;31m"),
    BOLD_GREEN("\u001B[1;32m"),
    BOLD_YELLOW("\u001B[1;33m"),
    BOLD_BLUE("\u001B[1;34m"),
    BOLD_PURPLE("\u001B[1;35m"),
    BOLD_CYAN("\u001B[1;36m"),
    BOLD_WHITE("\u001B[1;37m"),

    // Background Colors
    BG_BLACK("\u001B[40m"),
    BG_RED("\u001B[41m"),
    BG_GREEN("\u001B[42m"),
    BG_YELLOW("\u001B[43m"),
    BG_BLUE("\u001B[44m"),
    BG_PURPLE("\u001B[45m"),
    BG_CYAN("\u001B[46m"),
    BG_WHITE("\u001B[47m");

    private final String code;

    AnsiE(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }

    // Helper method to quickly clear the Termux screen
    public static void clearScreen() {
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
    }
}
