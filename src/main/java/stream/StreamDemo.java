package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StreamDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Sofi");
		names.add("Sarmas");
		names.add("Munna");
		
		for(int i=0; i<names.size(); i++) {
			if(names.get(i).startsWith("S")) {
				System.out.println(names.get(i));
			}
		}
		
//		names.stream().filter(s->s.startsWith("S")).forEach(s->System.out.println((s)));

		long count = names.stream().count();
		System.out.println(count);
		
//		List<String> UpperList = names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		
//		UpperList.stream().forEach(s->System.out.println(s));
		
		
	}
	
	

}
