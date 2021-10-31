public class Subject {
private long subjectId;
private String name;
public long getSubjectId() {
    return subjectId;
}
public void setSubjectId(long subjectId) {
    this.subjectId = subjectId;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
@Override
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Subject subject = (Subject) o;
    if (subject != subject.subjectId) return false;
    return name != null ? name.equals(subject.name) : subject.name == null;
}
}
