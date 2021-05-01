package NestedClass;

/**
 * @author Bhaskar Singh
 * @date 4/25/2021 12:52 AM
 */
interface BufferIterator {
    boolean hasNext();
    StudentNestedTest next();
}

public class BufferStudent {

    private StudentNestedTest[] students;

    private int next = 0;

    public BufferStudent(int size) {
        this.students = new StudentNestedTest[size];
    }

    public BufferIterator iterator() {
        return new BufferIteratorImpl();
    }

    public void add(StudentNestedTest studentNestedTest) {
        if(next < students.length) {
            students[next++] = studentNestedTest;
        }
    }

    //Will delete elements from end
    public StudentNestedTest delete() {
        if(next >= 0) {
            StudentNestedTest studentNestedTest = students[--next];
            students[next] = null;
            return studentNestedTest;
        }
        return null;
    }

    //Will delete elements from beginning
    public void deleteFirst() {
        for(int i = 0; i<students.length - 1; i++) {
            if(students[i] != null) {
                students[i] = students[i + 1];
            }
            if(i == (students.length - 2)) {
                students[i + 1] = null;
            }
        }
        next--;
    }

    class BufferIteratorImpl implements BufferIterator {

        private int i = 0;

        @Override
        public boolean hasNext() {
//            return i < students.length;
            return i < next;
//            return next >=0;
        }

        @Override
        public StudentNestedTest next() {
            return students[i++];
        }
    }

    public static void main(String[] args) {

        BufferStudent bufferStudent = new BufferStudent(5);
        StudentNestedTest studentNestedTest1 = new StudentNestedTest();
        studentNestedTest1.setId(1);;
        studentNestedTest1.setRollNo(1);
        studentNestedTest1.setName("Bhaskar");
        studentNestedTest1.setRollNo(1);

        StudentNestedTest studentNestedTest2 = new StudentNestedTest();
        studentNestedTest2.setId(2);;
        studentNestedTest2.setRollNo(1);
        studentNestedTest2.setName("Bhaskar");
        studentNestedTest2.setRollNo(1);

        StudentNestedTest studentNestedTest3 = new StudentNestedTest();
        studentNestedTest3.setId(3);;
        studentNestedTest3.setName("Bhaskar");
        studentNestedTest3.setRollNo(1);
        studentNestedTest3.setRollNo(1);

        StudentNestedTest studentNestedTest4 = new StudentNestedTest();
        studentNestedTest4.setId(4);;
        studentNestedTest4.setRollNo(1);
        studentNestedTest4.setName("Bhaskar");
        studentNestedTest4.setRollNo(1);

        StudentNestedTest studentNestedTest5 = new StudentNestedTest();
        studentNestedTest5.setId(5);;
        studentNestedTest5.setRollNo(1);
        studentNestedTest5.setName("Bhaskar");
        studentNestedTest5.setRollNo(1);

        bufferStudent.add(studentNestedTest1);
        bufferStudent.add(studentNestedTest2);
        bufferStudent.add(studentNestedTest3);
        bufferStudent.add(studentNestedTest4);
        bufferStudent.add(studentNestedTest5);


        BufferIterator iterator = bufferStudent.iterator();
        BufferIterator iterator2 = bufferStudent.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getId());
        }
        bufferStudent.deleteFirst();
        bufferStudent.deleteFirst();
        bufferStudent.deleteFirst();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next().getId());
        }

    }
}
