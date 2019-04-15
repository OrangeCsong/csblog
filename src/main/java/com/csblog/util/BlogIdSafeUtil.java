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

    public static void main(String[] args) {
        int bId = 0;
        for (int i = 1; i <= 12555; i++) {
            if ((Integer.parseInt(Integer.toOctalString(i)) * i) == 12555) {
                bId = i;
                break;
            }
        }
        System.out.println(bId);
    }
}
