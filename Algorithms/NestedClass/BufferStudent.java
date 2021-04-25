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

    class BufferIteratorImpl implements BufferIterator {

        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < students.length;
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
        studentNestedTest2.setId(1);;
        studentNestedTest2.setRollNo(1);
        studentNestedTest2.setName("Bhaskar");
        studentNestedTest2.setRollNo(1);

        StudentNestedTest studentNestedTest3 = new StudentNestedTest();
        studentNestedTest3.setId(1);;
        studentNestedTest3.setName("Bhaskar");
        studentNestedTest3.setRollNo(1);
        studentNestedTest3.setRollNo(1);

        StudentNestedTest studentNestedTest4 = new StudentNestedTest();
        studentNestedTest4.setId(1);;
        studentNestedTest4.setRollNo(1);
        studentNestedTest4.setName("Bhaskar");
        studentNestedTest4.setRollNo(1);

        StudentNestedTest studentNestedTest5 = new StudentNestedTest();
        studentNestedTest5.setId(1);;
        studentNestedTest5.setRollNo(1);
        studentNestedTest5.setName("Bhaskar");
        studentNestedTest5.setRollNo(1);

        bufferStudent.add(studentNestedTest1);
        bufferStudent.add(studentNestedTest2);
        bufferStudent.add(studentNestedTest3);
        bufferStudent.add(studentNestedTest4);
        bufferStudent.add(studentNestedTest5);


        BufferIterator iterator = bufferStudent.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().getId());
        }

    }
}
