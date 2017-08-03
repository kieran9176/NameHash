/**
 * Created by kieranderfus on 4/22/17.
 */
class listcell {

    public int num;
    public String word;
    public listcell next, prev;

    public listcell(String w)
    {
        word = w;
        next = null;
        prev = null;
        num = 0;
    }

    public void setNext(listcell n) {
        next = n;
    }
    public void setPrev(listcell p) {
        prev = p;
    }

    public listcell getNext() {
        return next;
    }
    public listcell getPrev() {
        return prev;
    }
}

class dll {

    public int size;
    public listcell head;
    protected listcell tail;

    public dll()
    {
        head = null;
        tail = null;
        size = 0;

    }

    public void prepend (listcell new_cell) {

        if (head == null) {
            head = new_cell;
            tail = head;
        }
        else {
            head.setPrev(new_cell);
            new_cell.setNext(head);
            head = new_cell;
        }
        size++;
    }

    public void append (listcell new_cell) {

        if (head == null) {
            head = new_cell;
            tail = new_cell;
        }

        else {
            tail.setNext(new_cell);

            new_cell.setPrev(tail);
            new_cell.setNext(null);

            tail = new_cell;
        }
        size++;
    }

    listcell search (String word) {
        listcell x = head;
        while (x != null) {
            if (word.equals(x.word)) {
                return x;
            } else {
                x = x.getNext();
            }
        }
        return null;
    }

    public void delete (listcell x) {

        if (size == 1) {
            head = null;
            tail = null;
            size = 0;

        } else if (x.getNext() == null) {
            tail = x.getPrev();
            tail.setNext(null);
            size--;

        } else if (x.getPrev() == null) {
            head = x.getNext();
            head.setPrev(null);
            size--;
        }
        else {
            listcell prev = x.getPrev();
            listcell next = x.getNext();

            next.setPrev(prev);

            prev.setNext(next);
            size--;
        }
    }
}

