package org.kemy.sorting;

public class TestSort {
    public void test() {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arr2[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int arr3[] = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        int arr4[] = {5, 2, 7, 3, 8, 2, 5, 9, 9};
        System.out.println("sorting 2");
        chek(Sorting2.sortBySelect(arr1));
        chek(Sorting2.sortBySelect(arr2));
        chek(Sorting2.sortBySelect(arr3));
        chek(Sorting2.sortBySelect(arr4));
        System.out.println("sorting 3");
        chek(Sorting3.sortByChange(arr1));
        chek(Sorting3.sortByChange(arr2));
        chek(Sorting3.sortByChange(arr3));
        chek(Sorting3.sortByChange(arr4));
        System.out.println("sorting 4");
        chek(Sorting4.sortByInsert(arr1));
        chek(Sorting4.sortByInsert(arr2));
        chek(Sorting4.sortByInsert(arr3));
        chek(Sorting4.sortByInsert(arr4));
        System.out.println("sorting 5");
        chek(Sorting5.sortByShel(arr1));
        chek(Sorting5.sortByShel(arr2));
        chek(Sorting5.sortByShel(arr3));
        chek(Sorting5.sortByShel(arr4));

    }

    public void chek(int arr[]) {
        boolean flag = true;
        for (int i = 0; i < 8; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                System.out.println("array false");
                break;
            }
        }
        if (flag) System.out.println("array true");
    }
}
