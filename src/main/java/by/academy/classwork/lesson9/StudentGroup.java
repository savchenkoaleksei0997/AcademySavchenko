package by.academy.classwork.lesson9;

public class StudentGroup {



    private Student[] students;
    private int size;

    public StudentGroup(){
        super();
        this.students = new Student[10];
    }

    public StudentGroup(int capacity){
        super();
        this.students = new Student[capacity];
    }

    public int size (){
        return size;
    }

//    public Student get(int index){
//
//    }

    public void remove(int index){
        if (size == 0 || index > students.length){
            System.err.println("Index of bound exception");
            return;
        }
        System.arraycopy(students, index + 1, students, index, (size - index));
        students[--size] = null;
    }

    public void add(Student student){
        if (size + 1 == students.length) {
            grow();
        }
        students[size++] = student;
    }

    public void add(int index ,Student student){
        if (index > students.length){
            System.err.println("Index of bound exception");
            return;
        }
        if (size + 1 == students.length) {
            grow();
        }
        System.arraycopy(students, index, students, index + 1, (size - index));
        students[index] = student;
        size++;
//        students[size++] = student;
    }

    private void grow(){
        Student[] newStudent = new Student[students.length * 2 + 1];
        System.arraycopy(students, 0, newStudent, 0, students.length);
        students = newStudent;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
