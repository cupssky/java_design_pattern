package strategy;

public class Main {

  public static void main(String[] args) {
    SortEngine sortEngine;

    Sort quickSort = new QuickSort();
    sortEngine = new SortEngine(quickSort);

    sortEngine.search();

    Sort mergeSort = new MergeSort();
    sortEngine.setSorter(mergeSort);

    sortEngine.search();
  }
}
