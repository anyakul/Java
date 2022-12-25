package task050_ChatBot.service.tasks;

import java.util.Iterator;

public abstract class Task implements Iterator<Task>{
   private String text;
   private Task next;

   public Task(String text, Task next) {
      this.text = text;
      this.next = next;
   }

   @Override
   public boolean hasNext() {
      return next != null;
   }

   @Override
   public Task next() {
      return next;
   }

   public String getText() {
      return text;
   }

   public Task getNext() {
      return next;
   }

   public abstract String completeTask(String input);
}
