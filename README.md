# SriJava Playlist

This is a Java program that simulates a music playlist. The program allows users to add songs to their playlists and retrieve 
their most recently played songs.
You can download the SriJava code from this repository. To download the code, click the "Clone or download" button on this page 
and select "Download ZIP". Extract the contents of the ZIP file to a directory on your computer.

To use the SriJava playlist program, you will need to compile the code and run it from the command line. 

Here are the steps:

1. Open a command prompt or terminal window and navigate to the directory where you extracted the SriJava code.

2. Compile the SriJava program by running the following command:
    javac SriJava.java
    
3. Once the program is compiled, you can run it by running the following command:
    java SriJava
    
4. The program will run and display the output in the command prompt or terminal window.

5. To add a song to the playlist, call the `addSong` method of the `SriJava`object with the user's name and the name of the song.
    For example:
    playlist.addSong("user1", "S1");
    
6. To retrieve the most recently played songs for a user, call the `getRecentSongs` method of the `SriJava` object with the 
    user's name.
     For example;
    List<String> recentSongs = playlist.getRecentSongs("user1");
