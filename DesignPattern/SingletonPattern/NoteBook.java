package DesignPattern.SingletonPattern;

public class NoteBook {
  // Eager way of creating object, this is not a good way
  private static NoteBook noteBook = new NoteBook();

  public static NoteBook getNoteBook() {
    return noteBook;
  }
}
