import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Song {
    public String getTypeList() {
        return typeList;
    }

    public void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String typeList;
    private String name;
    private String time;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Song> songs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("_");
            String type = data[0];
            String name = data[1];
            String time = data[2];
            Song song = new Song();
            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);
            songs.add(song);


        }
        String input = scanner.nextLine();
        if("all".equals(input)){
            for(Song song:songs){
                System.out.println(song.getName());
            }
        }else{
            for(Song song: songs){
                if(input.equals(song.getTypeList())){
                    System.out.println(song.getName());
                }
            }
        }


    }

}
