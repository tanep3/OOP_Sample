package chap07.sample;

public abstract class Syokuhin {

	/*
	 * 食品クラス
	 */

	//フィールド（属性）
	protected String hinmei;
	protected int temperature;

	//メソッド（振る舞い）
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "[" + hinmei + "]の温度は " + temperature + " 度です。";
	}

}
