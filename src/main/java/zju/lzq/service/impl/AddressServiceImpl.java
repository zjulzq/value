package zju.lzq.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import zju.lzq.dao.AddressDao;
import zju.lzq.entity.Address;
import zju.lzq.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
	@Resource
	private AddressDao addressDao;

	public void save(Address address) {
		addressDao.save(address);
	}

	public Address get(long id) {
		return addressDao.get(id);
	}

}
