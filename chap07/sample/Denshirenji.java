package chap07.sample;

public class Denshirenji {

	/*
	 * 電子レンジクラス
	 * 食品を温める機能を持つ
	 */

	//フィールド（属性）
	private Syokuhin syokuhin;

	//メソッド（振る舞い）
	//電子レンジに食品を入れる
	public void setSyokuhin(Syokuhin syokuhin) {
		this.syokuhin = syokuhin;
	}

	//電子レンジを実行する
	public void execution() {
		System.out.println("電子レンジで温めています");
		syokuhin.setTemperature(80);
	}

}
