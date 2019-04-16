import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class toEmailConverter{
public static void main(String[] arg) throws Exception{
		PrintWriter pw=new PrintWriter(new FileWriter("names_converted.txt"));
		List<String> list = Arrays.asList("Maria Reeke", "Paul Norm", "Tauri Talts", "Igor Shkedov", "Maria Juurisoo", "Oskar Mettus");
		list
		.stream()
		.map(String::toLowerCase)
		.map(entry -> entry.replaceAll(" ", "."))
		.map(entry -> entry + "@tlu.ee ")
		.sorted()
		.forEach(pw::println);
		pw.close();
	}
}
