import abstracts.MemberManager;
import adapter.MernisServiceAdapter;
import concrete.CampaniyaManager;
import entities.Member;
import entities.MemberService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberService memberService=new MemberService(new MernisServiceAdapter());
		memberService.save(new Member(1," Sabina", "Askarova", 12345678,2001));
		CampaniyaManager campaniyaManager=new CampaniyaManager();
		campaniyaManager.campaniya();
	}

}
