import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		this.students = new Student[length]; // Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		this.students = new Student[length]; // Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		this.students = new Student[length]; // Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		this.students = new Student[length]; // Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		this.students = new Student[length]; // Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		this.students = new Student[length]; // Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		this.students = new Student[length]; // Add your implementation here
	}

	@Override
	public void remove(int index) {
		this.students = new Student[length]; // Add your implementation here
	}

	@Override
	public void remove(Student student) {
		this.students = new Student[length]; // Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		this.students = new Student[length]; // Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		this.students = new Student[length]; // Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		this.students = new Student[length]; // Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		this.students = new Student[length]; // Add your implementation here
	}

	@Override
	public void bubbleSort() {
		this.students = new Student[length]; // Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		this.students = new Student[length];// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		this.students = new Student[length]; // Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		this.students = new Student[length]; // Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		this.students = new Student[length]; // Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		this.students = new Student[length]; // Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		this.students = new Student[length]; // Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		this.students = new Student[length]; // Add your implementation here
		return null;
	}
}
