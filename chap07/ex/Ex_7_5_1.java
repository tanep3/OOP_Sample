package chap07.ex;

public class Ex_7_5_1 {

	public static void main(String[] args) {

		//商品のインスタンス化
		Syohin coffee = new Coffee();
		Syohin orangeJuice = new OrangeJuice();

		//自販機の設置
		Jihanki jihanki = new Jihanki(coffee, orangeJuice);


		//ここからお客さんが自販機で買う動作
		//お金を100円投入する
		jihanki.addCoin(100);
		//コーヒーのボタン（ボタン0）を押す
		jihanki.pushButton(0);
		//お金をさらに100円投入する
		jihanki.addCoin(100);
		//再びコーヒーのボタン（ボタン0）を押す
		jihanki.pushButton(0);
	}

}
