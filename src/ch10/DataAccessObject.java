package ch10;

public interface DataAccessObject {

	//추상메소드가 기본

	public abstract void select();
	void insert();
	void update();
	void delete();
}
