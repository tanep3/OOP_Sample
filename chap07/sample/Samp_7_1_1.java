package chap07.sample;

public class Samp_7_1_1 {

	public static void main(String[] args) {

		Syokuhin curry = new Curry();
		Syokuhin nikuman = new Nikuman();

		Denshirenji denshirenji = new Denshirenji();

		//調理前の食品の温度を測ります。
		System.out.println(curry);
		System.out.println(nikuman);

		//ここから調理をはじめます。
		//電子レンジに食品を入れます
		denshirenji.setSyokuhin(curry);
		//電子レンジを実行します
		denshirenji.execution();

		//温めた後の温度を測ります。
		System.out.println(curry);
		System.out.println(nikuman);

	}

}
