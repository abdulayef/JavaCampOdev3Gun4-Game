package entities;

import abstracts.IMemberCheckService;
import abstracts.MemberManager;


public class MemberService extends MemberManager {

	private IMemberCheckService _imembercheckservice;
	
	
	public MemberService(IMemberCheckService _imembercheckservice) {
		super();
		this._imembercheckservice = _imembercheckservice;
	}

	@Override
	public void save(Member member) {
		if (_imembercheckservice.checkIfrealperson(member)) {
			System.out.println("Oyuncu kaydedildi: "+member.getFirstname()+" "+member.getLastName());
		}
		else {
			System.out.println("Not a valid person");
		}
		
	}

	@Override
	public boolean checkIfrealperson(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

}
