package zju.lzq.dao.impl;

import javax.annotation.Resource;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import zju.lzq.dao.AddressDao;
import zju.lzq.entity.Address;
import zju.lzq.util.DomainEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-test.xml" })
@TransactionConfiguration(transactionManager = "txManager")
@Transactional
public class TestAddressDaoImpl extends TestCase {
	@Resource
	private AddressDao addressDao;

	@Test
	public void testSave() {
		Address address = new Address();
		address.setProvince("上海");
		address.setCity("上海");
		address.setDistrict("长宁区");
		address.setStreet("新华路");
		address.setNumber("569弄");
		address.setPrcDate(null);
		addressDao.save(address);
		Address address2 = addressDao.get(address.getId());
		assertEquals(true, DomainEquals.assertEquals(address, address2));
	}

	@Test
	public void testDeleteT() {

	}

	@Test
	public void testDeleteLong() {

	}

	@Test
	public void testUpdate() {

	}

	@Test
	public void testGet() {

	}

	@Test
	public void testGetAll() {

	}

}
