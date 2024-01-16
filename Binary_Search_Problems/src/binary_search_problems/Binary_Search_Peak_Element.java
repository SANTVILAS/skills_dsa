package binary_search_problems;

public class Binary_Search_Peak_Element {

	public static int peakElement(int arr[]) {
		int n = arr.length;
		if (n == 1)
			return 0;
		if (arr[0] > arr[1])
			return 0;
		if (arr[n - 1] > arr[n - 2])
			return n - 1;
		int low = 1;
		int high = n - 2;
		while (low <= high) {
			int mid = (high + low) / 2;
			if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
				return mid;
			} else if (arr[mid] < arr[mid + 1] && arr[mid] > arr[mid - 1]) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1 };
		int ans = peakElement(arr);

		System.out.println(ans);

	}

}
