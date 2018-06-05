package chap07.ex;

public abstract class Syohin {

	/*
	 * 商品クラス
	 */

	//フィールド（属性）
	protected String hinmei;   //品名
	private int temperature;   //商品の温度

	//メソッド（振る舞い、操作）
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "[" + hinmei + ":" + temperature + "度]";
	}

}
