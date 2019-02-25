package service;

import dao.JoinDao;
import dao.JoinDaoImpl;
import model.Member;

public class JoinServiceImpl implements JoinService {

	private JoinDao dao;

	public JoinServiceImpl() {
		dao = new JoinDaoImpl();
	}

	@Override
	public void join(Member m) {
		// TODO Auto-generated method stub
		dao.insert(m);
	}

}
