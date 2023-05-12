import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCode {

    public static void main(String[] args){

        Stream<Integer> strm = Stream.of( new Integer[]{ 1, 2, 3, 4, 5, 6, 7});

   //     strm.forEach( v -> System.out.println(v) );

        Stream < Integer> randomNumbers = Stream.generate( () -> ( new Random()).nextInt(100));

    //    randomNumbers.limit(20).forEach( System.out::println);

        List< Employee> empList = createListOfEmployees();

        Stream<Employee> empStream = empList.stream();
        Supplier<Stream<Employee>  >  suppEmply =  () -> empList.stream();


        // Stream<Integer> stream = empList.parallelStream();
        // Integer[] evenNumbersArr = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);

        /*
        List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

        Comparator<Integer> reverseComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2.compareTo(i1);
            }
        };

List<Integer> sortedList = list.stream()
      //.sorted(reverseComparator)
      .sorted( (i1, i2) -> i2.compareTo(i1) )
      .collect(Collectors.toList());

System.out.println(sortedList);

         */
        List<String> empNames = suppEmply.get()
                .map( e -> e.getName())
                .filter( (s) -> s.startsWith("M"))
               // .count()
                .collect(Collectors.toList());

        empNames.forEach( System.out::println);

        int totSalary = suppEmply.get()
                .map( e -> e.getSalary())
                .reduce(0, (subTot, sal ) -> subTot + sal);

        System.out.println(" Tot Salary : " + totSalary);

    }

    public static List< Employee> createListOfEmployees(){
        List < Employee>  emplist = new ArrayList<>();
        Employee e1 = new Employee("John" , 20000);
        Employee e2 = new Employee( "Smith", 23000 );
        Employee e3 = new Employee( "Chris", 32000);
        Employee e4 = new Employee( "Mike", 25000);
        Employee e5 = new Employee( "Megan", 18000);
        Employee e6 = new Employee( "Mathew", 19000);

        emplist.add(e1);
        emplist.add(e2);
        emplist.add(e3);
        emplist.add(e4);
        emplist.add(e5);
        emplist.add(e6);

        return emplist;
    }
}
