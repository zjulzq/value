package zju.lzq.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import zju.lzq.entity.Address;
import zju.lzq.service.AddressService;

public class TestDao {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[] { "beans.xml" });
		AddressService addressService = (AddressService) ctx.getBean("addressServiceImpl");
		Address address = addressService.get(3);
		System.out.println(address);
		AddressDao addressDao = (AddressDao) ctx.getBean("addressDaoImpl");
		List<Address> list = addressDao.getAll();
		for(Address addr : list){
			System.out.println(addr);
		}
	}

}
