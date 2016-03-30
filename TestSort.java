import java.util.ArrayList;
import java.util.List;

import sort.Sort;
import sort.SortableData;
import sort.Sorts;

/*
 * Created on 24 oct. 2004
 *
 */

/**
 * @author baudon
 * 
 */
public class TestSort {

	public static void sortAndPrint(SortableData<?> sd, Sort sort) {
		sort.doSort(sd);
		for (int i = 0; i < sd.size(); ++i) {
			System.out.print(sd.get(i) + " ");
		}
		System.out.println();
	}

	public static <T> void initList(List<T> l, T[] a) {
		l.clear();
		for (T t : a) {
			l.add(t);
		}
	}

	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();

		initList(ls, args);
		Sorts.quickSort(ls);
		for (String s : ls) {
			System.out.print(s + " ");
		}
		System.out.println();
	}

}
