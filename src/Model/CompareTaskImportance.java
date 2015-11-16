package Model;

import java.util.Comparator;

public class CompareTaskImportance implements Comparator<Task>{

	@Override
	public int compare(Task o1, Task o2) {
		return o1.nbPoints() - o2.nbPoints();
	}
}
