package de.metro.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		//System.out.println(solution(new int[]{1,1,0,1,0,0}));
		System.out.println(solution(new int[]{1,1}));
	}

	public static int solution(int[] A) {
		int n = A.length;
		int result = 0;
		for (int i = 0; i < n - 1; i++) {
			if (A[i] == A[i + 1])
				result = result + 1;
		}
		int r = 0;
		//if(n > 1)
		//	r = -1;
		for (int i = 1; i < n-1; i++) {
			int count = 0;
			if (A[i - 1] != A[i])
				count = count + 1;
			else
				count = count - 1;
			if (A[i] != A[i + 1])
				count = count + 1;
			else
				count = count - 1;
			r = Math.max(r, count);
		}
		return result + r;
	}
}

