package com.dh.meli.generics;

import java.util.Comparator;

public interface Sorter <T>{

	void sort(T[] array, Comparator<T> comparator);
}
