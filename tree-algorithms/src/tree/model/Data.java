package tree.model;

public class Data<T> {
	private T key;
	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}
