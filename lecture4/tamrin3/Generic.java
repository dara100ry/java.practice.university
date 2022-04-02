package tamrin3;

public class Generic <first,second,third> {
    private first name;
    private second studentId;
    private third fatherName;

    public first getName() {
        return this.name;
    }

    public void setName(first name) {
        this.name = name;
    }

    public second getStudentId() {
        return this.studentId;
    }

    public void setStudentId(second studentId) {
        this.studentId = studentId;
    }

    public third getFatherName() {
        return this.fatherName;
    }

    public void setFatherName(third fatherName) {
        this.fatherName = fatherName;
    }

}
