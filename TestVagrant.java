import java.util.*;

public class TestVagrant {
    private Map<String, List<String>> store;
    private int capacity;

    public TestVagrant(int capacity) {
        this.store = new LinkedHashMap<>();
        this.capacity = capacity;
    }

    public void addSong(String user, String song) {
        List<String> playlist = store.getOrDefault(user, new ArrayList<>());

        if (playlist.contains(song)) {

            playlist.remove(song);
        } else if (playlist.size() == capacity) {
            playlist.remove(0);
        }

        playlist.add(song);
        store.put(user, playlist);
    }

    public List<String> getRecentSongs(String user) {
        return store.getOrDefault(user, new ArrayList<>());
    }

    public static void main(String[] args) {
        TestVagrant playlist = new TestVagrant(3);

        playlist.addSong("user1", "S1");
        playlist.addSong("user1", "S2");
        playlist.addSong("user1", "S3");
        System.out.println(playlist.getRecentSongs("user1")); // [S1, S2, S3]

        playlist.addSong("user1", "S4");
        System.out.println(playlist.getRecentSongs("user1")); // [S2, S3, S4]

        playlist.addSong("user1", "S2");
        System.out.println(playlist.getRecentSongs("user1")); // [S3, S4, S2]

        playlist.addSong("user1", "S1");
        System.out.println(playlist.getRecentSongs("user1")); // [S4, S2, S1]
    }
}
