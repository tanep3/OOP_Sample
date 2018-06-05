package chap07.ex;

public class Jihanki {

	/*
	 * 自販機クラス
	 */

	//フィールド（属性）
	private Syohin[] syohins;  //商品
	private int coin;          //投入された金額
	private final int PRICE = 150;  //商品の価格

	//コンストラクタで初期化する
	public Jihanki(Syohin syohin1, Syohin syohin2) {

		//商品を自販機にセット
		syohins = new Syohin[2];
		syohins[0] = syohin1;
		syohins[1] = syohin2;

		//商品を温めたり、冷やしたりする
		syohins[0].setTemperature(60);
		syohins[1].setTemperature(5);

		coin = 0;
	}

	//メソッド（振る舞い、操作）
	//お金を投入する
	public void addCoin(int coin) {
		this.coin += coin;
	}

	//商品を買うボタンを押す
	public void pushButton(int bt) {
		//エラーチェック
		if(bt<0 || bt>=syohins.length) {
			return;
		}

		//投入金額の確認
		if(coin <= PRICE) {
			System.out.println("お金が" + (PRICE - coin) + "円足りません。");
			return;
		}

		//商品とおつりを出力
		System.out.println(syohins[bt] + "をお買い上げいただきました。");
		System.out.println("おつりは" + (coin - PRICE) + "円です。");
		coin = 0;
	}
}
