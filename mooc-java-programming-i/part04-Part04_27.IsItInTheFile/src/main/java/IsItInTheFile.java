
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words=new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner in = new Scanner(Paths.get(file))) {
            while (in.hasNextLine()){
                String word=in.nextLine();
                words.add(word);

            }
            if (words.contains(searchedFor)){
                System.out.println("Found!");
            }else{
                System.out.println("Not found.");
//                break;
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");

        }

    }
}
