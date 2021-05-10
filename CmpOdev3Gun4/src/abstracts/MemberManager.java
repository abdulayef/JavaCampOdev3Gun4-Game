package abstracts;

import entities.Member;

public abstract class MemberManager implements IMemberCheckService{
      public abstract void save(Member member) ;
}
