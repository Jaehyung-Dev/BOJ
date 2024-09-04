import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {
            int c = Integer.parseInt(br.readLine()); // 테스트 케이스 수
            double[] avgArr = new double[c]; // 결과 저장할 배열
            
            for (int i = 0; i < c; i++) {
                String[] input = br.readLine().split(" "); // 한 줄의 입력을 공백으로 분리
                int j = Integer.parseInt(input[0]); // 학생 수
                int[] tempArr = new int[j];
                double avg = 0;
                double cnt = 0;
                
                for (int k = 0; k < j; k++) {
                    tempArr[k] = Integer.parseInt(input[k + 1]); // 학생의 점수 저장
                    avg += tempArr[k]; // 점수 합계
                }
                avg /= j; // 평균 계산
                
                for (int k = 0; k < j; k++) {
                    if (tempArr[k] > avg) {
                        cnt++; // 평균을 넘는 학생 수 계산
                    }        
                }
                double d = (cnt / j) * 100; // 백분율 계산
                avgArr[i] = d; // 결과 배열에 저장
            }
            
            for (double d : avgArr) {
                bw.write(String.format("%.3f%%\n", d)); // 결과 출력 (소수점 3자리)
            }
            
            bw.flush();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}