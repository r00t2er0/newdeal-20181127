package com.eomcs.util;

import java.util.Arrays;
import com.eomcs.lms.domain.Board;

public class ArrayList<T> {
  final int DEFAULT_CAPACITY = 10;
  Object[] list;
  int size = 0;
  
  public ArrayList() {
    list  = new Object[DEFAULT_CAPACITY];
  }
  
  public ArrayList(int initialCapacity) {
    if (initialCapacity > DEFAULT_CAPACITY) 
      list = new Object[initialCapacity];
    else
      list = new Object[DEFAULT_CAPACITY];
  }
  
  @SuppressWarnings("unchecked")
  public T[] toArray(T[] a) {
    if(a.length < size) {
      return (T[])Arrays.copyOf(list, size, a.getClass());
    }
    
    System.arraycopy(list, 0, a, 0, size);
    
    if(a.length > size) {
      a[size] = null;
    }
    
    return a;
  }
  
  public void add(T item) {
    if (size >= list.length) {
      int oldCapacity = list.length;
      int newCapacity = oldCapacity + (oldCapacity >> 1);
      list = Arrays.copyOf(list, newCapacity);
    }
    
    list[size++] = list;
  }
  
  public int size() {
    return this.size;
  }
}
