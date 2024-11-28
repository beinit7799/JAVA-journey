package Java_Collection;

public class Dog {
	
	String DogName;
	String breed;
	String age;

	public String getDogName() {
		return DogName;
	}

	public void setDogName(String dogName) {
		DogName = dogName;
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String toString() {
		return "Dog=>[ Name ="+DogName+"Breed="+breed+"Age="+age+"]";
	}

}
