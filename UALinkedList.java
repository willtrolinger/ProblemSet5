import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UALinkedList {

	UACourse head;

	UACourse tail;

	static UACourse ins = new UACourse();

	public static void main(String args[]) throws IOException {
		UALinkedList l1 = new UALinkedList();
		BufferedReader br = new BufferedReader(new FileReader("records.txt"));
		String line;
		while ((line = br.readLine()) != null) {
			String[] tokens = line.split(",");
			UACourse c1 = new UACourse(Integer.parseInt(tokens[2]), tokens[0], tokens[1]);
			l1.insert(c1);
		}
		br.close();

		l1.printList();
		l1.find(12345);
		l1.find(45678);
		UACourse ins = new UACourse(0, null, null);
		ins.setCourseName("GPU Programming");
		ins.setCourseId(44332);
		ins.setCourseDescription("A fun course");
		l1.insert(ins);
		l1.find(12345);
		l1.find(5555);
		l1.remove(45678);
		UACourse ins2 = new UACourse(0, null, null);
		ins2.setCourseName("Natural Language Processing");
		ins2.setCourseId(44332);
		ins2.setCourseDescription("NLP Class");
		l1.insert(ins2);
		l1.find(44332);
		l1.printList();
	}

	public UACourse find(int courseId) {
		UACourse cont = head;

		while (cont != null) {
			if (cont.getCourseId() == courseId) {
				cont.setAccessCount(cont.getAccessCount() + 1);
				System.out.println(
						"[" + cont.getCourseId() + "] " + cont.getCourseName() + ": " + cont.getCourseDescription());

			}
			cont = cont.getNext();
		}
		return cont;

	}

	public void insert(UACourse s) {
		if (head == null) {
			head = s;
		} else {
			UACourse cont = head;

			while (cont.getNext() != null) {
				if (cont.getCourseId() == s.getCourseId()) {
					System.out.println("ERROR - INVALID ID");
				}

				cont = cont.getNext();
			}
			if (cont.getCourseId() == s.getCourseId()) {
				System.out.println("ERROR - INVALID ID");
			
			} else {

				cont.setNext(s);
				s.setPrev(cont);

			}
		}
	}

	

	public void remove(int i) {
		UACourse cont = head;

        while(cont != null) {
            if(cont.getCourseId() == i) {

                cont.getNext().setPrev(cont.getPrev());
                cont.getPrev().setNext(cont.getNext());
            }
            cont = cont.getNext();
        }
    }

	public void printList() {

		if (head == null) {
			System.out.println("This list is empty.");
		} else {
			UACourse cont = head;
			while (cont != null) {
				System.out.println(
						"[" + cont.getCourseId() + "] " + cont.getCourseName() + ": " + cont.getCourseDescription());
				cont = cont.getNext();
			}
		}
	}

	public void printListReversed() {
		if (tail == null) {

			UACourse tail = head.getPrev();
		} else {
			UACourse cont = tail;
			while (cont != null) {
				System.out.println(
						"[" + cont.getCourseId() + "] " + cont.getCourseName() + ": " + cont.getCourseDescription());
				cont.getPrev();
			}
		}
	}
}






  