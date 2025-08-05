package condition;

public class ConditionEx5 {
    public static void main(String[] args) {
        String grade = "A";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("좋은 성과입니다!");
                break;
            default:
                System.out.println("잘못된 학점입니다.");

        }
    }
}
