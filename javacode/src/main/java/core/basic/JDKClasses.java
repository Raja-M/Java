package  core.basic;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class JDKClasses {

    public static void main( String[] args){
        String wordsAndNubmers = """
                Longing rusted furnace
                daybreak 17 benign
                9 homecoming 1
                freight car benign
                """;
        try(Scanner scanner = new Scanner(wordsAndNubmers)){


            scanner.findAll("benign").map(MatchResult::group).forEach(IO::println);
        }

    }
}