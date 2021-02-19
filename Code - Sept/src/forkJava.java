import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class forkJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        DoubleStream stream = DoubleStream.of(3.4, 4.5, 
                6.7, 8.9);

// Using DoubleStream mapToObj(DoubleFunction mapper)
// and displaying an object-valued Stream 
// consisting of the results of 
// applying the given function
		List list =stream.mapToObj(num ->{return num * num * num ;})
		.collect(Collectors.toList());
		System.out.println(list);
		
		  stream.mapToObj(num ->{return num * num * num ;})
           .forEach(System.out::println);
	}

}
