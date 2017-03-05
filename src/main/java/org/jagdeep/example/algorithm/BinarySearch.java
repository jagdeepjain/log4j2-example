package org.jagdeep.example.algorithm;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BinarySearch {

	static Logger log = LogManager.getLogger(BinarySearch.class.getName());

	public int binarySearch(List<Integer> list, int number) {
		log.info("Given list # {}", list);
		log.info("Number to be search in the list # {}", number);
		int start = 0;
		int end = list.size();
		while (start <= end) {
			Integer mid = (start + end) / 2;
			if (list.get(mid) == number) {
				log.info("Value of mid index is # {}", mid);
				return mid;
			}
			if (number < list.get(mid)) {
				log.info("Value of start index is # {}", start);
				end = mid - 1;
			} else {
				log.info("Value of mid index is # {}", mid);
				start = mid + 1;
			}
		}
		// return -1 if did not find any match
		return -1;
	}
}
