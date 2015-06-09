package ramda.logic;

import java.util.Arrays;
import java.util.List;

import ramda.interfaces.Ramda;

public class RamdaCalc {
	
	private int num = 0;
	
	public RamdaCalc(int x) {
		this.num = x;
	}
	
	public void getNum() {
		String[] values = { "1001", "1002", String.valueOf(num) };
		List<String> list = Arrays.asList(values);
		list.stream().filter(e -> e.startsWith("1002")).forEach(e -> System.out.println(e));
	}
	
	public void addNum() {
		// setNumber(int)の定義をして、オブジェクト返している
		// 尚、インターフェースにオーバーロードしているメソッドがある場合
		// ラムダ式は使えない。
		Ramda ram = (int x) -> {return this.num + x;};
		
		// 
		System.out.println(ram.setNumber(1000));
	}
}
