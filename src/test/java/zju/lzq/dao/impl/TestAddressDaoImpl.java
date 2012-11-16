package zju.lzq.dao.impl;

import java.util.Date;

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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-test.xml" })
@TransactionConfiguration(transactionManager = "txManager")
@Transactional
public class TestAddressDaoImpl extends TestCase {
	@Resource
	private AddressDao addressDao;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@Test
	public void testSave() {
		Address address = new Address();
		address.setProvince("上海");
		address.setCity("上海");
		address.setDistrict("长宁区");
		address.setStreet("新华路");
		address.setNumber("569弄");
		address.setPrcDate(new Date());
		addressDao.save(address);
		Address address2 = addressDao.get(address.getId());
		assertEquals(address.getProvince(), address2.getProvince());
		assertEquals(address.getCity(), address2.getCity());
		assertEquals(address.getDistrict(), address2.getDistrict());
		assertEquals(address.getStreet(), address2.getStreet());
		assertEquals(address.getNumber(), address2.getNumber());
		assertEquals(address.getPrcDate().getDate(), address2.getPrcDate().getDate());
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
