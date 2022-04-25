package practica_7.Adapter;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSort implements Objetivo {
	@Override
	public void ordena(ArrayList<Integer> a) {
		Collections.sort(a);
	}
}
