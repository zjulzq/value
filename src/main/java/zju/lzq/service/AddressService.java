package zju.lzq.service;

import zju.lzq.entity.Address;

public interface AddressService {
	public void save(Address address);

	public Address get(long id);
}
