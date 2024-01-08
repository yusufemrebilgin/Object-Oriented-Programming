package week07;

class Album {
    String artistName;
    String genre;

    Album(String artistName, String genre) {
        this.artistName = artistName;
        this.genre = genre;
    }

    boolean hasRockMusic() {
        return genre.equals("Rock");
    }
}
