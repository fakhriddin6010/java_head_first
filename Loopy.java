class BeerSong {
    public static void main (String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "bottle"; // singular, as in ONE bottle.
            }

            System.out.print(beerNum + " " + word + " of beer on the wall");
            System.out.println(", " + beerNum + " " + word + " of beer.");
            System.out.print("Take one down and ");
            System.out.print("pass it around, ");
            beerNum = beerNum - 1;

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall.");
                System.out.println(" ");
            } else {
                System.out.println("no more bottles of beer on the wall.");
            } // end else
        } // end while loop
    } // end main method
} // end class