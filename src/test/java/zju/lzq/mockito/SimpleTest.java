package zju.lzq.mockito;

import static org.mockito.Mockito.*;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

@RunWith(MockitoJUnitRunner.class)
public class SimpleTest extends TestCase {

	@Mock
	private List myList;

	@Test
	public void test1() {
		Iterator<String> i = mock(Iterator.class);
		// when(i.next()).thenReturn("Hello").thenReturn("World");
		when(i.next()).thenReturn("Hello", "World");

		String result = i.next() + " " + i.next();

		verify(i, times(2)).next();

		assertEquals("Hello World", result);
	}

	@Test
	public void test2() {
		List list = mock(List.class);
		list.add("one");
		list.clear();

		verify(list).add("one");
		verify(list).clear();
	}

	@Test
	public void test3() {
		LinkedList list = mock(LinkedList.class);
		when(list.get(0)).thenReturn("first");
		System.out.println(list.get(0));
		System.out.println(list.get(999));
	}

	@Test
	public void test4() {
		myList.add("one");
		myList.add("two");

		verify(myList).add("one");
		verify(myList).add("two");
		verify(myList, never()).add("three");

		when(myList.add("four")).thenAnswer(new Answer() {
			@Override
			public Object answer(InvocationOnMock invocation) throws Throwable {
				Object[] args = invocation.getArguments();
				Object mock = invocation.getMock();
				for (int i = 0; i < args.length; i++) {
					System.out.println(args[i]);
				}
				return null;
			}
		});
		myList.add("four");
	}

	@Test
	public void test5() {
		List list = new LinkedList();
		List spy = spy(list);

		when(spy.size()).thenReturn(100);

		spy.add("one");
		spy.add("two");

		System.out.println(spy.get(0));
		System.out.println(spy.size());

		verify(spy).add("one");
		verify(spy).add("two");

	}

	@Test
	public void test6() {
		String name = "John";
		myList.add(name);
		ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
		verify(myList).add(argument.capture());

		assertEquals(name, argument.getValue());
	}

	@Test
	public void test7() {
		

	}
}
