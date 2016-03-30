package sort;

import java.util.Comparator;
import java.util.List;


public class Sorts {

	public static final QuickSort QUICKSORT = new QuickSort();

	public static final InsertionSort INSERTION_SORT = new InsertionSort();

	private static void sort(Sort s, SortableData<?> data) {
		s.doSort(data);
	}

	public static <T extends Comparable<? super T>> void quickSort(T[] array) {
		sort(QUICKSORT, new SortableComparableData<T>(new SwapableArray<T>(array)));
	}

	public static <T> void quickSort(T[] array, Comparator<? super T> comparator) {
		sort(QUICKSORT, new SortableDataWithComparator<T>(new SwapableArray<T>(array),
				comparator));
	}

	public static <T extends Comparable<? super T>> void quickSort(List<T> l) {
		sort(QUICKSORT, new SortableComparableData<T>(new SwapableList<T>(l)));
	}

	public static <T> void quickSort(List<T> l, Comparator<? super T> comparator) {
		sort(QUICKSORT, new SortableDataWithComparator<T>(new SwapableList<T>(l),
				comparator));
	}

	public static <T extends Comparable<? super T>> void insertionSort(T[] array) {
		sort(INSERTION_SORT, new SortableComparableData<T>(new SwapableArray<T>(array)));
	}

	public static <T> void insertionSort(T[] array,
			Comparator<? super T> comparator) {
		sort(INSERTION_SORT, new SortableDataWithComparator<T>(new SwapableArray<T>(array),
				comparator));
	}

	public static <T extends Comparable<? super T>> void insertionSort(List<T> l) {
		sort(INSERTION_SORT, new SortableComparableData<T>(new SwapableList<T>(l)));
	}

	public static <T> void insertionSort(List<T> l,
			Comparator<? super T> comparator) {
		sort(INSERTION_SORT, new SortableDataWithComparator<T>(new SwapableList<T>(l),
				comparator));
	}

}