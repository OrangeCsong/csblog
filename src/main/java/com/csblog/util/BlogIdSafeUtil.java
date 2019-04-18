package com.csblog.util;

public class BlogIdSafeUtil {
	
	public static Integer BlogIdToSafe(Integer id){
		int bId=0;
		for(int i=1;i<=id;i++){
			if((Integer.parseInt(Integer.toOctalString(i))*i)==id){
				bId=i;
				break;
			}
		}
		return bId;
	}

    public static  String toJinzhi(int n, int num) {
        // n 表示目标进制, num 要转换的值
        String str = "";
        int yushu;      // 保存余数
        int shang = num;      // 保存商
        while (shang > 0) {
            yushu = shang % n;
            shang = shang / n;
            // 10-15 -> a-f
            if (yushu > 9) {
                str = (char) ('a' + (yushu - 10)) + str;
            } else {
                str = yushu + str;
            }
        }
        return str;
    }


    public static void main(String[] args) {
        int bId = 0;
        for (int i = 1; i <= 11049; i++) {
            if ((Integer.parseInt(Integer.toOctalString(i)) * i) == 11049) {
                bId = i;
                break;
            }
        }
        System.out.println(bId);

        String s = toJinzhi(8, 10);
        System.out.println(s);
    }
}
