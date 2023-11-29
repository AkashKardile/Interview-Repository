import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CandidateStreamingOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Candidate c=new Candidate();
		
		InterviewRepository itr=new InterviewRepository();
		Stream<Candidate > s=itr.getCandidatelist().stream();
		
		
//		System.out.println("*********************");
//		System.out.println("1. list the candidate Names from pune city");
//		s.filter((e)->e.getCity().equals("Pune")).map((e)->e.getName()).forEach((e)->System.out.println(e));
//		System.out.println("**************************************");
		
//		System.out.println("   ");
//		System.out.println("*********************");
//		System.out.println("2. List the city and candidates per city: ");
//		Map<String, List<Candidate>> m=s.collect(Collectors.groupingBy((e->e.getCity())));
//		for(Map.Entry<String, List<Candidate>> mp:m.entrySet())
//		{
//			String city=mp.getKey();
//			List<Candidate> l=mp.getValue();
//			System.out.println("******************");
//			System.out.println("City:  "+city+"  "+"count"+" "+l.size());
//			
//			for(Candidate c2:l)
//			{
//				System.out.println(c2.getName());
//			}
//		}
		//System.out.println("***************************");
		
		
//		System.out.println("  ");
//		System.out.println("*************************");
//		System.out.println("3. List Freshers candidate");
//		s.filter((e)->(e.getYearsOfExperience()<=0)).forEach((e->System.out.println(e)));
//		System.out.println("***************************");
		
		
//		System.out.println("  ");
//		System.out.println("*************************");
//		System.out.println("4. Sort the list by their years of experience.");
//		Comparator<Candidate> i=(a,b)->a.getYearsOfExperience()-b.getYearsOfExperience();
//		s.sorted(i).collect(Collectors.toList()).forEach((e)->System.out.println(e));
//		System.out.println("  ");
//		System.out.println("*************************");
//		
		
//		System.out.println("  ");
//		System.out.println("*************************");
//		System.out.println("5. List the candidate with highest Experience: ");
//		Comparator<Candidate> i1=(a,b)->a.getYearsOfExperience()-b.getYearsOfExperience();
//		List<Candidate> l1=s.sorted(i1).collect(Collectors.toList());
//		int n=l1.size();
//		List<Candidate> l2=new ArrayList<>();
//		l2.add(l1.get(n-1));
//		Stream<Candidate> s2=l2.stream();
//		//s2.forEach((e)->System.out.println(e));
//		System.out.println("  ");
//		System.out.println("*************************");
//		
//		System.out.println("  ");
//		System.out.println("*************************");
//		System.out.println("6. Find out the highest years of experience of value");
//		s2.map((e)->e.getYearsOfExperience()).forEach((e)->System.out.println(e));
		
		
//		System.out.println("  ");
//		System.out.println("*************************");
//		System.out.println("7.sort the candidates by City names");
//		Comparator<Candidate> can=(a,b)->a.getCity().compareTo(b.getCity());
//		s.sorted(can).forEach((e)->System.out.println(e));
//		System.out.println("  ");
//		System.out.println("*************************");
		
		
//		System.out.println("  ");
//		System.out.println("*************************");
//		System.out.println("8. Search the Candidate whose TechnicalExperience is java");
//		s.filter((e)->e.getTechnicalExpertice().equals("Java")).map((e)->e.getName()).forEach((e)->System.out.println(e));
//		System.out.println("  ");
//		System.out.println("*************************");
		
		
//		System.out.println("  ");
//		System.out.println("*************************");
		//System.out.println("9. Display the candidate names whose city is nashik");
//		s.filter((e)->e.getCity().equals("Nashik")).map((e)->e.getName()).forEach((e)->System.out.println(e));
//		System.out.println("  ");
//		System.out.println("*************************");
		
		
		System.out.println("  ");
		System.out.println("*************************");
		System.out.println("10. Stoare all the candidate in the list whose technical Experience is .net");
		s.filter((e)->e.getTechnicalExpertice().equals(".Net")).map((e)->e.getName()).collect(Collectors.toList()).forEach((e)->System.out.println(e));
		System.out.println("  ");
		System.out.println("*************************");
		
		
		
		
	
		
		
		
		
		
		//

	}

}
