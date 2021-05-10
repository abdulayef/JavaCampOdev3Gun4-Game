package adapter;

import java.rmi.RemoteException;

import abstracts.IMemberCheckService;
import entities.Member;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IMemberCheckService{

	@Override
	public boolean checkIfrealperson(Member member) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
	return	client.TCKimlikNoDogrula(member.getNationalityId(), member.getFirstname().toUpperCase(),member.getLastName().toUpperCase(), member.getYearofBirth());
	}
catch (NumberFormatException | RemoteException e) {
			
			e.printStackTrace();
		}
		return false;
	}
}
