package week07;

class Song {
    String title;
    int lenInSeconds;
    Album onAlbum;

    Song(String title, int lenInSeconds, Album onAlbum) {
        this.title = title;
        this.lenInSeconds = lenInSeconds;
        this.onAlbum = onAlbum;
    }

    boolean onSameAlbum(Song s1, Song s2) {
        return s1.equals(s2);
    }

    @Override
    public String toString() {
        return String.format("Artist: %s\nTitle: %s\nGenre: %s", onAlbum.artistName, title, onAlbum.genre);
    }
}
