import java.util.ArrayList;
import java.util.List;

public class InterviewRepository {
	
	private List<Candidate> candidateList;
	
	public void prepareCandidateList()
	{
		candidateList=new ArrayList<>();
		candidateList.add(new Candidate("Ramesh","Java","Pune",5));
		candidateList.add(new Candidate("Akash","Java","Nashik",4));
		candidateList.add(new Candidate("Shubham",".Net","Pune",0));
		candidateList.add(new Candidate("Swati","Python","Mumbai",0));
		candidateList.add(new Candidate("Ramesh","Java","Pune",3));
		candidateList.add(new Candidate("Rohan",".Net","Banglore",4));
		candidateList.add(new Candidate("Roshan","Python","Nashik",6));
		
		
		
		
	}
	
	public List<Candidate> getCandidatelist()
	{
		prepareCandidateList();
		return candidateList;
	}
	
	

}
