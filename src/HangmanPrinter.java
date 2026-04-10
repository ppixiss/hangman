public final class HangmanPrinter {

    private static final String[] PICTURES = {
            """
    +----
    |
    |
    |
    |
    -----
    """,
            """
     +---+
     |   |
     |   ☺
     |
     |
     -----
     """,
            """
     +---+
     |   |
     |   ☺
     |   |
     |
     -----
     """,
            """
     +---+
     |   |
     |   ☺
     |   |\\
     |
     -----
     """,
            """
     +---+
     |   |
     |   ☺
     |  /|\\
     |
     -----
     """,
            """
     +---+
     |   |
     |   ☺
     |  /|\\
     |    \\
     -----
     """,
            """
     +---+
     |   |
     |   ☺
     |  /|\\
     |  / \\
     -----
     """,
    };

    public static void draw(int mistakes) {
        String picture = PICTURES[mistakes];
        System.out.println(picture);
    }
}
