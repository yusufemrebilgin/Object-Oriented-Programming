package week07;

class SongTest {
    public static void main(String[] args) {
            Song s1 = new Song("Until The World Goes Cold", 321, new Album("Trivium", "Metal"));
            Song s2 = new Song("Anthem Of The Lonely", 242, new Album("Nine Lashes", "Rock"));
            Song s3 = new Song("Breath", 218, new Album("Breaking Benjamin", "Rock"));

            Song[] songs = {s1, s2, s3};

            for (Song s: songs)
                if (s.onAlbum.hasRockMusic())
                    System.out.println(s + "\n");
    }
}
