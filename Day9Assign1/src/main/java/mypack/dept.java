package mypack;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class dept 
{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int deptno;
private String dname;
private String loc;
public int getDeptno() {
	return deptno;
}
public void setDeptno(int deptno) {
	this.deptno = deptno;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
@Override
public String toString() {
	return deptno+" "+dname+" "+loc+" ";
}

}
