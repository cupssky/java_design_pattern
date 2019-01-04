package strategy;

import java.util.ArrayList;
import java.util.List;

public class SortEngine {

  private Sort sort;

  public SortEngine(Sort sort) {
    this.sort = sort;
  }

  public void setSorter(Sort sort) {
    this.sort = sort;
  }

  public List<Object> search() {
    List<Object> list = new ArrayList<>();
    sort.sort(list);
    return list;
  }
}
