package aula03.ex1;
import aula01.ex2.Date;

public class Ex1 {

	public static void main(String[] args) {
		Student est = new Student ("Andreia", 9855678, new Date(18, 7, 1974));
		ScholarshipHolder bls = new ScholarshipHolder ("Maria", 8976543, new Date(11, 5, 1976));
		bls.setValue(745);

		System.out.println("Estudante:" + est.getName()); System.out.println(est);
		System.out.println("Bolseiro:" + bls.getName() + ", NMec: " + bls.getNMec() +",Bolsa:"+ bls.getValue());
		System.out.println(bls);
	}

}
