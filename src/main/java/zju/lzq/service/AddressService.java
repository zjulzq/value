package zju.lzq.service;

import java.util.List;

import zju.lzq.entity.Address;

public interface AddressService {
	public void save(Address address);

	public Address get(long id);
	
	public List<Address> getAll();
}
