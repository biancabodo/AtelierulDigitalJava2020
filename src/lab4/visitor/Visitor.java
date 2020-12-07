package lab4.visitor;

import lab4.visitor.Audio;
import lab4.visitor.Book;
import lab4.visitor.Video;

public interface Visitor {
   void visit(Book book);
   void visit(Video video);
   void visit(Audio audio);
}
