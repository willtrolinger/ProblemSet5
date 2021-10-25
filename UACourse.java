public class UACourse {

	private int courseId;

	private String courseName;

	private String courseDescription;

	private UACourse next;

	private UACourse prev;

	private int accessCount;

	public int getCourseId() {

		return courseId;

	}

	public void setCourseId(int courseId) {

		this.courseId = courseId;

	}

	public String getCourseName() {

		return courseName;

	}

	public void setCourseName(String courseName) {

		this.courseName = courseName;

	}

	public String getCourseDescription() {

		return courseDescription;

	}

	public void setCourseDescription(String courseDescription) {

		this.courseDescription = courseDescription;

	}

	public UACourse getNext() {

		return next;

	}

	public void setNext(UACourse next) {

		this.next = next;

	}

	public UACourse getPrev() {

		return prev;

	}

	public void setPrev(UACourse prev) {

		this.prev = prev;

	}

	public int getAccessCount() {

		return accessCount;

	}

	public void setAccessCount(int accessCount) {

		this.accessCount = accessCount;

	}

	public UACourse() {

	}

	public UACourse(int courseId, String courseName, String courseDescription) {

		this.courseId = courseId;

		this.courseName = courseName;

		this.courseDescription = courseDescription;

	}

	public String toString() {

		return String.format("%8f, %15s,%5f", courseId, courseName, accessCount);

	}

}