
public class ifbunouyou {

	public static void main(String[] args) {
		// ネスト
		//if文の中にif文を書くこと(入れ子)
		
		//もしaが１０より大きい場合で
		//かつaが３０未満の場合、Ａと表示する
		int a = 20;
		if (a > 10) {
			if (a > 30) {
				System.out.println("A");
			}
		}
		
		int a3 = 50;
		if (a3 > 10) {
			if (a3 > 30) {
				System.out.println("A");
			}
		}
		
		//もしa2が３より大きい場合
		//かつa2が１０未満の場合、Ａと表示する
		int a2 = 7;
		if (a2 > 3) {
			if (a2 < 10) {
				System.out.println ("A");
			}
		}
		
		//if + else + ネストの組み合わせ
		//もしｂが０より大きいとき
		//ｂが２と等しければＡと表示
		//そうでない場合で３と等しいときＢと表示
		//それ以外はＣと表示する
		int b = 10;
		if (b > 0) {
			if (b ==2) {
				System.out.println("A");
			} else if (b == 3) {
				System.out.println("B");
			} else {
				System.out.println("C");
			}
		} 
		
		int c = 2;
		if (c > 0) {
			if (c ==2) {
				System.out.println("A");
			} else if (c == 3) {
				System.out.println("B");
			} else {
				System.out.println("C");
			}
		}
		
		//もしnumberが１００以下の時
		//numberが２０以下の場合未成年と表示
		//そうでない場合で７７の時は喜寿、
		//８８の時は米寿と表示
		//それ以外は成人と表示
		int number = 88;
		if (number <= 100) {
			if (number < 20) {
				System.out.println("未成年");
			} else if (number == 77) {
				System.out.println("喜寿");
			} else if (number == 88) {
				System.out.println("米寿");
			} else {
				System.out.println("成人");
			}
		}
	}

}
